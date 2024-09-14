package stack_generic;

public class Stack<T> {
    // Thuoc
    private int capacity;
    private int top = -1;
    private T[] items;

    // Khoi tao
    public Stack(int capacity) {
        this.capacity = capacity;
        this.items = (T[]) new Object[capacity];
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(T t) {
        if (isFull()) {
            throw new RuntimeException("Stack is full");
        }
        items[++top] = t;
    }

    public T pop() {
        if (isEmpty()) throw new RuntimeException("Stack is empty");
        T tmp = items[top];
        top--;
        return tmp;
    }

    public void display() {
        // In ra stack top -> 0
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Stack: ");
        for (int i = top; i >= 0; i--) {
            System.out.println(items[i]);
        }
        System.out.println("----------------");
    }
}
