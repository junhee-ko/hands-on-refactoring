package me.jko.practice03.v2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PriceCalculatorTest {

    @Test
    void VIP와_쿠폰을_적용하면_25퍼센트_할인된다() {
        // given
        PriceCalculator calculator = new PriceCalculator();

        // when
        int actual = calculator.calc(1000, "VIP", true);

        // then
        int expected = 750;
        assertEquals(expected, actual);
    }

    @Test
    void VIP만_적용하면_20퍼센트_할인된다() {
        // given
        PriceCalculator calculator = new PriceCalculator();

        // when
        int actual = calculator.calc(1000, "VIP", false);

        // then
        int expected = 800;
        assertEquals(expected, actual);
    }

    @Test
    void GOLD와_쿠폰을_적용하면_15퍼센트_할인된다() {
        // given
        PriceCalculator calculator = new PriceCalculator();

        // when
        int actual = calculator.calc(1000, "GOLD", true);

        // then
        int expected = 850;
        assertEquals(expected, actual);
    }

    @Test
    void GOLD만_적용하면_10퍼센트_할인된다() {
        // given
        PriceCalculator calculator = new PriceCalculator();

        // when
        int actual = calculator.calc(1000, "GOLD", false);

        // then
        int expected = 900;
        assertEquals(expected, actual);
    }

    @Test
    void NORMAL에_쿠폰만_적용하면_5퍼센트_할인된다() {
        // given
        PriceCalculator calculator = new PriceCalculator();

        // when
        int actual = calculator.calc(1000, "NORMAL", true);

        // then
        int expected = 950;
        assertEquals(expected, actual);
    }

    @Test
    void NORMAL이고_쿠폰이_없으면_할인되지_않는다() {
        // given
        PriceCalculator calculator = new PriceCalculator();

        // when
        int actual = calculator.calc(1000, "NORMAL", false);

        // then
        int expected = 1000;
        assertEquals(expected, actual);
    }

    @Test
    void 음수_가격이면_결과는_0이다() {
        // given
        PriceCalculator calculator = new PriceCalculator();

        // when
        int actual = calculator.calc(-500, "VIP", true);

        // then
        int expected = 0;
        assertEquals(expected, actual);
    }
}