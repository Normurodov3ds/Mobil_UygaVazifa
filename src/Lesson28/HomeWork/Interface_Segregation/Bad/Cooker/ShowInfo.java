package Lesson28.HomeWork.Interface_Segregation.Bad.Cooker;

public class ShowInfo implements Cooking{
    @Override
    public void cookPalov() {

    }

    @Override
    public void cookTort() {

    }

    @Override
    public void countSell() {

    }

    @Override
    public void showInfo() {
        System.out.println("show info!");
    }

    @Override
    public void cookBread() {

    }
}
