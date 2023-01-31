package Ex1;

public class Test {
    public static void main(String[] args) {
        Dog bob = new Dog("BOb");
        bob.setColor("Black");
        System.out.println("Tên con chó là " + bob.getPetName());
        bob.move();
        bob.bask();
    }
}
