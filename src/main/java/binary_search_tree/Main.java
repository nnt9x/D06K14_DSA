package binary_search_tree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(45);
        binarySearchTree.insert(79);
        binarySearchTree.insert(15);
        binarySearchTree.insert(10);
        binarySearchTree.insert(20);
        binarySearchTree.insert(55);
        binarySearchTree.insert(90);
        binarySearchTree.insert(12);
        binarySearchTree.insert(50);

        // Duyet cay theo inorder
        binarySearchTree.inorder();

        // Tim gia tri x co nam trong cay hay ko?
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nx = ");
        int x = scanner.nextInt();
        scanner.close();
        boolean rs = binarySearchTree.search(x);
        if(rs){
            System.out.println("Có tồn tại x trong cây");
        }
        else{
            System.out.println("Không tồn tại x trong cây");
        }
    }
}
