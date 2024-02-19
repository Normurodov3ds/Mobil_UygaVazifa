package Lesson28.Driver;

public class Mian {
    public static void main(String[] args) {

        DriverFather driverFather = new Driver("Akmal","D");
        Driver driver = new Driver("Abdulla","BC");

        driver.type();
        driver.work();
        driverFather.type();
    }
}
