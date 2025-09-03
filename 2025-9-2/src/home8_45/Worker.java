package home8_45;

public class Worker {
    int id;
    String name;
    int money;

    public Worker() {
    }

    public void work(){

    }


    public Worker(int id, String name, int money) {
        this.id = id;
        this.name = name;
        this.money = money;
    }

    public void eat(){
        System.out.println("吃饭");
    }

    /**
     * 获取
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return money
     */
    public int getMoney() {
        return money;
    }

    /**
     * 设置
     * @param money
     */
    public void setMoney(int money) {
        this.money = money;
    }


}
