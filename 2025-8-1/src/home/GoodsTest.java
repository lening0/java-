package home;

import java.util.Scanner;

public class GoodsTest {
    public static void main(String[] args) {
        Goods [] arr =  new Goods [3];
        Goods r1 = new Goods(1,"apple",9.0,100);
        Goods r2 = new Goods(2,"orange",7.0,200);
        Goods r3 = new Goods(3,"pear",8.0,70);
        arr[0] = r1;
        arr[1] = r2;
        arr[2] = r3;
        for( int i = 0; i < arr.length; i++ ) {
            Goods g = arr[i];
            System.out.println(g.getId() + "," + g.getName() + ","+g.getPrice() + ","+g.getCount());

        }

    }
}
