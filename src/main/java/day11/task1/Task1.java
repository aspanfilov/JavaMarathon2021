package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        Warehouse wh1 = new Warehouse();
        Picker picker1 = new Picker(wh1);
        Courier courier1 = new Courier(wh1);

        Warehouse wh2 = new Warehouse();
        Picker picker2 = new Picker(wh2);
        Courier courier2 = new Courier(wh2);

        System.out.println(wh1);
        System.out.println("Picker1: " + picker1.getSalary());
        System.out.println("courier1: " + courier1.getSalary());
        for (int i = 0; i < 1500; i++) {
            picker1.doWork();
            courier1.doWork();
        }

        System.out.println(wh1);
        System.out.println("Picker1: " + picker1.getSalary());
        System.out.println("courier1: " + courier1.getSalary());

        System.out.println(wh2);
        System.out.println("Picker2: " + picker2.getSalary());
        System.out.println("courier2: " + courier2.getSalary());

    }
}
