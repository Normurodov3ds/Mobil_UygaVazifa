package Lesson28.HomeWork.DependensyInvertion;

public class Main1 {
    public static void main(String[] args) {

        Drive ambulance = new ambulance();
        Drive taxi = new Taxi();
        Driver driver = new Driver(ambulance);
        Driver driver1 = new Driver(taxi);

        driver.carDrive();

        driver1.carDrive();


    }
}

class Driver{
    private Drive drive;

    public Driver(Drive drive) {
        this.drive = drive;
    }
    void carDrive(){
        drive.drive();
    }
}


interface Drive {
    void drive();
}

class Taxi implements Drive {
    @Override
    public void drive() {
        System.out.println("this is taxi's car!");
    }
}

class ambulance implements Drive {
    @Override
    public void drive() {
        System.out.println("this is ambulance's car! ");
    }
}