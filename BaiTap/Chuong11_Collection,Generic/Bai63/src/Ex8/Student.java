package Ex8;

import java.util.Objects;

public class Student implements Comparable<Student>{
    private String id;
    private String name;
    private float avgGrade;

    public Student() {
    }

    public Student(String id, String name, float avgGrade) {
        this.id = id;
        this.name = name;
        this.avgGrade = avgGrade;
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

    public float getAvgGrade() {
        return avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", avgGrade=" + avgGrade +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return id.compareToIgnoreCase(o.id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
