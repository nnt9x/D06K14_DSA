package doubly_linked_list;

public interface LinkedListADT<T> {
    // Phép toán
    public void insertAtBegin(T t);

    public void insertAtEnd(T t);

    public void insertAtPosition(T t, int position);

    public T deleteAtBegin();

    public T deleteAtEnd();

    public T deleteAtPosition(int position);

    public int size();

    public void display();
}
