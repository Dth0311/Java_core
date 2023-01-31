package Ex1;

public interface AnimalAction {
    void eat(String food);

    void sleep();

    void move();

    void giveBirth();

    default void speak(String orther){
        System.out.println("Động vật đang nói chuyện với " + orther);
    }

    default void bask(){
        System.out.println("Động vật đang tắm nắng");
    }
}
