package stackadt;

public interface StackADT <T>{
    // Các thao tác - phép toán có thể thực hiện
    void push(T t);
    T pop();
    T peek();
    int size();
    boolean isFull();
    boolean isEmpty();
    void display(); // Hiển thị
}
