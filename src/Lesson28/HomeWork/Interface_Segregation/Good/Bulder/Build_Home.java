package Lesson28.HomeWork.Interface_Segregation.Good.Bulder;

public class Build_Home implements BuildHome{
    @Override
    public void buildHome() {
        System.out.println("Build new home!");
    }

    @Override
    public void buld() {
        System.out.println("buildhome");
    }
}
