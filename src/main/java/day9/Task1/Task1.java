package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Олег", "Б");
        Teacher teacher = new Teacher("Игорь Яковлевич", "Физика");

        student.printInfo();
        System.out.println();
        teacher.printInfo();

        System.out.println(student.getName() + " " + student.getGroup());
        System.out.println(teacher.getName() + " " + teacher.getSubject());


    }
}
