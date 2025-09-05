package home1;

public class BasketballCoach extends Coach implements English {
    public BasketballCoach() {}
    public BasketballCoach(String name,int age) {
        super(name,age);
    }
    @Deprecated
    public void tech(){
        System.out.println("tech bs");
    }
    @Override
    public void english() {
        System.out.println("english");
    }
}
