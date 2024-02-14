package Lesson26;


import Lesson26.Home.ConcrentBuilder;
import Lesson26.Home.Director;
import Lesson26.Home.Home;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ConcrentBuilder concrentBuilder = new ConcrentBuilder();
        Director director = new Director();
        System.out.println("Qanaqa uy olasi?");

        System.out.println(1+") Luxe Home 1 000 000 $");
        System.out.println(2+") Simple Home 500 000 $");
        System.out.println(3+") Very Very SimpleHome 50 000");
        System.out.println(4+") i vant to chose");
        int a = in.nextInt();
        switch (a){
            case 1-> director.LuxeHome(concrentBuilder);
            case 2-> director.SimpleHome(concrentBuilder);
            case 3-> director.VeryVerySipleHome(concrentBuilder);
            case 4-> director.i_want_to_choose(concrentBuilder);
        }
        Home home = concrentBuilder.getHome();
        System.out.println(home);
    }
}
