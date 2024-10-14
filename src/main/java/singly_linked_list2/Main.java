package singly_linked_list2;

public class Main {
    public static void main(String[] args) {
        // 1, 2, 5, 7, 3
        SinglyLinkedList<Integer> linkedList = new SinglyLinkedList<>();
        linkedList.insertAtBegin(3);
        linkedList.insertAtBegin(7);
        linkedList.insertAtBegin(5);
        linkedList.insertAtBegin(2);
        linkedList.insertAtBegin(1);
        linkedList.insertAtEnd(10);
        linkedList.insertAtEnd(20);

        // HIen thi
        linkedList.display();

        // Xoa
        linkedList.deleteAtBegin();
        linkedList.display();
        // xoa tiep
        linkedList.deleteAtBegin();
        linkedList.display();

        // Xoa vi tri cuoi
        linkedList.deleteAtEnd();
        linkedList.display();

        linkedList.deleteAtEnd();
        linkedList.display();

        linkedList.insertAtPosition(4, 2);
        linkedList.display();

        linkedList.insertAtPosition(0, 0);
        linkedList.display();
        // Kich thuoc
        System.out.println("Kich thuoc: " + linkedList.size());

        // Xoa, sau do in kich thuoc
        linkedList.deleteAtPosition(3);
        linkedList.display();
        // in ra kich thuoc
        System.out.println("Kich thuoc: " + linkedList.size());

        // Xoa, sau do in kich thuoc
        linkedList.deleteAtPosition(0);
        linkedList.display();
        // in ra kich thuoc
        System.out.println("Kich thuoc: " + linkedList.size());

        //
        linkedList.deleteAtPosition(2);
        linkedList.display();
        // in ra kich thuoc
        System.out.println("Kich thuoc: " + linkedList.size());

        linkedList.deleteAtPosition(10);
        linkedList.display();
        // in ra kich thuoc
        System.out.println("Kich thuoc: " + linkedList.size());
    }
}
