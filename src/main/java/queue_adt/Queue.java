package queue_adt;

public interface Queue<T> {
    public void enqueue(T t);

    public T dequeue();

    public int size();

    public void display();

    public boolean isFull();

    public boolean isEmpty();
}
