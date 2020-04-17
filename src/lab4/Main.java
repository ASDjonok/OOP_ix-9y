package lab4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*int a = 1 +
                2;
        String s = "a" +
                'b';

        char c = '\'';
        char c2 = '\\';
        System.out.println(c);
        System.out.println(c2);*/

        /*int[] array = new int[3];
        String[] arrayString = new String[3];*/

        /*Student[] students = new Student[3];
        students[0] = new Student();
        students[1] = new Student();
        students[2] = new Student();*/

        Student[] students = {
                new Student((byte) 1, "Oleksii", "IO-61", "Aleshchenko", "FICT",
                        0, 600),
                new Student((byte) 2, "Oleg", "IO-62", "Ivanov", "FICT",
                        0, 600),
                new Student((byte) 3, "Ganna", "IV-61", "Aleshchenko", "FICT",
                        0, 600),
        };

        System.out.println(students[0].compareTo(students[1]));

        Arrays.sort(students);
        System.out.println();

        /*int[] array = {1, 3, 2};
        Arrays.sort(array);*/


        /*for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }*/

        /*for (int i : array) {
            System.out.println(i);
        }*/

//        System.out.println(Arrays.toString(array));
        /*System.out.println(array.toString());
        System.out.println(array);*/
//        System.out.println();

        /*System.out.println(students[0].isScholarshipExists());
        System.out.println(students[0].toString());*/


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
