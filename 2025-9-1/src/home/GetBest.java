package home;

import java.util.ArrayList;

public class GetBest {
    private GetBest() {};
    public static int getBest(ArrayList<Student> list) {
        int best = 0;
        Student stu = new Student();
        for (int i = 0; i < list.size(); i++) {
            stu = list.get(i);
            if(stu.getAge() > best){
                best = stu.getAge();
            }
        }
        return best;
    }
}
