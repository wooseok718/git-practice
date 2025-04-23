package com.ohgiraffers.section01.autowired.subsection03.constructor;

import com.ohgiraffers.section01.autowired.subsection02.setter.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.ohgiraffers.section01");

        BookService bookService = context.getBean("bookServiceConstrucotr",BookService.class);
        bookService.findAllBook().forEach(System.out::println);
        System.out.println("2번 책: " + bookService.findBookBySequence(1));
        // 빈의 이름이 겹쳐서 오류가 나기 때문에 중복을 없애줌

            }
}
