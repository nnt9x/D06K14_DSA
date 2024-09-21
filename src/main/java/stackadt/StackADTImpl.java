package stackadt;

import java.util.Arrays;

public class StackADTImpl<T> implements StackADT<T> {
    // Thuộc tính
    private int top = -1;
    private int capacity;
    private T[] items;

    // Phương thức khởi tạo
    public StackADTImpl(int capacity) {
        this.capacity = capacity;
        this.items = (T[]) new Object[capacity];
    }

    @Override
    public void push(T t) {
        // B1: kiểm tra xem còn trống hay ko?
        if (isFull()) {
            throw new RuntimeException("Stack is full");
        }
        // B2: có giá trị
        top = top + 1;
        items[top] = t;
    }

    @Override
    public T pop() {
        // B1: kiểm tra xem có trống ko ?
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        // B2:
        T t = items[top];
        top = top - 1;
        return t;
    }

    @Override
    public T peek() {
        // B1: kiểm tra xem có trống ko ?
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        // B2:
        T t = items[top];
        return t;
    }

    @Override
    public int size() {
        return top + 1;
    }

    @Override
    public boolean isFull() {
        return top == capacity - 1;
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    @Override
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }
        System.out.println("Stack: ");
        for (int i = top; i >= 0; i--) {
            System.out.println(items[i]);
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
        for (int i = top; i >= 0; i--) {
            builder.append(items[i] + "\n");
        }
        builder.append("------------\n");
        return builder.toString();
    }
}
