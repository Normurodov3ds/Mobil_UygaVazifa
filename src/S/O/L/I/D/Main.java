package S.O.L.I.D;


public class Main {
    public static void main(String[] args) {

        System.out.println(isPowerOfThree(5));
    }
    public static boolean isPowerOfThree(int n) {
        if (n<=0) return false;

        do {
            if (n%3!=0){
                return false;
            }else {
                n /=3;
            }
        }while (n>3);
        return true;
    }
}
