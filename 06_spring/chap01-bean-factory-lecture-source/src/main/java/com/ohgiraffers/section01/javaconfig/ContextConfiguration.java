package com.ohgiraffers.section01.javaconfig;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration("config1")      // 컨테이너에 이 콩을 넣겠다는 어노테이션
public class ContextConfiguration {

    @Bean("member") // 이름 바꿀 수 있음       //그 안에 있는 콩
    public MemberDTO getMember(){
        return new MemberDTO(1,"user01","pass01","홍길동");
    }
}
