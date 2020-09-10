import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class T2 {

    public static void main(String[] args) {

        /**
         * 第一題
         */

        String a = "This is a book。";

        //將全部的單字,都轉成英文字母各別存入,目的讓空格跟著字母走
        String[] strArray = a.trim().split("");

        List<String> list = new LinkedList<>();

        //讓整個陣列反轉,加入到list中
        for (int i =0;i<strArray.length;i++){
            list.add(0,strArray[i]);
        }
        System.out.println(list.toString());
        //[k, o, o, b,  , a,  , s, i,  , s, i, h, T]

        //將集合內文字用尋訪方式全部加入到 b 這個 字串中
        String b ="";
        for (String c:list){
            b+=c;
        }
        //第一題解答
        System.out.println("第一題解答:"+b);
        //koob a si sihT


        /**
         * 第二題第二種解法
         */

        System.out.println("第二題第二種解法:"+T2.Question2(b));



        /**
         * 第二題
         */
        //撈出第一個單字,放入a2這個字串中
        String a2="";
        for (int i = 0; i<list.size();i++){
            //如果該集合位置是" "的話
            if (list.get(i).trim().isEmpty()){
                for (int j=i ; j>=0;j--){
                 //將之前尋訪的英文字,反轉後加入a2字串中
                 a2 += list.get(j);
                 //刪除 list的 第一個單字
                 list.remove(j);
                }
                break;
            }
        }

        System.out.println(list.toString());
        //[a,  , s, i,  , s, i, h, T]

        //新增一個加入字串的位置
        int index = 0;
        List<String> list1= new LinkedList();
        //將list內的字反轉
        for (int i = 0; i<list.size();i++){
            //如果該集合位置是" "的話
            if (list.get(i).trim().isEmpty()){
                index = i;
                //讓他直接加入
                list1.add(index,list.get(i));
                //然後讓index+1 目的是讓下個加入的單字能在空格後面
                index++;
            }else {
                //如果該集合位置不是" "的話,就直接讓字串加入index所指定的位置上
                list1.add(index,list.get(i));
            }
        }
        //將剛剛尋訪出來的第一個單字加入到陣列中
        list1.add(a2);

        System.out.println(list1.toString());
        //[a,  , i, s,  , T, h, i, s,  book。]

        //尋訪整個list1 讓c2加入該單字
        String c2 ="";
        for (String c:list1){
            c2 +=c;
        }

        System.out.println("第二題解答:"+c2);


        System.out.println("=================================================");

        /**
         * 第三題
         */
        System.out.println("第三題");
        System.out.println("請輸入一個數字,他將會判斷是否為質數");
        Scanner scanner = new Scanner(System.in);
//判斷是否輸入的值超過1不然得重新輸入:============================================
        boolean numTrue = true;
        int num = 0;
        //獲取大於1的數字
        while (numTrue){
            num = scanner.nextInt();
            if (num<=1){
                System.out.println("請輸入大於1的數字");
            }else {
                numTrue = false;
            }
        }

//數字反轉:============================================

        String strNum = String.valueOf(num);

        //轉成陣列
        String[] strNum2 = strNum.split("");

        List<String> list2 = new LinkedList<>();
        //加入迴圈讓數字反轉
        for (int i = 0; i<strNum2.length;i++){
            list2.add(0,strNum2[i]);
        }
        //新增字串宣告,將反轉的字加入該字串中
        strNum = "";
        for (String aa:list2){
            strNum +=aa;
        }
        //轉成數字
        int contrarynum = Integer.valueOf(strNum);
        System.out.println(contrarynum);

//判斷質數:============================================
        boolean prime = false;//單質數
        boolean doubleprime = false;//反轉質數

        //判斷一開始的數字
        if (num==2){//如果他是2
            prime = true;
        }else if (num%2!=0){//他不是偶數
                for (int i= 2;i<=num/2;i++){
                    if (num%i==0){
                        break;//被整除了就離開回圈,代表不是質數
                    }else if (i== num/2 && num%i!=0){
                        prime = true;
                    }
                }
        }
        //判斷反轉後的數字
        if (contrarynum==2){//如果他是2
            doubleprime = true;
        }else if (contrarynum%2!=0){//他不是偶數
            for (int i= 2;i<=contrarynum/2;i++){
                if (contrarynum%i==0){
                    break;//被整除了就離開回圈,代表不是質數
                }else if (i== contrarynum/2 && contrarynum%i!=0){
                    doubleprime = true;
                }
            }
        }

        System.out.println("prime:"+prime+","+"doubleprime:"+doubleprime);

        if (prime==false && doubleprime == false)System.out.println("他不是質數");
        if (prime==true && doubleprime == false)System.out.println("他是單質數");
        if (prime==false && doubleprime == true)System.out.println("他是單個反質數");
        if (prime==true && doubleprime == true)System.out.println("他是雙質數");

    }

    public static String Question2(String question2){

        String[] aa = question2.split(" ");

        List<String> list = new ArrayList<String>();
        String aa3 = "";
        for (int i =0; i<aa.length;i++){
            aa3 = "";
            String aa2 = aa[i];

            for (int j=aa2.length();j>0;j--){
                aa3 += aa2.substring(j-1,j);
            }
            list.add(aa3);
        }

        list.add(list.get(0));
        list.remove(0);

        aa3 = "";
        for ( String a:list){
            aa3 += a+" ";
        }

        return aa3;
    }
}
