package doubly_linked_list;

public class DoublyLinkedList<T> implements LinkedListADT<T> {
    private Node<T> head;
    private int size;

    public DoublyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    @Override
    public void insertAtBegin(T t) {
        // B1: tao node
        Node<T> tmp = new Node<>(t);
        // TH1: không có phần tử nào
        if (size == 0) {
            head = tmp;
            size++;
        } else {
            // Co it nhat 1 phan tu
            tmp.setNext(head);
            head.setPrev(tmp);
            // Tro head -> tmp (tmp tro thanh head moi)
            head = tmp;
            // Tang size ++;
            size++;
        }
    }

    @Override
    public void insertAtEnd(T t) {
        // Them vao cuoi:
        // TH1: khong co phan tu nao
        Node<T> tmp = new Node<>(t);
        if (size == 0) {
            head = tmp;
            size++;
        } else {
            // TH2: co it nhat 1 phan tu
            Node<T> lastNode = head;
            while (lastNode.getNext() != null) {
                lastNode = lastNode.getNext();
            }
            lastNode.setNext(tmp);
            tmp.setPrev(lastNode);
            size++;
        }
    }

    @Override
    public void insertAtPosition(T t, int position) {
        if (position == 0) {
            insertAtBegin(t);
        } else if (position == size) {
            insertAtEnd(t);
        } else if (position < 0 || position > size) {
            throw new IndexOutOfBoundsException();
        } else {
            // them vao giua
            Node<T> preNode = head; // position -1
            for (int i = 0; i < position - 1; i++) {
                preNode = preNode.getNext();
            }
            // position
            Node<T> currNode = preNode.getNext();

            // Node: tmp
            Node<T> tmp = new Node<>(t);

            preNode.setNext(tmp);
            tmp.setPrev(preNode);

            tmp.setNext(currNode);
            currNode.setPrev(tmp);

            size++;

        }
    }

    @Override
    public T deleteAtBegin() {
        return null;
    }

    @Override
    public T deleteAtEnd() {
        return null;
    }

    @Override
    public T deleteAtPosition(int position) {
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void display() {
        if (size == 0) {
            System.out.println("Linkedlist is empty!");
            return;
        }
        Node<T> node = head;
        while (node != null) {
            System.out.print(node.getData() + "<-->");
            node = node.getNext();
        }
        System.out.print("NULL\n");
    }
}
