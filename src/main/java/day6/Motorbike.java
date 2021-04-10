package day6;

public class Motorbike {
    private int year;
    private String color;
    private String model;

    public Motorbike(int year, String color, String model) {
        this.year = year;
        this.color = color;
        this.model = model;
    }
    public Motorbike() {
        this.year = 0;
        this.color = "";
        this.model = "";
    }

    public int getYear() {
        return this.year;
    }
    public String getColor() {
        return this.color;
    }
    public String getModel() {
        return this.model;
    }

    public void info() {
        System.out.println("Это мотоцикл");
    }
    public int yearDifference(int year) {
        return year - this.year;
    }
}
