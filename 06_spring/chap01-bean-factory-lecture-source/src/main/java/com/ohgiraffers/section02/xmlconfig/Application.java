package com.ohgiraffers.section02.xmlconfig;

import com.ohgiraffers.common.MemberDTO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context =
                new GenericXmlApplicationContext("section02/xmlconfig/spring-context.xml");

        /* 설명. 컨테이너에 들어있는 모든 bean의 이름(id)을 확인*/
        String[] beanNames = context.getBeanDefinitionNames();
        for (String beanName : beanNames) {
            System.out.println("beanName = " + beanName);
        }

            // 이런  방법이 있구나 개념만 챙기기  나중에 안씀
        /* 설명. 1. bean의 id를 가지고 컨테이너에서 추출*/
//        MemberDTO member = (MemberDTO) context.getBean("member");

        /* 설명. 2. bean의 클래스의 메타 정보(bean의 타입)를 전달하여 추출 */
//        MemberDTO member = context.getBean(MemberDTO.class);
//        타입을 설정하여 출력할 수도 있다.

        /* 설명. 3. bean의 id와 클래스의 메타 정보를 전달하여 추출 */
        MemberDTO member = context.getBean(MemberDTO.class);

                System.out.println("member = " + member);
    }
}
