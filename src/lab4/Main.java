package lab4;

public class Main {
    public static void main(String[] args) {
        int a = 1 +
                2;
        String s = "a" +
                'b';

        char c = '\'';
        char c2 = '\\';
        System.out.println(c);
        System.out.println(c2);

        int[] array = new int[3];
        String[] arrayString = new String[3];

        /*Student[] students = new Student[3];
        students[0] = new Student();
        students[1] = new Student();
        students[2] = new Student();*/

        Student[] students = {
                new Student((byte) 2),
//                Student.getInstance(),
//                Student.getInstance(),
//                Student.getInstance(),
                new Student(),
                new Student((byte) 3)
        };

        System.out.println(students[0].isScholarshipExists());
        System.out.println(students[0]);

        /*Student.myStaticMethod();
//        Student.myDynamicMethod();
        Student.course = 2;
        System.out.println("course = " + Student.course);
        final int a = 1;
//        a = 2;

        Student student = new Student();
        student.course = 3;
        System.out.println("course = " + student.course);


        Student student2 = new Student();
        System.out.println("course = " + student2.course);*/



        /*student.myDynamicMethod();


        System.out.println(student.getFaculty());
//        System.out.println(student.name);
        System.out.println(student.isScholarshipExists());


        System.out.println(student.toString());*/
    }
}
