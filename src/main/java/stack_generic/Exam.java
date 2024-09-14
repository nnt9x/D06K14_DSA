package stack_generic;

public class Exam {
    private String code;
    private String studentName;
    private float mark;

    public Exam() {
    }

    public Exam(String code, String studentName) {
        this.code = code;
        this.studentName = studentName;
        this.mark = mark;
    }

    public Exam(String code, String studentName, float mark) {
        this.code = code;
        this.studentName = studentName;
        this.mark = mark;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        if (mark < 0 || mark > 10) {
            throw new RuntimeException("Mark error");
        }
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Exam{" +
                "code='" + code + '\'' +
                ", studentName='" + studentName + '\'' +
                ", mark=" + mark +
                '}';
    }
}
