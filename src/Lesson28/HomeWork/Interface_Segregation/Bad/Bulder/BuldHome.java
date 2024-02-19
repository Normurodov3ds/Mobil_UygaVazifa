package Lesson28.HomeWork.Interface_Segregation.Bad.Bulder;

public class BuldHome implements Bulder{
    @Override
    public void buld() {

    }

    @Override
    public void buildBalcony() {

    }

    @Override
    public void buildHome() {

        System.out.println("build home!");
    }
}
