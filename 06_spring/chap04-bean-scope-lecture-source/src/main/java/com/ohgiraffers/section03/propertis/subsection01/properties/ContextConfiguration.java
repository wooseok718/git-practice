package com.ohgiraffers.section03.propertis.subsection01.properties;

import com.ohgiraffers.common.Beverage;
import com.ohgiraffers.common.Bread;
import com.ohgiraffers.common.Product;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("section03/properties/subsection01/properties/product-info.properties") //외부 리소스 추가
public class ContextConfiguration {
    @Value("$bread.carpbread.name}")
    private String carpBreadName;

    @Value("${bread.carpbread.price}")
    private int carpBreadPrice;

    @Value("${beverage.milk.name}")
    private String milkName;

    @Value("${beverage.milk.price}")
    private int milkPrice;

    @Value("${beverage.milk.capacity}")
    private int milkCapacity;

    @Bean
    public Product carpBread() {
        return new Bread(carpBreadName, carpBreadPrice, new java.util.Date());
    }

    @Bean
    public Product milk() {
        return new Beverage(milkName, milkPrice, milkCapacity);
    }
    @Bean
    public Product water(@Value("${beverager.water.name}")String waterName ,
                         @Value("${beverager.water.price}") int waterPrice,
                         @Value("${beverager.water.capacity}") int waterCapacity) {
        return new Beverage(waterName, waterPrice,waterCapacity);
    }

}
