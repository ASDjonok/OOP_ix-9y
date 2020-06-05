package lab7;

import lab6.Flower;

import java.util.*;

public class MyList<E> implements List<Flower> {
    private Node head;
    private Node tail;
    private int size;

    public MyList() {
    }

    public MyList(Flower flower) {
        add(flower);
    }

    public MyList(Collection<? extends Flower> collection) {
        addAll(collection);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    // todo fix
    @Override
    public boolean contains(Object o) {
        for (Flower flower : this) {
            if (flower.equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<Flower> iterator() {
        return new MyIterator();
    }

    class MyIterator implements Iterator<Flower> {
        protected Node currentNode = head;

        @Override
        public boolean hasNext() {
            return currentNode != null;
        }

        @Override
        public Flower next() {
            /*if (!hasNext()) {
                throw new NoSuchElementException();
            }*/
            try {
                Flower flower = currentNode.getFlower();
                currentNode = currentNode.getNext();
                return flower;
            } catch (NullPointerException e) {
                throw new NoSuchElementException();
            }
        }
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Flower flower) {
        Node node = new Node(flower, null, tail);
        if (head == null) {
            head = node;
        } else {
            tail.setNext(node);
        }
        tail = node;
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Flower> c) {
        boolean isCollectionChanged = false;
        for (Flower flower : c) {
            isCollectionChanged |= add(flower);
        }
        return isCollectionChanged;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Flower> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Flower get(int index) {
        return null;
    }

    @Override
    public Flower set(int index, Flower element) {
        return null;
    }

    @Override
    public void add(int index, Flower element) {

    }

    @Override
    public Flower remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Flower> listIterator() {
        return new MyListIterator();
    }

    class MyListIterator extends MyIterator implements ListIterator<Flower> {
        /*private Node currentNode = head;
        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Flower next() {
            return null;
        }*/

        @Override
        public boolean hasPrevious() {
            return currentNode.getPrevious() != null;
        }

        @Override
        public Flower previous() {
            currentNode = currentNode.getPrevious();
            return currentNode.getFlower();
        }

        @Override
        public int nextIndex() {
            return 0;
        }

        @Override
        public int previousIndex() {
            return 0;
        }

        @Override
        public void remove() {

        }

        @Override
        public void set(Flower flower) {

        }

        @Override
        public void add(Flower flower) {

        }

    }

    @Override
    public ListIterator<Flower> listIterator(int index) {
        return null;
    }

    @Override
    public List<Flower> subList(int fromIndex, int toIndex) {
        return null;
    }
}
