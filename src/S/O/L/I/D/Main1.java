package S.O.L.I.D;

public class Main1 {
    public static void main(String[] args) {
        System.out.println(titleToNumber("ZY"));

        System.out.println('A'-64);

    }

    public static int titleToNumber(String s) {

        int sum = 0;
        int n = s.length();
        for (int i = 0 ; i <n; i++) {
            int index = s.charAt(i) - 64;
            double p =index;
            for (int j = 1; j < n-i; j++) {
                p*=26;
            }
            sum+=p;
        }
        return sum;
    }


}
