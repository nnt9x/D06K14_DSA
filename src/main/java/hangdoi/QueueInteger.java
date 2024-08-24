package hangdoi;

public class QueueInteger {
    // Thuộc tính
    private int capacity; // Kich thuoc toi da
    // Front, rear
    private int front = -1;
    private int rear = -1;
    // Lưu trữ các phần tử trong 1 mảng
    private int[] items;

    // Phương thức khởi tạo
    public QueueInteger(int n) {
        if (n <= 0) {
            throw new RuntimeException("Kích thước không hợp lệ!");
        }
        this.capacity = n;
        this.items = new int[n];
    }

    public boolean isFull() {
        if (front == 0 && rear == capacity - 1) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if (front == -1 && rear == -1) {
            return true;
        }
        return false;
    }

    // Phương thức
    public void enqueue(int e) {
        // Kiem tra hang doi co day hay ko ?
        if (isFull()) {
            throw new RuntimeException("Hàng đợi đã đầy");
        }
        // Thêm phần tử vào hàng đợi
        if (front == -1) {
            front = 0;
        }
        rear++;
        // Gan gia tri cho phan tu cuoi hang
        items[rear] = e;
    }

    // Dequeue
    public int dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Hàng đợi rỗng");
        }
        // Phan tu dau hang hien tai
        int head = items[front];
        // Tang front len 1 don vi
        front++;
        if (front > rear) {
            front = rear = -1;
        }
        return head;
    }

    // In ra hang doi
    public void display() {
        if (isEmpty()) {
            System.out.println("Hàng đợi rỗng");
            return;
        }
        for (int i = front; i <= rear; i++) {
            System.out.print(items[i] + "<--");
        }
        System.out.println();
    }

    public int size() {
        if (isEmpty()) return 0;
        return (rear - front) + 1;
    }

}
