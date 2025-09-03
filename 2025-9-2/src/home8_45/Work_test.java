package home8_45;

public class Work_test {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.work();
        manager.setManageMoney(10);
        System.out.println(manager.getManageMoney());
        Cook cook = new Cook();
        cook.work();
    }
}
