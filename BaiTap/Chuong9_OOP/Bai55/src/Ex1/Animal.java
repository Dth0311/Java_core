package Ex1;

public abstract class Animal {
    private String name;
    private String species;
    private float height;
    private float weight;
    private String habitat; // môi trường sống
    private String birthForm; // hình thức sinh sả

    public Animal() {
    }

    public Animal(String name, String species, float height, float weight) {
        this.name = name;
        this.species = species;
        this.height = height;
        this.weight = weight;
    }

    public Animal(String name, String species, float height, float weight,
                  String habitat, String birthForm) {
        this.name = name;
        this.species = species;
        this.height = height;
        this.weight = weight;
        this.habitat = habitat;
        this.birthForm = birthForm;
    }

    // các hành động của động vật
    protected abstract void eat();

    protected abstract void sleep();

    protected abstract void move();

    protected abstract void relax();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getBirthForm() {
        return birthForm;
    }

    public void setBirthForm(String birthForm) {
        this.birthForm = birthForm;
    }
}
