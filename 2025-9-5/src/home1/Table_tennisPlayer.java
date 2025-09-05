package home1;

public class Table_tennisPlayer extends Athlete implements English {
    public Table_tennisPlayer() {}
    public Table_tennisPlayer(String name, int age) {
        super(name, age);
    }
    @Override
    public void play() {
        System.out.println("play Table_tennis");
    }
    @Override
    public void english() {
        System.out.println("english");
    }

}
