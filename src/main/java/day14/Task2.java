package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        List<String> people = parseFileToStringList();
        System.out.println(people);

//        try {
//            String[] people = parseFileToStringList();
//            System.out.println(people);
//        } catch (FileNotFoundException e) {
//            System.out.println("Файла не найден");
//        } catch (IllegalArgumentException e) {
//            System.out.println("Некорректный входной файл");
//        }

    }


    public static List<String> parseFileToStringList() {

        String path = "C:\\Java\\Projects\\Алишев\\JavaMarathon2021\\src\\main\\java\\day14\\People.txt";
        File file = new File(path);
        List<String> people = new ArrayList<>();

        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                if (Integer.parseInt(line.split(" ")[1]) < 0) {
                    throw new IllegalArgumentException();
                }
                people.add(line);
            }
            return people;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }

        return new ArrayList<>();
    }

//    public static String[] parseFileToStringList() throws FileNotFoundException, IllegalArgumentException {
//
//        String[] people = new String[4];
//
//        String path = "C:\\Java\\Projects\\Алишев\\JavaMarathon2021\\src\\main\\java\\day14\\People.txt";
////        File file = new File("People.txt");
//        File file = new File(path);
//
//        Scanner sc = new Scanner(file);
//        int i = 0;
//        String line = null;
//
//        while (sc.hasNextLine()) {
//            line = sc.nextLine();
//            if (Integer.parseInt(line.split(" ")[1]) < 0) {
//                throw new IllegalArgumentException();
//            }
//            people[i++] = line;
//        }
//
//        return people;
//    }
}
