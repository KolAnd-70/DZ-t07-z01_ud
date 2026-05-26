package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatisticsServiceTest {

    @Test
    pablic

    void testSam() {
        Long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatisticsService service = new StatisticsService();

        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        long actual = service.samSales(sales);
        Assertions.assertEquals(expected, actual);
    }
}
