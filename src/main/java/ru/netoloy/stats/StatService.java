package ru.netoloy.stats;

public class StatService {

    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int calculateMiddle(int[] sales) {
        return calculateSum(sales) / sales.length;
    }
    public int maxSales(int[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

        public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }
    public int calculateAmountBelow(int[] sales) {
        int amount = 0;
        int averageSale = calculateMiddle(sales);
        for (int sale : sales) {
            if (sale < averageSale) {
                amount++;
            }
        }
        return amount;
    }
    public int calculateAmountHigher(int[] sales) {
        int amount = 0;
        int averageSale = calculateMiddle(sales);
        for (int sale : sales) {
            if (sale > averageSale) {
                amount++;
            }
        }
        return amount;
    }








}
