package Lesson28.Driver;

public class Driver extends DriverFather{

    public Driver(String name,String tape) {
        super(name,tape);
    }

    @Override
    void type() {
        System.out.println("Deive: "+ super.getName());
        System.out.println("Type: "+ super.getTape());
    }
}
