package S.O.L.I.D;

public class Main2 {
    public static void main(String[] args) {
        System.out.println(convertToTitle(701));

    }
    public static String convertToTitle(int s) {
        StringBuilder str = new StringBuilder();
        int a = s;
        int sum = 0;
        while (sum<s){
            int count = 0;
            while (a>=26){
                a/=26;
                count++;
            }
           double d = Math.pow(26,count);

            sum+=(int) (d+a);
            System.out.println(d);
            System.out.println((char)(count+64));
            str.append((char) (d+64));
            str.append((char) (a+64));
        }

        return str.toString();
    }

}
