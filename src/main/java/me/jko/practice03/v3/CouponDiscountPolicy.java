package me.jko.practice03.v3;

class CouponDiscountPolicy implements DiscountPolicy {

    @Override
    public int discountRate(OrderContext context) {
        return context.coupon() ? 5 : 0;
    }
}