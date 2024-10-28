package binary_search_tree;

import java.util.Stack;

public class BinarySearchTree {
    // Thuộc tính
    private Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    // Thêm phần tử
    public void insert(int data) {
        // left < root < right
        Node newNode = new Node(data);
        // TH1: chua co phan tu nao
        if (this.root == null) {
            this.root = newNode;
            return;
        }
        // TH2: co it nhat 1 phan tu
        Node node = root; // Bat dau duyet tu goc
        while (true) {
            if (node.getData() == data) {
                break;
            } else if (node.getData() < data) {
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

    // Duyệt cây - inorder
    public void inorder() {
        Stack<Node> stack = new Stack<>(); // Lưu ý: đang dùng Stack mặc định

        Node currentNode = root; // Bat dau duyet tu node goc
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

    // Tìm kiếm
    public boolean search(int x) {
        Node node = root;
        while (true) {
            if (node == null) break;
            if (node.getData() == x) {
                return true;
            } else if (node.getData() < x) {
                // Duyet sang phai
                node = node.getRight();
            } else {
                // Duyet sang trai
                node = node.getLeft();
            }
        }
        return false;
    }
}
