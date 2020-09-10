import java.util.Scanner;

public class Rounding {

    public static void main(String[] args) {

        //我這邊有個浮點數 比如他是10.335
        //我要判斷他的小數點後三位是否可以四捨五入，如果可以他會變成10.34
        //然後再繼續判斷第二位數能不能四捨五入如果不能,判斷到最後,打印出int類型

        //例題一
        //input 10.335
        //output 10

        //例題二
        //input 11.447
        //output 12

        System.out.println(Rounding.rounding(13.448f));
    }

    public static int rounding(float num){
        //解題思維：

        String num01 = String.valueOf(num);

        String[] nums = num01.split("\\.");

       int aa = 0;
       for (int i =nums[1].length()-2;i>=0;i--){
           int num02 = Integer.valueOf(String.valueOf(nums[1].charAt(i)))+aa;

           if (num02>=5){
               aa =1;
           }else {
               aa = 0;
               break;
           }
       }
       int num03 = (int)num+aa;


        return num03;
    }
}
