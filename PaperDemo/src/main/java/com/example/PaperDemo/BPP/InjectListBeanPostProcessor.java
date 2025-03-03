package com.example.PaperDemo.BPP;

import com.example.PaperDemo.annotations.InjectList;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.util.ReflectionUtils;

import java.beans.Introspector;
import java.util.Arrays;

@Component
public class InjectListBeanPostProcessor implements BeanPostProcessor {
    @Autowired
    private ApplicationContext context;

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        ReflectionUtils.doWithFields(bean.getClass(), field -> {
            if (field.isAnnotationPresent(InjectList.class)) {
                InjectList annotation = field.getAnnotation(InjectList.class);
                var list = Arrays.stream(annotation.value())
                        .map(aClass -> Introspector.decapitalize(aClass.getSimpleName()))
                        .map(name -> context.getBean(name))
                        .toList();

                field.setAccessible(true);
                field.set(bean, list);
            }
        });

        return bean;
    }
}
