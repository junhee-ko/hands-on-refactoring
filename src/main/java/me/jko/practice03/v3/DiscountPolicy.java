package me.jko.practice03.v3;

interface DiscountPolicy {
    int discountRate(OrderContext context);
}