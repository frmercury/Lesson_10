package univer;

public class Student {
    public Student(String firstName, String lastName, String group, double averageMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averageMark = averageMark;
    }

    private String firstName;
    private String lastName;
    private String group;
    double averageMark;

    public void getScholarship(){
        String res = averageMark == 5 ? "Student scholarship is 100 hrn" : "Student scholarship is 80 hrn";
        System.out.println(res);
    }
}
