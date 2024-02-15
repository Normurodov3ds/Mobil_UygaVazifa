package Lesson27.Single_Responsibility.Developers;

public class Main {
    public static void main(String[] args) {
        Developer dev = new Developer("Komil","senior",23,5_000);
        Developer dev1 = new Developer("Dilshot","midle",22,2_500);
        Developer dev2 = new Developer("Farhod","junior",19,500);
        dev.coding();
        dev1.coding();
        dev2.coding();
        System.out.println();

        SwimmingFather swim = new Swimming();
        swim.developerSwim(dev1);
        swim.developerSwim(dev2);

        System.out.println();
        DriveSportCarFather drive = new DriveSportCar();
        drive.driveSportCar(dev);

        DriveSportCar driveSportCar = new DriveSportCar();
        driveSportCar.driveSportCar(new Developer("Jamshit","Midle",25,1500));

    }
}
