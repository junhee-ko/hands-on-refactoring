package me.jko.practice03.v2;

public class PriceCalculator {

    public int calc(int price, String grade, boolean coupon) {
        int discountRate = discountByGrade(grade) + discountByCoupon(coupon);

        return calculateTotal(price, discountRate);
    }

    private int discountByGrade(String grade) {
        if ("VIP".equals(grade)) {
            return 20;
        } else if ("GOLD".equals(grade)) {
            return 10;
        } else {
            return 0;
        }
    }

    private int discountByCoupon(boolean coupon) {
        return coupon ? 5 : 0;
    }

    private static int calculateTotal(int price, int discountRate) {
        int total = price * (100 - discountRate) / 100;

        return Math.max(total, 0);
    }
}
