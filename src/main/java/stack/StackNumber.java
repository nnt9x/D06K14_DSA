package stack;

// Su dung array de trien khai

public class StackNumber {
    // Thuoc tinh
    private int capacity;
    private int top = -1;
    private int[] items;

    // Phuong thuc khoi tao
    public StackNumber(int capacity) {
        this.capacity = capacity;
        this.items = new int[capacity];
    }

    public boolean isFull() {
        if (top == capacity - 1) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if (top == -1) return true;
        return false;
    }

    public void push(int item) {
        // B1: can kiem tra xem stack da day hay chua?
        if (isFull()) {
            throw new RuntimeException("Stack is full");
        }
        // B2: Them phan tu vao stack
        top = top + 1;
        items[top] = item;
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        int tmp = items[top];
        top = top - 1;
        return tmp;
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        int tmp = items[top];
        return tmp;
    }

    public int size() {
        return top + 1;
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
