package ru.netoloy.stats;

public class StatService {

    public int calculateSum(int[]sales){
        int sum = 0;
        for (int sale : sales){
            sum += sale;
        }
        return sum;
    }
}
