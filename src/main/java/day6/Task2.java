package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane plane1 = new Airplane("SU", 2012, 20, 5300);
        plane1.setYear(1999);
        plane1.setLength(24);
        plane1.fillup(55);
        plane1.fillup(10);
        plane1.info();
    }
}
