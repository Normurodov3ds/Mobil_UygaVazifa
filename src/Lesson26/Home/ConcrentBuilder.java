package Lesson26.Home;

import java.util.Scanner;

public class ConcrentBuilder implements HomeBuilder {
    private HomeBuilder.HomeName homeName;
    private HomeBuilder.HomeWall homeWall;
    private HomeBuilder.HomeGarden homeGarden;
    private HomeBuilder.HomeBasen homeBasen;
    private boolean yesFantan;
    private boolean kamen;
    private boolean garaj;


    @Override
    public void setWall(HomeWall homeWall) {
        this.homeWall = homeWall;
    }

    @Override
    public void ChangeName(HomeName homeName) {
        this.homeName = homeName;
    }

    @Override
    public void setBasen(HomeBasen homeBasen) {
        this.homeBasen = homeBasen;
    }

    @Override
    public void setGarden(HomeGarden homeGarden) {
        this.homeGarden = homeGarden;
    }

    @Override
    public void setKamen(boolean b) {
        if (b) {
            this.kamen = true;
        }
    }

    @Override
    public void setGaraj(boolean b) {
        if (b) {
            this.garaj = true;
        }
    }

    @Override
    public void setFantan(boolean b) {
        if (b) {
            this.yesFantan = true;
        }
    }

    public void chageWall() {

    }

    public int chageBasen() {
        Scanner in = new Scanner(System.in);
        int i =1;
        for (HomeBuilder.HomeBasen value : HomeBuilder.HomeBasen.values()) {
            System.out.print((i++)+")"+value + "  Bo'yi: " + value.getX() + " Eni: " + value.getY());
            switch (value) {
                case HomeBuilder.HomeBasen.BigBasen -> System.out.println(" 150_000$");
                case HomeBuilder.HomeBasen.LuxBasen -> System.out.println(" 250_000$");
                case HomeBuilder.HomeBasen.SimalBasen -> System.out.println(" 100_000$");
                case HomeBuilder.HomeBasen.SimpleBasen -> System.out.println(" 50_000$");
            }
        }
        int index = in.nextInt();
        switch (index) {
            case 1 -> {
                homeBasen =  HomeBuilder.HomeBasen.BigBasen; return (150_000);
            }
            case 2 -> {
                homeBasen =  HomeBuilder.HomeBasen.LuxBasen; return (250_000);
            }

            case 3 -> {
                homeBasen =  HomeBuilder.HomeBasen.SimalBasen; return (100_000);
            }

            case 4 -> {
                homeBasen = HomeBuilder.HomeBasen.SimpleBasen; return (50_000);
            }
        }
        return 0;
    }

    public Home getHome() {
        return new Home(homeName, homeWall, homeGarden, homeBasen, yesFantan, kamen, garaj);
    }
}
