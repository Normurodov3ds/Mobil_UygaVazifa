package Lesson28.HomeWork.Interface_Segregation.Good.Cooker;

public class Mian {
    public static void main(String[] args) {
        CookingBread cookingBread = new Bread_Man();
        cookingBread.cookingBread();
        cookingBread.showInfo();

        CookingPalov cookingPalov = new Cook_Man();
        cookingPalov.cookinhPalov();
        cookingPalov.showInfo();


    }

}
