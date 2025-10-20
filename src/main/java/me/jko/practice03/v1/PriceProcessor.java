package me.jko.practice03.v1;

public class PriceProcessor {

    public int calc(int price, String grade, boolean coupon) {

        int discount = 0;

        if ("VIP".equals(grade)) {
            discount += 20;
        } else if ("GOLD".equals(grade)) {
            discount += 10;
        }

        if (coupon) {
            discount += 5;
        }

        int total = price * (100 - discount) / 100;

        if (total < 0) {
            total = 0;
        }

        return total;
    }
}
