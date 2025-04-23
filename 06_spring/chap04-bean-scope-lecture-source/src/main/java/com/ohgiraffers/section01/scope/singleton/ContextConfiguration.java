package com.ohgiraffers.section01.scope.singleton;

import com.ohgiraffers.common.Beverage;
import com.ohgiraffers.common.Bread;
import com.ohgiraffers.common.Product;
import com.ohgiraffers.common.ShoppingCart;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ContextConfiguration {

    @Bean
    public Product carpBread() {
        return new Bread("붕어빵", 1000, new java.util.Date());
    }

    @Bean
    public Product milk() {
        return new Beverage("딸기우유",1500,500);
    }

    @Bean
    public Product water() {
        return new Beverage("지리산암반수", 3000, 1500);
    }

    @Bean
//    @Scope("singleton")
    @Scope("prototype")     // 카트를 각 새롭게 부여해준다. 싱글톤이 아니게 설정한셈.
    //bean 스코프를 수정하게 되면 bean 객체의 life cycle을 다른 주가로 가져갈 수 있다
    public ShoppingCart cart() {
        return new ShoppingCart();
    }
}
