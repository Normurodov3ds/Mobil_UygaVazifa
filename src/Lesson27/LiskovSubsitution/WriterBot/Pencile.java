package Lesson27.LiskovSubsitution.WriterBot;

public class Pencile extends PencilFather {

    @Override
    public void write(String s) {
        System.out.println("pencil write..");
        System.out.println(s);
    }
}
