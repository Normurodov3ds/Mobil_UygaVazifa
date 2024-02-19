package Lesson28.HomeWork.Interface_Segregation.Good.Cooker;

public class Bread_Man implements CookingBread{
    @Override
    public void cookingBread() {
        System.out.println("Bread man cooking bread!");
    }

    @Override
    public void showInfo() {
        System.out.println("He is very much cooking bread!");
    }
}
