package home;

//public class me {
//    private int age;
//    private String name;
//    //空参
//    public me(){};
//    //带全部参数的构造
//    public me(int age, String name){
//        this.age = age;
//        this.name = name;
//    }
//    public  int getAge() {
//        return age;
//    }
//    public void setAge(int age) {
//        if (age >= 18) {
//            this.age = age;
//        }
//    }
//}
//public class me {
//    private int age;
//    private String name;
//
//    public me(int age, String name) {
//        this.age = age;
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        if (age >= 18) {
//            this.age = age;
//        }
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//}
public class me{
    private int age;
    private String name;

    public me() {
        System.out.println("me");
    }

    public me(int age, String name) {
        this.age = age;
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
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