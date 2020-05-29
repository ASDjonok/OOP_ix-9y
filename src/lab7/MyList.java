package lab7;

import lab6.Flower;

import java.util.*;

public class MyList implements List<Flower> {

    public MyList() {
        //todo check
    }

    public MyList(Flower flower) {
        // add flower to collection
        // todo check
        add(flower);
    }

    public MyList(Collection collection) {
        // add collection's elements to this collection
        //todo check
        addAll(collection);
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<Flower> iterator() {
        return null;
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
        return false;
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
        return false;
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
        return null;
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
