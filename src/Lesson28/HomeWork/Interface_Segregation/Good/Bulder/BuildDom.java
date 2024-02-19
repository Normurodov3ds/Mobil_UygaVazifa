package Lesson28.HomeWork.Interface_Segregation.Good.Bulder;

public class BuildDom implements BuldDom{
    @Override
    public void buildBalcony() {
        System.out.println("buld balcon!");
    }

    @Override
    public void buld() {
        System.out.println("buld dom");
    }
}
