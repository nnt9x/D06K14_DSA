package stack;

public class Main {
    public static void main(String[] args) {
        StackNumber stackNumber =
                new StackNumber(10);
        stackNumber.display();
        stackNumber.push(10);
        stackNumber.push(30);
        stackNumber.push(50);
        stackNumber.push(70);
        stackNumber.display();
        // Lay ra phan tu tren cung
        System.out.println(stackNumber.pop());
        stackNumber.display();

    }
}
