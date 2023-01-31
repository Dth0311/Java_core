package Ex3;

public class Transcript {
    private String id;
    private float grade1;
    private float grade2;
    private float grade3;
    private float avdGrade;
    private Capacity capacity;

    public Transcript() {
    }

    public Transcript(String id, float grade1, float grade2,
                      float grade3, float avdGrade, Capacity capacity) {
        this.id = id;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
        this.avdGrade = avdGrade;
        this.capacity = capacity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getGrade1() {
        return grade1;
    }

    public void setGrade1(float grade1) {
        this.grade1 = grade1;
    }

    public float getGrade2() {
        return grade2;
    }

    public void setGrade2(float grade2) {
        this.grade2 = grade2;
    }

    public float getGrade3() {
        return grade3;
    }

    public void setGrade3(float grade3) {
        this.grade3 = grade3;
    }

    public float getAvdGrade() {
        return avdGrade;
    }

    public void setAvdGrade(float avdGrade) {
        this.avdGrade = avdGrade;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }

    // phuong thuc tinh diem trung binh
    public void calculAvgGrade() {
        this.avdGrade = (grade1 + 2 * grade2 + 3 * grade3) / 6;
    }

    // phuong thu dung de danh gia thuc luc
    public void calculCapacity() {
        if (avdGrade >= 9.0f) {
            capacity = capacity.A_PLUS;
        } else if (avdGrade >= 8.0f) {
            capacity = capacity.A;
        } else if (avdGrade >= 6.5f) {
            capacity = capacity.B;
        } else if (avdGrade >= 5.0) {
            capacity = capacity.C;
        } else if (avdGrade >= 4.0f) {
            capacity = capacity.D;
        } else {
            capacity = capacity.F;
        }
    }
}
