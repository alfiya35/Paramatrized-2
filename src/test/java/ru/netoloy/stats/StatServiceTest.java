package ru.netoloy.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatServiceTest {

    @Test
    void shouldCalculateSum() {
        StatService service = new StatService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.calculateSum(sales);
        assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateMiddleSum() {
        StatService service = new StatService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.calculateMiddle(sales);
        assertEquals(expected, actual);

    }

    @Test
    void shouldMaxSales() {
        StatService service = new StatService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.maxSales(sales);
        assertEquals(expected, actual);

    }

    @Test
    void shouldMinSales() {
        StatService service = new StatService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.minSales(sales);
        assertEquals(expected, actual);

    }

    @Test
    void shouldCalculateAmountBelow() {
        StatService service = new StatService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.calculateAmountBelow(sales);
        assertEquals(expected, actual);

    }
    @Test
    void shouldCalculateAmountHigher() {
        StatService service = new StatService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.calculateAmountHigher(sales);
        assertEquals(expected, actual);
    }
}