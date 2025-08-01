package home;

public class StudentTest {
    public static void main(String[] args) {
        Student [] arr = new Student[3];
        Student [] arr1 = new Student[4];
        Student s1 = new Student("马云",999,20);
        Student s2 = new Student("马化腾",888,19);
        Student s3 = new Student("马斯克",666,18);
        //
        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;
        //
        Student s4 = new Student("lxn",667,18);
        //
        int remove = 667;
        //
        for(int i =0;i<arr.length;){
            if(arr[i].getId()!=s4.getId()){
                arr1[i] = arr[i];
                if(i==arr.length-1){
                    arr1[i+1] = s4;
                    for(int j =0;j<arr1.length;j++){
                        System.out.println(arr1[j].getName());
                    }
                    break;
                }
                i++;
                continue;
            }
            System.out.println("加入失败");
            break;
        }
        int dex = getIndex(arr1,remove);
        if(dex != 0){
            arr1[dex] = null;
        }else{
            System.out.println("删除失败");
        }
        for(int j =0;j<arr1.length;j++){
            if(arr1[j]!=null){
                System.out.println(arr1[j].getName());
            }
        }
        int jia = 666;
        int dex1 = getIndex(arr1,jia);
        if(dex1!=-1){
            arr1[dex1].setAge(arr1[dex1].getAge() + 1);
        }else {
            System.out.println("添加失败");
        }
    }
    public static int getIndex(Student [] arr ,int id){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=null && arr[i].getId()==id){
                return i;
            }
        }
        return -1;
    }
}
