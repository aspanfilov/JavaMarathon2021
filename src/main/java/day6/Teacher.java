package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void evaluate(Student student) {
        Random random = new Random();
        int markByInt = random.nextInt(4) + 2;
        System.out.println(
                "Преподаватель " + name +
                " оценил студента с именем " + student.getName() +
                " по предмету " + subject +
                " на оценку " + getMarkByWord(markByInt));
    }

    public String getMarkByWord(int markByInt) {
        String markByWord;
        switch (markByInt) {
            case 5 -> markByWord = "отлично";
            case 4 -> markByWord = "хорошо";
            case 3 -> markByWord = "удовлетворительно";
            case 2 -> markByWord = "неудовлетворительно";
            default -> markByWord = "неопределеноо";
        }
        return markByWord;
    }
}
