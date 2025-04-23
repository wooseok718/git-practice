package com.ohgiraffers.section01.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context =        // 컨테이너
                new AnnotationConfigApplicationContext(ContextConfiguration.class);

        String[] beanNames = context.getBeanDefinitionNames();  // context 컨테이너 , 상자?
        for (String beanName : beanNames) {
            System.out.println("beanName = " + beanName);       // 기본적으로 들어있는 콩이 있음
        }
    }
}
