package stackadt;

import stack_generic.Stack;

public class Main {
    public static void main(String[] args) {
        StackADT<String> adt = new StackADTListImpl<>(100);
        adt.push("Hello");
        adt.push("How are you?");
//        adt.display();

        StackADT<String> adt1 = new StackADTListImpl<>(100);
        adt1.push("How are you?");
        adt1.push("Fine");
//        adt.display();

        //  Stack trong Stack
        StackADT<StackADT<String>> stackStackADT = new StackADTListImpl<>(10);
        stackStackADT.push(adt);
        stackStackADT.push(adt1);

        stackStackADT.display();

    }
}
