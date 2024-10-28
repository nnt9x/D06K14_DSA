package tree;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // Tạo node
        Node root = new Node(1);
        Node node9 = new Node(9);
        Node node12 = new Node(12);
        Node node5 = new Node(5);
        Node node6 = new Node(6);

        // Liên kết node -> tạo cây
        root.setRight(node9);
        root.setLeft(node12);
        node12.setLeft(node5);
        node12.setRight(node6);

        // Duyệt cây: preorder, inorder, postorder
        // Duyệt cây bằng cách triển khai 1 stack
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
}
