package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b;

        for (int i = 0; i < 5; i++) {
            System.out.println("Введите делимое и делитель:");
            a = scanner.nextDouble();
            b = scanner.nextDouble();

            if (b == 0) {
                System.out.println("Деление на ноль");
                continue;
            }

            System.out.println(a/b);
        }

    }
}
