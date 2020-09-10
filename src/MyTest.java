
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyTest {


    public static void main(String[] args) {
        //都 static 方法  直接呼叫傳參數
        s1("This is a book");
        s2("This is a book");
        s3(14429);

    }

    public static String s1(String str) {
        // 空字串等著存入反轉的字串
        String str2 = "";
        //從尾端開始取一個字母直到最前端
        for (int i = str.length() - 1; i > -1; i--) {
            str2 += str.substring(i, i + 1);
        }
        System.out.println(str2);
        return str2;
    }

    public static String s2(String str) {
        //字串轉成陣列 以空格為基準點split
        String[] ar = str.split(" ");

        //暫存字串
        String ans = "";
        //因最後一個單字一樣在最後,故從倒數第二個單字開始往前
        for (int i1 = ar.length - 2; i1 >= 0; i1--) {
            ans += ar[i1]+" ";
            System.out.println(ans);
        }
        //再加上最後一個單字
        ans += ar[ar.length-1];
        System.out.println(ans);

        return ans;
    }


    public static void s3(int num) {
        //將int轉為字串
        String num1 = num + "";
        //拿來存入反轉的字串用
        String num2 = "";
        //將反轉的字串轉為int用
        int num3 = 0;
        //檢驗用
        boolean isPrime = true;
        //傳入的int驗證是否為質數，只檢驗到自己的三分之一
        for (int i = 2; i <= num / 3; i++) {
            //若可被整除就不是質數
            if (num % i == 0) isPrime = false;
        }
        //不是質數 輸出
        if (!isPrime) System.out.println(num + " is not a prime!");

        //是質數
        if (isPrime) {
            //反轉
            for (int i = num1.length() - 1; i > -1; i--) {
                num2 += num1.substring(i, i + 1);
                System.out.println(num2);
            }
            //轉成int
            num3 = Integer.parseInt(num2);
            //再跑一次和上面一樣的
            for (int i = 2; i < num3 / 3; i++) {
                //反轉後的若可以被整除就不是質數
                if (num3 % i == 0) isPrime = false;
            }
            //輸出各自結果
            if (!isPrime) System.out.println(num3 + " 單質數");
            if (isPrime) System.out.println(num3 + " 雙質數");

        }
    }



}
