package lab4;

public class Student implements Comparable<Student>/*extends Object*/ {
    private byte course = 2;
    private String name = "Student";
    private String group;
    private String surname;
    private String faculty;
    private float failPossibility;
    private int scholarship;

    private static Student instance /*= null*/;

    /*private */
    public Student() {
//        System.out.println(1);
    }

    public Student(byte course) {
        this.course = course;
    }

    public Student(byte course, String name, String group, String surname, String faculty, float failPossibility,
                   int scholarship) {
        this.course = course;
        this.name = name;
        this.group = group;
        this.surname = surname;
        this.faculty = faculty;
        this.failPossibility = failPossibility;
        this.scholarship = scholarship;
    }

    @Override
    public String toString() {

        return "Student{" +
                "course=" + course +
                ", name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", surname='" + surname + '\'' +
                ", faculty='" + faculty + '\'' +
                ", failPossibility=" + failPossibility +
                ", scholarship=" + scholarship +
                '}';
    }

    /*public static Student getInstance() {
        if (instance == null) {
            instance = new Student();
        }
        return instance;
    }*/

    public boolean isScholarshipExists() {
        return scholarship > 0;
    }

    public String getFaculty() {
        return faculty;
    }

    @Override
    public int compareTo(Student student) {
        int surnameCompareResult = surname.compareTo(student.surname);
        return surnameCompareResult != 0 ? surnameCompareResult : -name.compareTo(student.name);
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    /*static void myStaticMethod() {
        System.out.println("I am static!");
    }

    void myDynamicMethod() {
        System.out.println("I am dynamic!");
    }*/
}
