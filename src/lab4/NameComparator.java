package lab4;

import java.util.Comparator;

public class NameComparator implements Comparator<Student> {

    /*@Override
    public int compare(Object o1, Object o2) {
        return ((Student)o1).getName().compareTo(((Student)o2).getName());
    }*/

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
