package deque;

public interface Deque<T> {
    void addFirst(T x);
    void addLast(T x);
    boolean isEmpty();
    int size();
    T removeFirst();
    T removeLast();
    T get(int index);
    T getRecursive(int index);

}
