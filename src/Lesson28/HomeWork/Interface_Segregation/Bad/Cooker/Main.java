package Lesson28.HomeWork.Interface_Segregation.Bad.Cooker;

public class Main {
    public static void main(String[] args) {
        Cooking cooking = new CookBread();
        cooking.cookBread();

        Cooking cooking1 = new CookingPalov();
        cooking1.cookPalov();

    }
}
