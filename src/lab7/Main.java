package lab7;

import lab6.Flower;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        MyList myList = new MyList(new Flower(0, 0));
        myList.add(new Flower(1,1));
        myList.add(new Flower(2,2));

        MyList emptyList = new MyList();
        emptyList.add(new Flower(3,3));

        ArrayList arrayList = new ArrayList();
        arrayList.add(new Flower(4,4));
        arrayList.add(new Flower(5,5));
        MyList list2 = new MyList(arrayList);

        Iterator iterator = list2.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
//        System.out.println(iterator.next());

        System.out.println("++++++++++++");

        ListIterator listIterator = list2.listIterator();
        System.out.println(listIterator.next());
        System.out.println(listIterator.previous());
        System.out.println(listIterator.next());
        System.out.println(listIterator.previous());
        System.out.println(listIterator.next());
        System.out.println(listIterator.previous());
        System.out.println(listIterator.next());
        System.out.println(listIterator.previous());
        System.out.println(listIterator.next());
        System.out.println(listIterator.previous());

        System.out.println(list2.contains(new Flower(4,4)));
    }
}
