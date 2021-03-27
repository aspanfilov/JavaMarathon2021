package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();
        int max;
        int min;
        int countZeroEnd = 0;
        int sumZeroEnd = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10001);
        }

        max = array[0];
        min = array[0];

        for (int n: array) {
            if (n > max) max = n;
            if (n < min) min = n;
            if (n % 10 == 0) {
                ++countZeroEnd;
                sumZeroEnd += n;
            }
        }

        System.out.println("Наибольший элемент массива: " + max);
        System.out.println("Наименьший элемент массива: " + min);
        System.out.println("Количество элементов массива, оканчивающихся на ноль: " + countZeroEnd);
        System.out.println("Сумма элементов массива, оканчивающихся на ноль: " + sumZeroEnd);

    }
}
