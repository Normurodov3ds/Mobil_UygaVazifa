package Lesson28.HomeWork.Interface_Segregation.Good.Cooker;

public class Cook_Man implements CookingPalov{
    @Override
    public void cookinhPalov() {
        System.out.println("Cooking palov!");
    }

    @Override
    public void showInfo() {
        System.out.println("he is very much work");
    }
}
