package univer;

public class Aspirant extends Student {
    public Aspirant(String firstName, String lastName, String group, double averageMark) {
        super(firstName, lastName, group, averageMark);
    }

    public void getScholarship() {
        String res = averageMark == 5 ? "Aspirant scholarship is 200 hrn" : "Student scholarship is 180 hrn";
        System.out.println(res);
    }
}