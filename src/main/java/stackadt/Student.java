package stackadt;

public class Student {
    private int id;
    private String name;
    private String dob;
    private boolean gender;
    private double mark;

    public Student() {
    }

    public Student(int id, String name, String dob, boolean gender, double mark) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.mark = mark;
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", gender=" + gender +
                ", mark=" + mark +
                '}';
    }
}
