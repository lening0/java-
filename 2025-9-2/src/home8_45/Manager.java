package home8_45;

public class Manager extends Worker{
    private int manageMoney;

    public Manager() {
    }

    @Override
    public void work(){
        System.out.println("manage people");
    }

    public Manager(int manageMoney) {
        this.manageMoney = manageMoney;
    }

    public void managePeople(){
        System.out.println("管理他人");
    }


    /**
     * 获取
     * @return manageMoney
     */
    public int getManageMoney() {
        return manageMoney;
    }

    /**
     * 设置
     * @param manageMoney
     */
    public void setManageMoney(int manageMoney) {
        this.manageMoney = manageMoney;
    }


}
