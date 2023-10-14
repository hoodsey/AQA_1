package ru.netology.service;

import static org.testng.AssertJUnit.*;

import org.testng.annotations.Test;


class CashbackHackServiceTest {
    @Test
    public void shouldCalculateCashback() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(actual, expected);

    }

    @Test
    public void shouldNotCalculate() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);

    }
}