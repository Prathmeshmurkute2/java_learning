public class LinkedList<T> {

    private class Node {
        private T data;
        private Node next;

        public Node(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }
    }

    private Node head, last;
    private int size;

    public void add(T data) {
        Node n = new Node(data);

        if (head == null) {
            head = n;
            last = n;
        } else {
            last.next = n;
            last = n;
        }

        size++;
    }

    public void insert(int idx, T data) {

        if (idx < 0 || idx > size) {
            throw new IllegalArgumentException("Index out of bound");
        }

        Node n = new Node(data);

        if (idx == 0) {
            n.next = head;
            head = n;

            if (size == 0)
                last = n;
        } else {

            Node t = head;

            for (int i = 0; i < idx - 1; i++) {
                t = t.next;
            }

            n.next = t.next;
            t.next = n;

            if (n.next == null) {
                last = n;
            }
        }

        size++;
    }

    public void remove(int idx) {

        if (idx < 0 || idx >= size) {
            throw new IllegalArgumentException("Index out of bound");
        }

        if (idx == 0) {
            head = head.next;

            if (head == null) {
                last = null;
            }
        } else {

            Node t = head;

            for (int i = 0; i < idx - 1; i++) {
                t = t.next;
            }

            t.next = t.next.next;

            if (t.next == null) {
                last = t;
            }
        }

        size--;
    }

    public void print() {
        Node t = head;

        while (t != null) {
            System.out.println(t.getData());
            t = t.next;
        }
    }
}