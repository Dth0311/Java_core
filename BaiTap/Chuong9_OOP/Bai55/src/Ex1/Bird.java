package Ex1;

public class Bird extends Animal{
    private String color;
    private String mainFood;
    private float wingpan;

    public Bird() {
    }

    public Bird(String name, String species, float height, float weight) {
        super(name, species, height, weight);
    }

    public Bird(String color, String mainFood, float wingpan) {
        this.color = color;
        this.mainFood = mainFood;
        this.wingpan = wingpan;
    }

    public Bird(String name, String species, float height, float weight, String habitat,
                String birthForm, String color, String mainFood, float wingpan) {
        super(name, species, height, weight, habitat, birthForm);
        this.color = color;
        this.mainFood = mainFood;
        this.wingpan = wingpan;
    }
    public void chatter(){
        System.out.println(getName() + " đang hót líu lo....");
    }

    public final String getColor() {
        return color;
    }

    public final void setColor(String color) {
        this.color = color;
    }

    public final String getMainFood() {
        return mainFood;
    }

    public final void setMainFood(String mainFood) {
        this.mainFood = mainFood;
    }

    public final float getWingpan() {
        return wingpan;
    }

    public final void setWingpan(float wingpan) {
        this.wingpan = wingpan;
    }

    // các phương thức của lớp cha

    @Override
    public void eat() {
        System.out.println("Override lại phương thức eat() trong lớp Bird");
    }

    @Override
    public void sleep() {
        System.out.println("Override lại phương thức sleep() trong lớp Bird");
    }

    @Override
    public void move() {
        System.out.println("Override lại phương thức move() trong lớp Bird");
    }

    @Override
    public void relax() {
        System.out.println("Override lại phương thức relax() trong lớp Bird");
    }
}
