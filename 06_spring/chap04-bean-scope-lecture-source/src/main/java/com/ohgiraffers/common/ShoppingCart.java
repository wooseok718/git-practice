package com.ohgiraffers.common;

import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString
public class ShoppingCart {
    private final List<Product> items;

    public ShoppingCart() {      // 파이널은 붙으면 반드시 초기화 되어야 한다. 왜?
        this.items = new ArrayList<Product>();
    }

    /* 설명. 카트에 물품을 담는 기능 */
    public void addItem(Product item) {
        items.add(item);
    }
    /* 설명. 카트에 물품 꺼내는 기능 */
    public List<Product> getItems() {
        return items;
    }
}
