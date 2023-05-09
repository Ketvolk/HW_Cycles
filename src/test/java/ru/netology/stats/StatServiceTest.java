package ru.netology.stats;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class StatServiceTest {

    @Test
    public void testSumSales() {
        StatService service = new StatService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 180;
        int actual = (int) service.sumSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAvgSales() {
        StatService service = new StatService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 15;
        int actual = (int) service.avgSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMaxSalesMonth() {
        StatService service = new StatService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 8;
        int actual = service.maxSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMinSalesMonth() {
        StatService service = new StatService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 9;
        int actual = service.minSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testUnderAvgSales() {
        StatService service = new StatService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = (int) service.underAvgSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testUpAvgSales() {
        StatService service = new StatService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = (int) service.upAvgSales(sales);

        Assertions.assertEquals(expected, actual);
    }
}
