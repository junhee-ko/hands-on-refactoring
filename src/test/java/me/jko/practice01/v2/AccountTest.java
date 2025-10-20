package me.jko.practice01.v2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class AccountTest {

    @Test
    void 계좌생성_초기값_테스트() {
        // given
        Account account = new Account("홍길동", 1000);

        // when & then
        assertEquals("홍길동", account.getOwner());
        assertEquals(1000, account.getBalance());
    }

    @Test
    void 음수초기잔액_처리_테스트() {
        // given
        Account account = new Account("홍길동", -500);

        // when & then
        assertEquals(0, account.getBalance()); // 음수 초기값 -> 0
    }

    @Test
    void 입금_정상_테스트() {
        // given
        Account account = new Account("홍길동", 1000);

        // when
        account.deposit(500);

        // then
        assertEquals(1500, account.getBalance());
    }

    @Test
    void 입금_음수_무시_테스트() {
        // given
        Account account = new Account("홍길동", 1000);

        // when
        account.deposit(-200);

        // then
        assertEquals(1000, account.getBalance()); // 음수 입금 무시
    }

    @Test
    void 출금_정상_테스트() {
        // given
        Account account = new Account("홍길동", 1000);

        // when
        boolean success = account.withdraw(400);

        // then
        assertTrue(success);
        assertEquals(600, account.getBalance());
    }

    @Test
    void 출금_실패_테스트() {
        // given
        Account account = new Account("홍길동", 500);

        // when
        boolean success = account.withdraw(1000);

        // then
        assertFalse(success);
        assertEquals(500, account.getBalance()); // 잔액 그대로
    }

    @Test
    void 출금_음수_무시_테스트() {
        // given
        Account account = new Account("홍길동", 500);

        // when
        boolean success = account.withdraw(-200);

        // then
        assertFalse(success);
        assertEquals(500, account.getBalance()); // 잔액 그대로
    }
}