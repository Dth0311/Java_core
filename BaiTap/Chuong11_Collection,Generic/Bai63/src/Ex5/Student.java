package Ex5;

public class Student implements Comparable<Student>{
    private String id;
    private String name;
    private float avg;

    public Student() {
    }

    public Student(String id, String name, float avg) {
        this.id = id;
        this.name = name;
        this.avg = avg;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAvg() {
        return avg;
    }

    public void setAvg(float avg) {
        this.avg = avg;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", avg=" + avg +
                '}';
    }

    @Override
    public int compareTo(Student o) {
       return id.compareToIgnoreCase(o.id);
    }
}
