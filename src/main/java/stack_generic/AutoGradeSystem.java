package stack_generic;

public class AutoGradeSystem {
    // Thuoc tinh
    private Stack<Exam> examStack;
    private int capacity;

    // Phuong thuc khoi tao
    public AutoGradeSystem(int capacity) {
        this.capacity = capacity;
        this.examStack = new Stack<>(capacity);
    }

    private int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    // Phuong thuc: them bai thi
    public void add(Exam e) {
        this.examStack.push(e);
    }

    // Tinh diem va in thong tin
    public void processAutoGradeAndComment() throws InterruptedException {
        while (!examStack.isEmpty()) {
            // Lay tung bai va in ra diem
            Exam e = examStack.pop();
            System.out.println("Chấm bài cho sinh viên: " + e.getStudentName());
            e.setMark(getRandomNumber(0, 10));
            // In ra bai lam cua sinh vien
            Thread.sleep(2000);
            System.out.println(e);
            System.out.println("---------------------");
        }
    }
}
