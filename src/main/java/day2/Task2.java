package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Введие числа a и b:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if (a >= b) {
            System.out.println("Некорректный ввод");
        }

        for (int i = a+1; i <= b-1; i++){
            int count = i;
            if ((count % 5 == 0) && (count % 10 != 0)) {
                System.out.print(count + " ");
            }
        }
    }
}
