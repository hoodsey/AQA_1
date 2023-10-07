package ru.netology.service;

//import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.*;

import org.testng.annotations.Test;


//import static org.junit.jupiter.api.Assertions.*;

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