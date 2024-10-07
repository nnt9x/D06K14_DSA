package singly_linked_list2;

public class SinglyLinkedList<T> {
    // Thuộc tinh
    private Node<T> head;

    // Kich thuoc
    private int size;

    public SinglyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    // Them vao dau
    public void insertAtBegin(T t) {
        // B1: Tao node
        Node<T> newNode = new Node<>(t);
        // B2: Th1: ko co phan tu nao
        if (head == null) {
            head = newNode;
            size++;
            return;
        }
        // TH2: co phan tu
        newNode.setNext(head);
        // Trỏ head -> newNode (newNode trở thành head mới)
        head = newNode;
        size++;
    }

    // Them vao cuoi
    public void insertAtEnd(T t) {
        // B1: Tao node
        Node newNode = new Node(t);
        // Th1: khong co phan tu nao
        if (head == null) {
            head = newNode;
            size++;
            return;
        }
        // TH2: co phan tu -> tìm dc phần tử cuối hiện tại
        Node lastNode = head;
        // Node cuoi co next = null
        while (lastNode.getNext() != null) {
            lastNode = lastNode.getNext();
        }
        // Da co phan tu cuoi
        lastNode.setNext(newNode);
        size++;
    }

    // Them vao theo vi tri position
    public void insertAtPosition(T t, int position) {
        if (position == 0) {
            // Them vao dau danh sach
            insertAtBegin(t);
        }
        // Them vao cuoi: position
        else if (position == size) {
            insertAtEnd(t);
        } else if (position < 0 || position > size) {
            throw new RuntimeException("Index out of range");
        } else {
            // Them vi tri giua: position - 1
            Node node = head;
            for (int i = 0; i < position - 1; i++) {
                node = node.getNext();
            }
            // position
            Node currentNode = node.getNext();

            // newNode
            Node newNode = new Node(t);
            node.setNext(newNode);
            newNode.setNext(currentNode);
            size ++;
        }
    }


    // Xoa vi tri dau danh sach
    public void deleteAtBegin() {
        if (head == null) {
            throw new RuntimeException("Linked list is empty!");
        } else if (head.getNext() == null) {
            head = null;
            size--;
        } else {
            // Co it nhat 1 phan tu, 2 tro len
            Node newHead = head.getNext();
            // Ngat lien ket head -> newHead
            head.setNext(null);
            // Tro head -> newHead
            head = newHead;
            size--;
        }
    }

    // Xoa vi tri cuoi
    public void deleteAtEnd() {
        if (head == null) {
            throw new RuntimeException("Linked list is empty!");
        } else if (head.getNext() == null) {
            head = null;
            size--;
        } else {
            // Tim dc vi tri gan cuoi
            Node node = head;
            while (node.getNext().getNext() != null) {
                node = node.getNext();
            }
            // Cắt liên kết: gần cuói -> cuối
            node.setNext(null);
            size--;
        }
    }


    public int size() {
        return size;
    }

    // Hien thi
    public void display() {
        if (head == null) {
            System.out.println("SinglyLinkedList is empty!");
        }
        Node node = head;
        while (node != null) {
            System.out.print(node.getData() + "-->");
            node = node.getNext();
        }
        System.out.println();
    }
}
