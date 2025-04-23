package com.ohgiraffers.common;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@NoArgsConstructor

public class Bread extends Product{
    private java.util.Date bakedDate;       // 생산 시각

    public Bread(String name, int price, Date bakedDate) {
        super(name, price);
        this.bakedDate = bakedDate;
    }

    @Override
    public String toString() {
        return "Bread{" +
                "bakedDate=" + bakedDate +
                "} " + super.toString();
    }

}
