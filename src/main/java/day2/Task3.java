package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Введие 2 числа a и b:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a >= b) {
            System.out.println("Некорректный ввод");
        }

        a += 1;
        while (a < b) {
            if (a % 5 == 0 && a % 10 != 0) {
                System.out.print(a + " ");
            }
            a += 1;
        }
    }
}
