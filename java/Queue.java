public class Queue {
    private Node first = null;
    private Node last;

    public class Node {
        String item;
        Node next;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void enQueue(String item) {

        Node lastNode = last;
        last = new Node();
        last.item = item;
        last.next = null;

        if (isEmpty()) {
            first = last;
        } else {
            lastNode.next = last;
        }

    }

    public String deQueue() {
        String item = first.item;
        first = first.next;
        if (!isEmpty()) {
            last = null;
        }
        return item;
    }
}