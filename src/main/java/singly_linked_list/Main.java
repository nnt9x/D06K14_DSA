package singly_linked_list;

public class Main {
    public static void main(String[] args) {
        // 1 -> 2 -> 5 -> 7 -> 3 -> NULL
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node5 = new Node(5);
        Node node7 = new Node(7);

        node1.setNext(node2);
        node2.setNext(node5);
        node5.setNext(node7);
        node7.setNext(node3);

        // Duyet danh sach lien ket
        Node node = node1;
        while (node != null) {
            System.out.print(node.getData() + "-->");
            node = node.getNext();
        }

    }
}
