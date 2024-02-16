package Lesson27.LiskovSubsitution.SportMan;

public class Boxer implements Box{
    @Override
    public void hit() {
        System.out.println("Boxer hit...!");
    }
}
