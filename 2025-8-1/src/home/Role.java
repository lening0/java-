package home;

import java.util.Random;

public class Role {
    String name;
    int blood;

    public Role() {
    }

    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getBlood() {
        return blood;
    }


    public void setBlood(int blood) {
        this.blood = blood;
    }

    public void attack(Role role) {
        Random rand = new Random();
        int hurt = rand.nextInt(20)+1;
        int remainBlood = role.getBlood() - hurt;
        remainBlood = remainBlood < 0 ? 0 : remainBlood;
        role.setBlood(remainBlood);
        System.out.println(this.getName() + "打了" + role.getName() + hurt + "点血，"
                + role.blood + "还剩" + remainBlood + "血");
    }
}
