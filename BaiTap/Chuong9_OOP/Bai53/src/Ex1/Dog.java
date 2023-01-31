package Ex1;

public class Dog extends Animal{
    private String color;
    private String species;
    private String petName;

    public Dog() {
    }

    public Dog(String petName) {
        this.petName = petName;
    }

    public Dog(String name, String petName) {
        super(name);
        this.petName = petName;
    }

    @Override
    public void eat(String food) {
        System.out.println("Chó " + petName + " đang ăn món "
        + food);
    }

    @Override
    public void giveBirth() {
        System.out.println("Chó là động vật đẻ con");
    }

    @Override
    public void sleep() {
        System.out.println("Chó " + petName +" đang ngủ");
    }

    @Override
    public void move() {
        System.out.println("Chó " + petName +" đi bằng 4 chân");
    }

    public void bask(){
        System.out.println("Chó " + petName + " đang sủa go go");
    }

    public void wagTail (){
        System.out.println("Chó " + petName + " đang vẫy đuôi");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }
}
