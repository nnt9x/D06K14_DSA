package stack_generic;

public class Main {
    public static void main(String[] args) {
        AutoGradeSystem autoGradeSystem = new AutoGradeSystem(100);
        autoGradeSystem.add(new Exam("Code1", "Student 1"));
        autoGradeSystem.add(new Exam("Code2", "Student 2"));
        autoGradeSystem.add(new Exam("Code3", "Student 3"));

        // In ra diem
        try {
            autoGradeSystem.processAutoGradeAndComment();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
