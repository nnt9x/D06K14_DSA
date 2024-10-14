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
        if (size == 0) {
            throw new RuntimeException("Linkedlist is empty");
        } else if (size == 1) {
            T data = head.getData();
            head = null;
            size--;
            return data;
        } else {
            // co nhieu hon 1 phan tu
            T data = head.getData();
            // Lay ra newHead
            Node<T> newHead = head.getNext();
            // Xoa lien ket head =>newHead
            head.setNext(null);
            newHead.setPrev(null);
            // Gan head => newHead
            head = newHead;
            // Giam size
            size--;
            return data;
        }
    }

    @Override
    public T deleteAtEnd() {
        if (size == 0) {
            throw new RuntimeException("Linkedlist is empty");
        } else if (size == 1) {
            return deleteAtBegin();
        } else {
            // Co nhieu hon 1 phan tu:
            // can tim dc cai gan cuoi.
            Node<T> preNode = head; // gan cuoi
            for (int i = 0; i < size - 2; i++) {
                preNode = preNode.getNext();
            }
            Node<T> lastNode = preNode.getNext(); // cuoi
            T data = lastNode.getData();
            // Xoa lien ket
            preNode.setNext(null);
            lastNode.setPrev(null);

            // Giam size
            size--;
            return data;
        }
    }

    @Override
    public T deleteAtPosition(int position) {
        if (position == 0) {
            return deleteAtBegin();
        } else if (position == size - 1) {
            return deleteAtEnd();
        } else if (position < 0 || position >= size) {
            throw new IndexOutOfBoundsException();
        } else {
            // Xoa giua: position -1 ; position ; position + 1
            // position - 1
            Node<T> preNode = head; // position - 1
            for (int i = 0; i < position - 1; i++) {
                preNode = preNode.getNext();
            }
            Node<T> currNode = preNode.getNext(); // position: node can xoa
            T data = currNode.getData();
            // position + 1
            Node<T> nextNode = currNode.getNext();
            // Xoa lien ket
            preNode.setNext(null);
            currNode.setPrev(null);

            currNode.setNext(null);
            nextNode.setPrev(null);
            // Tao lien ket
            preNode.setNext(nextNode);
            nextNode.setPrev(preNode);
            // Giam size
            size--;
            return data;
        }
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
