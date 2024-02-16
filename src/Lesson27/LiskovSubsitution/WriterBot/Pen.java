package Lesson27.LiskovSubsitution.WriterBot;

public class Pen extends PenFather{

    @Override
    public void write(String s) {
        System.out.println("pen write..");
        System.out.println(s);
    }
}
