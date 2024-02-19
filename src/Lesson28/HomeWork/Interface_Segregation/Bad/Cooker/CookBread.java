package Lesson28.HomeWork.Interface_Segregation.Bad.Cooker;

public class CookBread implements Cooking{
    @Override
    public void cookPalov() {
        // hechnarsa
    }

    @Override
    public void cookTort() {

    }

    @Override
    public void countSell() {

    }

    @Override
    public void showInfo() {

    }

    @Override
    public void cookBread() {
        System.out.println("Cooking palaov!");
    }
}
