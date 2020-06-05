package lab7;

import lab6.Flower;

public class Node {
    private Flower flower;
    private Node next;
    private Node previous;

    public Node(Flower flower, Node next, Node previous) {
        this.flower = flower;
        this.next = next;
        this.previous = previous;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Flower getFlower() {
        return flower;
    }

    public Node getNext() {
        return next;
    }

    public Node getPrevious() {
        return previous;
    }
}
