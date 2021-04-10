package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[][] matrice = new int[12][8];
        Random random = new Random();

        int maxSumOfNumbers = 0;
        int bufSumOfNumbers = 0;
        int rowIndex = 0;

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 8; j++) {
                matrice[i][j] = random.nextInt(51);
                bufSumOfNumbers += matrice[i][j];

                System.out.print(matrice[i][j] + " ");
            }
            if (bufSumOfNumbers >= maxSumOfNumbers) {
                maxSumOfNumbers = bufSumOfNumbers;
                rowIndex = i;
            }
            System.out.print(" Сумма: " + bufSumOfNumbers);
            bufSumOfNumbers = 0;
            System.out.println();
        }

        System.out.println("");
        System.out.println("Индекс строки, сумма чисел в которой максимальна: " + rowIndex);


    }
}
