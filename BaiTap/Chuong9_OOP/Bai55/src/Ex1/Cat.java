package Ex1;

public class Cat extends Mammal{
    private String eyesColor;
    private int age;
    private String hobby;
    private String petName;

    public Cat() {
    }

    public Cat(String petName) {
        this.petName = petName;
    }

    @Override
    public void makeFood() {
        System.out.println("Mèo đang rình bắt chuột để làm thức ăn");
    }

    @Override
    public void eat() {
        System.out.println("Mèo thích cá rán");
    }

    @Override
    public void sleep() {
        System.out.println("Mèo đang ngủ trên ghế");
    }

    @Override
    public void move() {
        System.out.println("Mèo nhảy từ tòa nhà này sang nhà khác");
    }

    @Override
    public final void relax() {
        System.out.println("Mèo đang giải trí");
    }

    public final String getEyesColor() {
        return eyesColor;
    }

    public final void setEyesColor(String eyesColor) {
        this.eyesColor = eyesColor;
    }

    public final int getAge() {
        return age;
    }

    public final void setAge(int age) {
        this.age = age;
    }

    public final String getHobby() {
        return hobby;
    }

    public final void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public final String getPetName() {
        return petName;
    }

    public final void setPetName(String petName) {
        this.petName = petName;
    }
}
