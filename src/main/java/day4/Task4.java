package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[100];
        int bufSumOfThree = 0;
        int maxSumOfThree = 0;
        int indexOfFirst = 0;

        for (int i = 0; i < 100; i++) {
            array[i] = random.nextInt(10001);
            System.out.print(i + ":" + array[i] + " ");

            if (i > 1) {
                bufSumOfThree = array[i] + array[i-1] + array[i-2];
            }
            if (bufSumOfThree > maxSumOfThree) {
                maxSumOfThree = bufSumOfThree;
                indexOfFirst = i-2;
            }
        }
        System.out.println();
        System.out.println(maxSumOfThree);
        System.out.println(indexOfFirst);

    }
}
