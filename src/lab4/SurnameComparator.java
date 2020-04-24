package lab4;

import java.util.Comparator;

public class SurnameComparator implements Comparator<Student> {

    /*@Override
    public int compare(Object o1, Object o2) {
        return ((Student)o1).getSurname().compareTo(((Student)o2).getSurname());
    }*/

    @Override
    public int compare(Student student1, Student student2) {
        return student1.getSurname().compareTo(student2.getSurname());
    }

    /*@Override
    public int compare(Object o1, Object o2) {
        return 0;
    }*/
}
