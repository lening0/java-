package home9_24;

public class Worker {
    int id;
    String name;

    public Worker() {
    }

    public Worker(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void Work(){
        System.out.println("暂无工作");
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


}
