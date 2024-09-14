package stack;

public class Main2 {
    public static void main(String[] args) {
        String s = "hello world";
        System.out.println("Chuỗi ban đầu: " + s);

        StackChar stackChar = new StackChar(s.length());
        // Push vao stack
        for (int i = 0; i < s.length(); i++) {
            stackChar.push(s.charAt(i));
        }
        // In ra pop
        System.out.print("Chuỗi đảo ngược: ");
        while (!stackChar.isEmpty()) {
            System.out.print(stackChar.pop());
        }
    }
}
