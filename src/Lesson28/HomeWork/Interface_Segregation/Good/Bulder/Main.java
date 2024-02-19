package Lesson28.HomeWork.Interface_Segregation.Good.Bulder;

public class Main {
    public static void main(String[] args) {
        BuildHome buildHome = new Build_Home();
        buildHome.buildHome();
        buildHome.buld();

        BuldDom buldDom = new BuildDom();
        buldDom.buildBalcony();
        buldDom.buld();
    }
}
