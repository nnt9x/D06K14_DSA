package stackadt;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        List<Student> list1 = new ArrayList<>();
        list1.add(new Student(1,"Student 1"));
        list1.add(new Student(2,"Student 2"));

        List<Student> list2 = new ArrayList<>();
        list2.add(new Student(3, "Student 3"));
        list2.add(new Student(4, "Student 4"));

        // Tao Stack
        StackADT<List<Student>> listStackADT = new StackADTListImpl<>(100);
        listStackADT.push(list1);
        listStackADT.push(list2);
        // In ra
        System.out.println(listStackADT);

        // Lay list tren dinh stack
        List<Student> topList = listStackADT.peek();
        for (int i = 0; i < topList.size(); i++) {
            System.out.println(topList.get(i));
        }

    }
}
