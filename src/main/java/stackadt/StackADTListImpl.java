package stackadt;

import java.util.ArrayList;
import java.util.List;

public class StackADTListImpl<T> implements StackADT<T> {
    private int capacity;
    private List<T> items;

    public StackADTListImpl(int capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>(capacity);
    }

    @Override
    public void push(T t) {
        // B1: kiem tra xem day hay ko
        if (isFull()) {
            throw new RuntimeException("Stack is full");
        }
        // B2: them vao tren dinh stack
        items.add(t);
    }

    @Override
    public T pop() {
        // B1: Kiem tra xem rong hay ko
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        // B2: Lay ra pt dinh stack
        T t = items.get(size() - 1);
        items.remove(size() - 1);
        return t;
    }

    @Override
    public T peek() {
        // B1: Kiem tra xem rong hay ko
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        // B2: Lay ra pt dinh stack
        T t = items.get(size() - 1);
        return t;
    }

    @Override
    public int size() {
        return items.size();
    }

    @Override
    public boolean isFull() {
        return items.size() == capacity;
    }

    @Override
    public boolean isEmpty() {
        return items.isEmpty();
    }

    @Override
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }
        System.out.println("Stack: ");
        for (int i = size() - 1; i >= 0; i--) {
            System.out.println(items.get(i));
        }
        System.out.println("------------");
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return "Stack is empty!";
        }
        StringBuilder builder = new StringBuilder();
        builder.append("Stack: \n");
        for (int i = size() - 1; i >= 0; i--) {
            builder.append(items.get(i) + "\n");
        }
        builder.append("------------\n");
        return builder.toString();
    }
}
