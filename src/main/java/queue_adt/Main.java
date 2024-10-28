package queue_adt;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new QueueADTImpl<>(10);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display();
        // Lay dau hang
        int begin = queue.dequeue();
        System.out.println("Phan tu dau hang: "+ begin);
        // In ra
        queue.display();
    }
}
