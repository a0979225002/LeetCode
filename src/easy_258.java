public class easy_258 {
    public static int addDigits(int num) {
        int digitalRoot = 0;
        while (num > 0) {
            digitalRoot += num % 10;
            num = num / 10;

            System.out.println(digitalRoot);

            if (num == 0 && digitalRoot > 9) {
                num = digitalRoot;
                digitalRoot = 0;
            }
        }
        return digitalRoot;
    }

    public static void main(String[] args) {
        System.out.println(easy_258.addDigits(38));
    }
}
