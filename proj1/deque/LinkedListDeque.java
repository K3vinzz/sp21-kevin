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

    public boolean isEmpty(){
        if (size == 0){
            return true;
        }
        return false;
    }

    public int size(){
        return size;
    }

    public void printDeque(){
        Node current = sentinel.next;
        if (current != sentinel){
            System.out.print(current.item+" ");
        }
        System.out.println();
    }

    public T removeFirst(){
        if (sentinel.next.item != null){
            T firstItem = sentinel.next.item;
            sentinel.next = sentinel.next.next;
            size -= 1;
            return firstItem;
        }
        return null;
    }

    public T removeLast(){
        if (sentinel.prev.item != null){
            T lastItem = sentinel.prev.item;
            sentinel.prev = sentinel.prev.prev;
            size -= 1;
            return lastItem;
        }
        return null;
    }

    public T get(int index){
        Node current = sentinel;
        for (int i = -1; i < index; i += 1){
            current = sentinel.next;
        }
        if (current.item != null){
            return current.item;
        }
        return null;
    }

    public T getRecursive(int index){
        return null;

    }
}
