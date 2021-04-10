package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setYear(2015);
        car1.setColor("Black");
        car1.setModel("Hyundai Solaris");

        System.out.println(car1.getYear());
        System.out.println(car1.getModel());
        System.out.println(car1.getColor());

    }
}
