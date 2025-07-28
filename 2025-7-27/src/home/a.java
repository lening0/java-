package home;

import java.util.Random;
import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        //双色球
        Random rand = new Random();
        int [] myBall =  new int[6];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<6;i++){
            int j =  sc.nextInt();
            myBall[i] = j;
        }
        int [] winBall =  new int [6];
        for(int i=0;i<5;){
            int n = rand.nextInt(33)+1;
            int count = 0;
            for(int j=0;j<i;j++){
                if(n==winBall[j]){
                    count++;
                }
            }
            if(count==0){
                winBall[i]=n;
                i++;
            }
        }
        int n = rand.nextInt(6)+1;
        winBall[5]=n;
//        for(int i=0;i<6;i++){
//            System.out.println(myBall[i]);
//        }
        for(int i=0;i<6;i++){
            System.out.println(winBall[i]);
        }
    }
}
