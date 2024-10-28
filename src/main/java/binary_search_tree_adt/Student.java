package binary_search_tree_adt;

public class Student implements Comparable<Student> {
    private int id;
    private String name;
    private String address;
    private int mark;

    public Student() {
    }

    public Student(int id, String name, String address, int mark) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.mark = mark;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", mark=" + mark +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if (this.id < o.id) {
            return -1;
        } else if (this.id > o.id) {
            return 1;
        }
        return 0;
    }
}
