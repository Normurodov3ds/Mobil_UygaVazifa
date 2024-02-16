package Lesson27.LiskovSubsitution.WriterBot;


public class PencilFather implements Writer {
    @Override
    public void write(String s) {
        System.out.println("pencil Father write..");
        System.out.println(s);
    }

}
