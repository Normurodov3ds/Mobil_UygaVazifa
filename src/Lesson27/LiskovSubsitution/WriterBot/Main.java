package Lesson27.LiskovSubsitution.WriterBot;

public class Main {
    public static void main(String[] args) {
        Writer writer = new Pen();
        writer.write("Assalomu alaykum hammaga!");
        Writer writer1 = new Pencile();
        writer1.write("Salom salom");
        PencilFather pencilFather = new PencilFather();
        pencilFather.write("salom nima gaplar?");
    }
}
