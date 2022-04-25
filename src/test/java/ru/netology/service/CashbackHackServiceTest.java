package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService cash = new CashbackHackService();

    @Test
    public void testRemainWhenAmountEqual999() {
        int actual = 1; // нужно докупить на 1 р
        int expected = cash.remain(999);
        assertEquals(actual, expected);
    }

    @Test
    public void testRemainWhenAmountEqual1000() {
        int actual = 0; // ничего докупать не нужно
        int expected = cash.remain(1000);
        assertEquals(actual, expected);
    }

    @Test
    public void testRemainWhenAmountEqual1001() {
        int actual = 999; // до тсячи докупить на 999
        int expected = cash.remain(1001);
        assertEquals(actual, expected);
    }

    @Test
    public void testRemainWhenAmountEqual1200() {
        int actual = 800; // до полной тысячи докупить на 800
        int expected = cash.remain(1200);
        assertEquals(actual, expected);
    }
}