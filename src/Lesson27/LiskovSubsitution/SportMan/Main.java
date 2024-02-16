package Lesson27.LiskovSubsitution.SportMan;

public class Main {
    public static void main(String[] args) {
        Box box = new Boxer();
        box.hit();
        Foodbol foodbol = new Footbolist();
        foodbol.run();

    }
}
