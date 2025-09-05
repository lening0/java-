package home1;

public class Table_tennisCoach extends Coach implements English {
    public Table_tennisCoach() {}
    public Table_tennisCoach(String name,int age) {
        super(name,age);
    }
    @Deprecated
    public void tech(){
        System.out.println("tech tb");
    }
    @Override
    public void english() {
        System.out.println("english");
    }

}
