package ru.netology.stats;

public class StatService {
    public int sumSales(long[] sales) {
        long sumMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            sumMonth = sumMonth + sales[i];
        }

        return (int) sumMonth;
    }

    public int avgSales(long[] sales) {
        long sumMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            sumMonth = sumMonth + sales[i];
        }

        return (int) sumMonth / 12;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth])
                maxMonth = i;
        }

        return (int) maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int underAvgSales(long[] sales) {
        long sumMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            sumMonth = sumMonth + sales[i];
        }
        int underAvg = 0;
        long avgSales = sumMonth / 12;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < avgSales) {
                underAvg = underAvg + 1;
            }
        }

        return underAvg;
    }

    public int upAvgSales(long[] sales) {
        long sumMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            sumMonth = sumMonth + sales[i];
        }
        int upAvg = 0;
        long avgSales = sumMonth / 12;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > avgSales) {
                upAvg = upAvg + 1;
            }
        }

        return upAvg;
    }
}


