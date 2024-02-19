package Lesson28.HomeWork.Interface_Segregation.Bad.Cooker;

public class CookingPalov implements Cooking{
    @Override
    public void cookPalov() {
        System.out.println("cooking palov!");
    }

    @Override
    public void cookTort() {
        // hechnarsa
    }

    @Override
    public void countSell() {

    }

    @Override
    public void showInfo() {

    }

    @Override
    public void cookBread() {

    }
}
