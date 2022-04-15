package ru.netoloy.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatServiceTest {

    @Test
    void shouldCalculateSum() {
        StatService service = new StatService();
    int[] sals = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    int expected  = 180;
    int act = service.calculateSum(sale);

    }
}