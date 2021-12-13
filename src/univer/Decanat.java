package univer;

import com.vet.Animal;

import javax.swing.text.Style;

public class Decanat {
    public static void main(String[] args) {
        Student asp1 = new Aspirant("Anton", "Petrov", "AM12", 3.2);
        Student std1 = new Student("Vasil", "Vovchenko", "AO1", 4);
        Student[] students = {asp1, std1};

        for (Student stud: students) {
            stud.getScholarship();
        }
    }
}