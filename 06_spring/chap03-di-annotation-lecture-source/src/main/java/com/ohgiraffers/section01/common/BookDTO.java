package com.ohgiraffers.section01.common;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class BookDTO {      // 기능 추가하기 위한 클래스
    private int sequence;
    private int isbn;
    private String title;
    private String author;
    private String publisher;
    private java.util.Date createdDate;
}
