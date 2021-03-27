package day4;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        var moreThenEight = 0;
        var equalOne = 0;
        var countEven = 0;
        var countOdd = 0;
        var sum = 0;

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {

            array[i] = random.nextInt(11);

            if (array[i] > 8) moreThenEight++;
            if (array[i] == 1) equalOne++;
            if (array[i] % 2 == 0)
                countEven++;
            else
                countOdd++;

            sum += array[i];

            System.out.print(array[i] + " ");
        }

        System.out.println();
        System.out.println("Длина массива: " + array.length);
        System.out.println("Количество чисел больше 8: " + moreThenEight);
        System.out.println("Количество чисел равных 1: " + equalOne);
        System.out.println("Количество четных чисел: " + countEven);
        System.out.println("Количество нечетных чисел: " + countOdd);
        System.out.println("Сумма всех элементов массива: " + sum);


    }
}
