package home;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        Car [] arr = new Car[3];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            //颜色
            System.out.println("请输入价格");
            int p = sc.nextInt();
            //名字
            System.out.println("请输入品牌");
            String b = sc.next();
            //颜色
            System.out.println("请输入颜色");
            String c = sc.next();
            Car car =  new Car(b,p,c);
            arr[i] = car;
            System.out.println(car.getBrand()+car.getPrice()+car.getColor());
        }



    }
}
