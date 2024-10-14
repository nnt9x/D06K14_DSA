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
    }
}
