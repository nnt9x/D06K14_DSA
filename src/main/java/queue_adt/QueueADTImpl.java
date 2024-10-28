package queue_adt;

import doubly_linked_list.DoublyLinkedList;
import doubly_linked_list.LinkedListADT;

public class QueueADTImpl<T> implements Queue<T> {
    // Thuoc tinh
    private int capacity;
    private LinkedListADT<T> items;

    public QueueADTImpl(int capacity) {
        this.capacity = capacity;
        this.items = new DoublyLinkedList<>();
    }

    @Override
    public void enqueue(T t) {
        if (isFull()) {
            throw new RuntimeException("Queue is full");
        }
        items.insertAtEnd(t);
    }

    @Override
    public T dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return items.deleteAtBegin();
    }

    @Override
    public int size() {
        return items.size();
    }

    @Override
    public void display() {
        items.display();
    }

    @Override
    public boolean isFull() {
        return items.size() == capacity;
    }

    @Override
    public boolean isEmpty() {
        return items.size() == 0;
    }
}
