package Lesson26.Home;

import java.util.Scanner;

public class Director {
    public void LuxeHome(ConcrentBuilder concrentBuilder) {
        concrentBuilder.ChangeName(HomeBuilder.HomeName.LuxHome);
        concrentBuilder.setWall(HomeBuilder.HomeWall.BrickWall);
        concrentBuilder.setBasen(HomeBuilder.HomeBasen.LuxBasen);
        concrentBuilder.setGarden(HomeBuilder.HomeGarden.LuxLanshaft);
        concrentBuilder.setGaraj(true);
        concrentBuilder.setKamen(true);
        concrentBuilder.setFantan(true);
    }

    public void SimpleHome(ConcrentBuilder concrentBuilder) {
        concrentBuilder.ChangeName(HomeBuilder.HomeName.SimpleHome);
        concrentBuilder.setWall(HomeBuilder.HomeWall.ConcreteWall);
        concrentBuilder.setGarden(HomeBuilder.HomeGarden.SimpleLanshaft);
        concrentBuilder.setBasen(HomeBuilder.HomeBasen.SimpleBasen);
        concrentBuilder.setFantan(false);
        concrentBuilder.setKamen(true);
        concrentBuilder.setGaraj(true);
    }

    public void VeryVerySipleHome(ConcrentBuilder concrentBuilder) {
        concrentBuilder.ChangeName(HomeBuilder.HomeName.SimpleHome);
        concrentBuilder.setWall(HomeBuilder.HomeWall.ConcreteWall);
        concrentBuilder.setGarden(HomeBuilder.HomeGarden.SimpleLanshaft);
        concrentBuilder.setGaraj(false);
        concrentBuilder.setKamen(false);
        concrentBuilder.setFantan(false);
    }

    public void i_want_to_choose(ConcrentBuilder concrentBuilder) {
        Scanner in = new Scanner(System.in);
        int price = 0;

        Sout<String> massage = System.out::println;
        int i = 1;
        HomeBuilder.HomeName[] values = HomeBuilder.HomeName.values();
        for (HomeBuilder.HomeName value : HomeBuilder.HomeName.values()) {
            massage.sout((i++) + ") " + value);
            switch (value) {
                case Business -> massage.sout(" 1 000 000 $");
                case LuxHome -> massage.sout(" 500 000 $");
                case SimpleHome -> massage.sout(" 250 000 $");
            }
        }
        do {
            massage.sout("Uy tanlang!\n");
            int index = in.nextInt();
            switch (index) {
                case 1 -> {
                    concrentBuilder.ChangeName(values[0]);
                    price = 1_000_000;
                    massage.sout("Devori nimadan bo'lsin!\n Gishdan (+100 000$) yoki Betondan (50 000$)? \n 1)Ha 2)Yoq beton");
                    int wall = in.nextInt();
                    if (wall == 1) {
                        concrentBuilder.setWall(HomeBuilder.HomeWall.BrickWall);
                        price -= 100_000;
                    } else {
                        concrentBuilder.setWall(HomeBuilder.HomeWall.ConcreteWall);
                        price -= 50_000;
                    }
                    massage.sout("Baseyen tanlang!");
                    int sum = concrentBuilder.chageBasen();
                    if (sum != 0) {
                        massage.sout("basen tanlandi! " + "+" + sum + "$");
                    } else System.out.println("basen tanlanmadi!");
                    price -= sum;
                    System.out.println("Bog' Luxlanshaft! +100_000$");
                    price -= 100_000;
                    System.out.println("Fantan bolsinmi? 1)ha 2)yoq");
                    if (in.nextInt() == 1) {
                        concrentBuilder.setFantan(true);
                    }
                    System.out.println("Graj bolsinmi? 1)ha 2)yoq");
                    if (in.nextInt() == 1) {
                        concrentBuilder.setGaraj(true);
                    }
                    System.out.println("Kamen bolsinmi? 1)ha 2)yoq");
                    if (in.nextInt() == 1) {
                        concrentBuilder.setKamen(true);
                    }
                    if (price >= 0) {
                        break;
                    } else System.out.println("Narx to'gri krlmadi!");

                    System.out.println("narxi "+price+" $");
                }
                case 2 -> {
                    concrentBuilder.ChangeName(values[1]);
                    price = 500_000;
                    massage.sout("Devori nimadan bo'lsin!\n Gishdan (+100 000$) yoki Betondan (50 000$)? \n 1)Ha 2)Yoq beton");
                    int wall = in.nextInt();
                    if (wall == 1) {
                        concrentBuilder.setWall(HomeBuilder.HomeWall.BrickWall);
                        price -= 100_000;
                    } else {
                        concrentBuilder.setWall(HomeBuilder.HomeWall.ConcreteWall);
                        price -= 50_000;
                    }
                    System.out.println("Base tanlang");
                   int basensum= concrentBuilder.chageBasen();
                   if (basensum!=0){
                       price-=basensum;
                       System.out.println("basen tanlandi +"+basensum+"$");
                   }else {
                       System.out.println("basen tanlanmadi!");
                   }
                    System.out.println("Bog' Simple lansghaft! +50_000$");
                   concrentBuilder.setGarden(HomeBuilder.HomeGarden.SimpleLanshaft);
                    price -= 50_000;
                    System.out.println("Fantan bolsinmi? 1)ha 2)yoq");
                    if (in.nextInt() == 1) {
                        concrentBuilder.setFantan(true);
                    }
                    System.out.println("Graj bolsinmi? 1)ha 2)yoq");
                    if (in.nextInt() == 1) {
                        concrentBuilder.setGaraj(true);
                    }
                    System.out.println("Kamen bolsinmi? 1)ha 2)yoq");
                    if (in.nextInt() == 1) {
                        concrentBuilder.setKamen(true);
                    }
                    if (price >= 0) {

                    } else System.out.println("Narx to'gri krlmadi!");
                    System.out.println("narxi "+price+" $");
                }
                case 3 -> {
                    concrentBuilder.ChangeName(values[2]);
                    price = 250_000;
                    massage.sout("Devori nimadan bo'lsin!\n Gishdan (+100 000$) yoki Betondan (50 000$)? \n 1)Ha 2)Yoq beton");
                    int wall = in.nextInt();
                    if (wall == 1) {
                        concrentBuilder.setWall(HomeBuilder.HomeWall.BrickWall);
                        price -= 100_000;
                    } else {
                        concrentBuilder.setWall(HomeBuilder.HomeWall.ConcreteWall);
                        price -= 50_000;
                    }
                    System.out.println("Bog'yo'q!");
                    System.out.println("Fantan yo'q");
                    System.out.println("Graj bolsinmi? 1)ha 2)yoq");
                    if (in.nextInt() == 1) {
                        concrentBuilder.setGaraj(true);
                    }
                    System.out.println("Kamen bolsinmi? 1)ha 2)yoq");
                    if (in.nextInt() == 1) {
                        concrentBuilder.setKamen(true);
                    }
                    if (price >= 0) {
                    } else System.out.println("Narx to'gri krlmadi!");

                    System.out.println("narxi "+price+" $");
                }
                default -> massage.sout("siz uy tanlamadingiz u?\n");
            }
        } while (price < 0);
    }
}
