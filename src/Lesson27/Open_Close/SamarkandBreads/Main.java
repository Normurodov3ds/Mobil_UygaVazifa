package Lesson27.Open_Close.SamarkandBreads;

public class Main {
    public static void main(String[] args) {
        ButterBread butterBread = new ButterBread("un","suv","yog'");
        butterBread.makeBread();
        System.out.println();
        BigBread bigBread = new BigBread("un","suv");
        bigBread.makeBread();
    }
}
