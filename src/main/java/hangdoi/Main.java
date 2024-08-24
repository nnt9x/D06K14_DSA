package hangdoi;

public class Main {
    public static void main(String[] args) {
        QueueInteger queue = new QueueInteger(10);
        queue.enqueue(10);
        queue.enqueue(30);
        queue.enqueue(50);
        queue.display();
        System.out.println(queue.dequeue());
        queue.display();
        System.out.println("Kich thuoc hien tai: " + queue.size());

        System.out.println(queue.dequeue());
        queue.display();
        System.out.println(queue.dequeue());
        queue.display();
        System.out.println("Kich thuoc hien tai: " + queue.size());
    }
}
