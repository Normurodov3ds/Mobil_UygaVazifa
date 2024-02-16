package Lesson27.LiskovSubsitution.WriterBot;

public class PenFather implements Writer{
    @Override
    public void write(String s) {
        System.out.println("pen Father write..");
        System.out.println(s);
    }
}
