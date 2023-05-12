package ru.netology.stats;

import static java.lang.Long.sum;

public class StatService {
    public int sumSales(long[] sales) {
        long sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }

        return (int) sum;
    }

    public int avgSales(long[] sales) {
        long sum = sumSales(sales);

        return (int) sum / 12;
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
        long sum = sumSales(sales);

        int underAvg = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sum / 12) {
                underAvg = underAvg + 1;
            }
        }

        return underAvg;
    }

    public int upAvgSales(long[] sales) {
        long sum = sumSales(sales);

        int upAvg = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > sum / 12) {
                upAvg = upAvg + 1;
            }
        }

        return upAvg;
    }
}


