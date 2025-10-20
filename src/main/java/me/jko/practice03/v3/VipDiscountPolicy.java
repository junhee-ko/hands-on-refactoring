package me.jko.practice03.v3;

class VipDiscountPolicy implements DiscountPolicy {

    @Override
    public int discountRate(OrderContext context) {
        if ("VIP".equals(context.grade())) return 20;
        if ("GOLD".equals(context.grade())) return 10;
        return 0;
    }
}