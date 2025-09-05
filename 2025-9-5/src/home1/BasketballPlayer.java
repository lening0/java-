package home1;

public class BasketballPlayer extends Athlete{

    public BasketballPlayer() {}
    public BasketballPlayer(String name, int age) {
        super(name, age);
    }
    @Override
    public void play() {
        System.out.println("play basketball");
    }
}
