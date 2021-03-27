package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите количество этажей в здании:");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        if (count >= 1 && count <= 4) {
            System.out.println("Малоэтажный дом");
        } else if (count >= 5 && count <= 8) {
            System.out.println("Среднеэтажный дом");
        } else if (count > 9) {
            System.out.println("Многоэтажный дом");
        } else {
            System.out.println("Ошибка ввода");
        }
    }
}
