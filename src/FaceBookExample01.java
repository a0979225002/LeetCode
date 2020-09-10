public class FaceBookExample01 {
    public static void main(String[] args) {
    //例題:1~3000有多少個 比如 122 有兩個2

        String numStr = "";
        int numLength = 0;
        int answer= 0;

        for (int i = 1 ; i<=3000;i++){

         numStr = String.valueOf(i);

         numLength = numStr.length()-1;

            for (int j = numLength; j>=0;j--){
                String a = String.valueOf(numStr.charAt(j));
                if (a.equals("2")){
                    answer++;
                }
            }
        }
        System.out.println(answer);
    }
}
