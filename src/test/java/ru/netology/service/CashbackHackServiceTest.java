
package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    private CashbackHackService cashbackHackService = new CashbackHackService();

    @Test
    public void checkWhen1() {
        assertEquals(cashbackHackService.remain(1), 999);
    }

    @Test
    public void checkWhen1000() {
        assertEquals(cashbackHackService.remain(2000), 0);
    }

    @Test
    public void checkWhenAboveThousand() {
        assertEquals(cashbackHackService.remain(1100), 900);
    }

    @Test
    public void negativeAmount() {
        assertEquals(cashbackHackService.remain(-100), 1100);
    }

}













