package day8;

public class Task1 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String string = new String();
        for (int i = 0; i < 20000; i++) {
            string = string + i + " ";
        }
        long finish = System.currentTimeMillis();
        System.out.println("Сцепление строк: " + (finish-start));

        start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 20000; i++) {
            sb.append(i).append(" ");
        }
        finish = System.currentTimeMillis();
        System.out.println("StringBuilder: " + (finish-start));
    }
}
