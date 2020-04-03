package lab4;

public class Student {
    private byte course;
    private String name = "Student";
    private String group;
    private String surname;
    private String faculty;
    private float failPossibility;
    private int scholarship;

    public boolean isScholarshipExists() {
        return scholarship > 0;
    }

    public String getFaculty() {
        return faculty;
    }
}
