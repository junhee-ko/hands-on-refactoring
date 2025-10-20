package me.jko.practice03.v3;

import java.util.List;

public class OrderService {

    private final List<DiscountPolicy> policies = List.of(
            new VipDiscountPolicy(),
            new CouponDiscountPolicy()
    );

    public int calculatePrice(OrderContext context) {
        int totalDiscount = policies.stream()
                .mapToInt(policy -> policy.discountRate(context))
                .sum();

        int total = context.price() * (100 - totalDiscount) / 100;

        return Math.max(total, 0);
    }
}
