package home1;

public class Test {
    public static void main(String[] args) {
        Table_tennisPlayer pps=new Table_tennisPlayer("lxn",18);
        System.out.println(pps.getName()+pps.getAge());
        pps.play();
        pps.english();
    }
}
