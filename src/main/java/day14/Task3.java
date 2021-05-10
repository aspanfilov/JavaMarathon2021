package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        List<Human> people = parseFileToObjList();
        System.out.println(people.toString());
    }

    public static List<Human> parseFileToObjList() {
        String path = "C:\\Java\\Projects\\Алишев\\JavaMarathon2021\\src\\main\\java\\day14\\People.txt";
        File file = new File(path);
        List<Human> people = new ArrayList<>();

        try {
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String[] humanData = sc.nextLine().split(" ");

                if (Integer.parseInt(humanData[1]) < 0) {
                    throw new IllegalArgumentException();
                }

                people.add(new Human(humanData[0], Integer.parseInt(humanData[1])));
            }
            sc.close();
            return people;

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }

        return new ArrayList<Human>();
    }
}
