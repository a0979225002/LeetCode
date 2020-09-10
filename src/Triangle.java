import java.util.Scanner;

public class Triangle {

    //題目:給你三個邊長,判斷為何種三角

    public static String triangle(int a,int b,int c){
        String aw = "";

        if (a+b<c || a==0 || b ==0 || c==0){
            aw = "此三邊無法構成三角形";

        }else if (a == b && b == c){
            aw = "此為正三角形";
        }

        return aw;
    }



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("請輸入三個邊長");
        System.out.print("邊長ㄧ:");
        int a = scanner.nextInt();
        System.out.print("邊長二:");
        int b = scanner.nextInt();
        System.out.print("邊長三:");
        int c = scanner.nextInt();

        System.out.println(Triangle.triangle(a,b,c));
    }
}
