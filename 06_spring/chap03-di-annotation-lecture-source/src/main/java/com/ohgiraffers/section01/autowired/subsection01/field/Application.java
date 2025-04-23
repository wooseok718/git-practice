package com.ohgiraffers.section01.autowired.subsection01.field;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {

        /* 설명. ComponentScan 개념의 basePackage 문자열을 넣으면 ""~~ 이거<< 따로 설정파일없이 ComponentScan가 적용이된다*/
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.ohgiraffers.section01");

//        System.out.println(context.getBean("bookService"));      // context.getBean은 꺼내는 기능? 검색ㄱㄱ

        BookService bookService = context.getBean(BookService.class);

        /* 설명. List<bookDTO>가 반환되어 오면 stream 문법을 순화하며 확인 */
        bookService.findAllBook().stream().forEach(System.out::println);


        /* 설명. 도서 번호로 검색 후 출력 확인 */
        System.out.println("1번 책: " + bookService.findBookBySequence(1));
        System.out.println("2번 책: " + bookService.findBookBySequence(2));
    }
}
