
package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    private CashbackHackService cashbackHackService = new CashbackHackService();

    @Test
    public void underThousand() {
        assertEquals(cashbackHackService.remain(100),900 );
    }

    @Test
    public void aboveThousand() {
        assertEquals(cashbackHackService.remain(100), 5900);
    }

    @Test
    public void checkThousand() {
        assertEquals(cashbackHackService.remain(0), 1000);
    }
}
