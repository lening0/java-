package home;

public class b {
    public static void main(String[] args) {
        int [][] arr = {
                {22,66,44},
                {77,33,88},
                {25,45,65},
                {11,66,99}
        };
        int ret = 0;//全年
        int ret1 = 0;//季度
        for(int i=0;i< 4;i++){
            ret1 = 0;
            for(int j=0;j<3;j++){
                ret += arr[i][j];
                ret1 += arr[i][j];
            }
            System.out.println("第"+(i+1)+"季度为"+ret1);
        }
        System.out.println("总季度为"+ret);
    }

}
