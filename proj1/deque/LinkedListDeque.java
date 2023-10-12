package deque;

public class LinkedListDeque<T> implements Deque<T>{
    public class Node {
        public T item;
        public Node prev;
        public Node next;
        public Node(T i, Node p, Node n){
            item = i;
            prev = p;
            next = n;
        }
    }

    private Node sentinel;
    private int size;

    public LinkedListDeque(){
        sentinel = new Node(null, null, null);
        sentinel.next = sentinel;
        sentinel.prev = sentinel;
        size = 0;
    }

    public LinkedListDeque(T item){
        sentinel = new Node(null, null, null);
        Node first = new Node(item, sentinel, sentinel);
        sentinel.next = first;
        sentinel.prev = first;
        size += 1;
    }


    public void addFirst(T i){
        Node first = new Node(i, sentinel, sentinel.next);
        sentinel.next = first;
        size += 1;
    }

    public void addLast(T i){
        Node last = new Node(i, sentinel.prev, sentinel);
        sentinel.prev.next = last;
        sentinel.prev = last;
        size += 1;
    }

}
