import java.util.LinkedList;
import java.util.List;

public class easy_67 {
    public static String addBinary(String a, String b) {

        //思路:如果兩個相加>=2 就讓下個進位的數字 = 1
        //直到下個進位的數字=0 代表結束

        int binary;
        int binary2= 0;
        int aIndex = a.length() - 1;
        int bIndex = b.length() - 1;

        List<Integer> answer= new LinkedList();


        while (binary2 >=1 || aIndex >= 0 || bIndex >= 0) {
            int a01=0;
            int b01=0;

            if (aIndex >= 0) {
                a01 = Integer.valueOf(String.valueOf(a.charAt(aIndex)));
                aIndex--;
            }

            if (bIndex >= 0) {
                b01 = Integer.parseInt(String.valueOf(b.charAt(bIndex)));
                bIndex--;
            }

            binary = a01+b01+binary2;

            if (binary>=2){
                binary = (a01+b01+binary2)%2;
                binary2 = 1;
            }else {
                binary2=0;
            }

           answer.add(0,binary);
        }
        String aa ="";
        for (int cc:answer){
             aa += cc+"";
        }


        return aa;
    }

    public static void main(String[] args) {
        System.out.println(easy_67.addBinary("1", "11"));

    }
}
