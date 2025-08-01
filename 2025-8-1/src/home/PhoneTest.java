package home;

public class PhoneTest {
    public static void main(String[] args) {
        Phone [] arr = new Phone[3];
        Phone p1 = new Phone("Apple",7999,"black");
        Phone p2 = new Phone("HUAWEI",7999,"black");
        Phone p3 = new Phone("Xiaomi",1999,"yellow");
        arr [0] = p1;
        arr [1] = p2;
        arr [2] = p3;
//        int AveragePrice = (p1.getPrice()+p2.getPrice()+p3.getPrice()) / 3;
//        System.out.println("平均价格为" + AveragePrice);
        int sum = 0;
        for(int j=0;j<arr.length;j++){
            Phone p = arr[j];
            sum += p.getPrice();
        }
        int Average =  sum/arr.length;
        System.out.println(Average);
        for(int j=0;j<arr.length;j++){
            Phone p = arr[j];
            if(p.getPrice()>Average){
                System.out.println(p.getBrand()+p.getPrice()+p.getColor());
            }
        }
    }
}
