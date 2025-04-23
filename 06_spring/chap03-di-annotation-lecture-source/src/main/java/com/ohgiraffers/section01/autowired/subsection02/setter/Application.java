package com.ohgiraffers.section01.autowired.subsection02.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.ohgiraffers.section01");

        BookService bookService = context.getBean("bookServiceSetter",BookService.class);
        // 빈의 이름이 겹쳐서 오류가 나기 때문에 중복을 없애줌

        System.out.println("bookService = " + bookService);

    }
}
