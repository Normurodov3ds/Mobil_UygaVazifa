package Lesson28.HomeWork.Interface_Segregation.Bad.Bulder;

public class BuildDom implements Bulder{
    @Override
    public void buld() {
        System.out.println("bulding...");
    }

    @Override
    public void buildBalcony() {
        System.out.println("build balcony!");
    }

    @Override
    public void buildHome() {

    }
}
