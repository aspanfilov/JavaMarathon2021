package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane plane1 = new Airplane("SU", 2010, 250, 30000);
        Airplane plane2 = new Airplane("Boeing", 1999, 350, 50000);
        Airplane.compareAirplanes(plane1, plane2);
    }
}