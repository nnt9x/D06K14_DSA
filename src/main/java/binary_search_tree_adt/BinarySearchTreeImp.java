package binary_search_tree_adt;

import java.util.Stack;

public class BinarySearchTreeImp<T extends Comparable<T>>
        implements BinarySearchTreeADT<T> {

    private Node<T> root;

    public BinarySearchTreeImp() {
        this.root = null;
    }

    @Override
    public void insert(T t) {
        // Tao node moi
        Node<T> newNode = new Node<>(t);
        // TH1: chua co phan tu nao
        if (root == null) {
            root = newNode;
            return;
        }
        // TH2: co it nhat 1 phan tu
        Node<T> node = root; // Bat dau duyet tu goc
        while (true) {
            if (node.getData().compareTo(t) == 0) {
                break;
            } else if (node.getData().compareTo(t) < 0) {
                // Them sang ben phai
                if (node.getRight() == null) {
                    node.setRight(newNode);
                    break;
                } else {
                    // Tiep tuc duyet sang phai
                    node = node.getRight();
                }
            } else {
                // Them sang trai
                if (node.getLeft() == null) {
                    node.setLeft(newNode);
                    break;
                } else {
                    // Tiep tuc duyet sang phai
                    node = node.getLeft();
                }
            }
        }
    }

    @Override
    public boolean search(T t) {
        return false;
    }

    @Override
    public void inorder() {
        Stack<Node<T>> stack = new Stack<>(); // Lưu ý: đang dùng Stack mặc định

        Node<T> currentNode = root; // Bat dau duyet tu node goc
        while (currentNode != null || !stack.isEmpty()) {
            // Duyệt theo inorder: left->root->right
            while (currentNode != null) {
                // Duyet sang trai ngoai cung
                stack.push(currentNode);
                // Duyet tiep sang node trai
                currentNode = currentNode.getLeft();
            }
            // Lay cac phan tu trong stack -> in ra
            currentNode = stack.pop();
            // In ra
            System.out.print(currentNode.getData() + "->");
            // Duyet sang phai
            currentNode = currentNode.getRight();
        }
    }
}
