package Lesson27.Single_Responsibility.Developers;

public class DriveSportCar implements DriveSportCarFather {
    @Override
    public void driveSportCar(Developer developer) {
        System.out.println("Developer "+developer.getName()+" is very fast driving sport car.!");
    }

}
