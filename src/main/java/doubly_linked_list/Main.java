package doubly_linked_list;

public class Main {
    public static void main(String[] args) {
        LinkedListADT<Integer> linkedListADT = new DoublyLinkedList<>();
        linkedListADT.insertAtBegin(10);
        linkedListADT.insertAtBegin(20);
        // In
        linkedListADT.display();
        // Them vao cuoi
        linkedListADT.insertAtEnd(30);
        linkedListADT.display();
        // Them vao vi tri position
        linkedListADT.insertAtPosition(40, 1);
        linkedListADT.display();

        // xoa vi tri dau hang
        int begin = linkedListADT.deleteAtBegin();
        System.out.println("Gia tri vua xoa: " + begin);
        linkedListADT.display();
        // Xoa cuoi
        int last = linkedListADT.deleteAtEnd();
        System.out.println("Gia tri vua xoa: " + last);
        linkedListADT.display();

        // Them 1 phan tu nua
        linkedListADT.insertAtBegin(100);
        linkedListADT.display();

        // Xoa positon = 1
        int middle = linkedListADT.deleteAtPosition(1);
        System.out.println("Gia tri vua xoa: " + middle);
        linkedListADT.display();
    }
}
