package day6;

public class Task3 {
    public static void main(String[] args) {
        Student student = new Student("Иван");
        Teacher teacher = new Teacher("Рафаэль Михалыч", "История");

        for (int i = 0; i < 20; i++) {
            teacher.evaluate(student);
        }
    }
}
