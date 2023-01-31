package Ex1;

public abstract class Animal implements AnimalAction {
    private String name;
    private int age;
    private float weight;
    private String favFood;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, int age, float weight,
                  String favFood) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.favFood = favFood;
    }

    @Override
    public void sleep() {
        System.out.println("Động vật đang ngủ");
    }

    @Override
    public void move() {
        System.out.println("Động vật đang di chuyển");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getFavFood() {
        return favFood;
    }

    public void setFavFood(String favFood) {
        this.favFood = favFood;
    }
}
