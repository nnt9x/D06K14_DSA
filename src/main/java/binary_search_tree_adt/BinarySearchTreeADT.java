package binary_search_tree_adt;

public interface BinarySearchTreeADT<T> {
    // Phuong thuc - thao tac
    void insert(T t);

    boolean search(T t);

    // Duyet
    void inorder();
}
