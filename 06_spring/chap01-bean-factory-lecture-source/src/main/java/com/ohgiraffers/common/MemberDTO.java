package com.ohgiraffers.common;

import lombok.*;

@NoArgsConstructor      // 매개변수 x
@AllArgsConstructor     // 매개변수 o
@Setter
@Getter
@ToString
public class MemberDTO {
    private int sequence;
    private String id;
    private String pwd;
    private String name;
}
