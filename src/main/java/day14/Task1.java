package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) throws FileNotFoundException, IncorrectFileException {
        String path = "D:\\1 IT\\JAVA\\Projects\\Алишев\\JavaMarathon2021\\src\\main\\java\\day14\\Test.txt";
        File file = new File("input.txt");
//        File file = new File(path);
        printSumDigits(file);
    }

    public static void printSumDigits(File file) throws FileNotFoundException, IncorrectFileException {
        Scanner sc = null;
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
            throw new FileNotFoundException();
        }

        String line = sc.nextLine();

        String[] numbers = line.split(" ");
        if (numbers.length != 10) {
            throw new IncorrectFileException("Некорректный входной файл");
        }

        System.out.println(Arrays.toString(numbers));

        int sum = 0;
        for (String number : numbers) {
            sum += Integer.parseInt(number);
        }

        System.out.println("Сумма всех чисел равна " + sum);
    }

//    public static void printSumDigits(File file) throws FileNotFoundException, IncorrectFileException {
//        Scanner sc = null;
//        try {
//            sc = new Scanner(file);
//        } catch (FileNotFoundException e) {
//            throw new FileNotFoundException("Файл не найден");
//        }
//        String line = sc.nextLine();
//        System.out.println(line);
//
//        int sum = 0;
//        int i = 0;
//        for (String string : line.split(" ")) {
//            sum += Integer.parseInt(string);
//            i++;
//        }
//        if (i != 10) {
//            throw new IncorrectFileException("Некорректный входной файл");
//        }
//        System.out.println("Сумма всех чисел равна " + sum);
//    }
}
