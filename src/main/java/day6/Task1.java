package day6;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setYear(2020);
        car1.setColor("Black");
        car1.setModel("Audi");
        car1.info();

        Motorbike bike1 = new Motorbike(1986, "Green", "Kawasaki");
        bike1.info();

        System.out.print("Введите год:");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int yearDifference = car1.yearDifference(year);
        System.out.print("Пробег от внесенного года: " + yearDifference);



    }
}
