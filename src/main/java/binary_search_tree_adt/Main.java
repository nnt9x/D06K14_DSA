package binary_search_tree_adt;

public class Main {
    public static void main(String[] args) {
        BinarySearchTreeADT<Integer> binarySearchTreeADT = new BinarySearchTreeImp<>();
        binarySearchTreeADT.insert(8);
        binarySearchTreeADT.insert(3);
        binarySearchTreeADT.insert(10);
        binarySearchTreeADT.insert(1);
        binarySearchTreeADT.insert(6);
        binarySearchTreeADT.insert(4);

        binarySearchTreeADT.inorder();

        // Tao cay tim kiem nhi phan chua sinh vien
        BinarySearchTreeADT<Student> binarySearchTreeADT1 = new BinarySearchTreeImp<Student>();

        binarySearchTreeADT1.insert(new Student(1,"SV1","A17",10));
        binarySearchTreeADT1.insert(new Student(4,"SV4","A17",8));
        binarySearchTreeADT1.insert(new Student(2,"SV2","A17",7));
        binarySearchTreeADT1.insert(new Student(5,"SV5","A17",9));

        System.out.println();
        binarySearchTreeADT1.inorder();

    }
}
