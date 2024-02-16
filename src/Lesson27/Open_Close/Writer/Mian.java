package Lesson27.Open_Close.Writer;

public class Mian {
    public static void main(String[] args) {
        Writer writer = new Writer("Salom do'stlar!");
        PenFather penFather = new Pen();
        penFather.WritePen(writer);
        PencilFather pencilFather = new Pencil();
        pencilFather.write(writer);

    }
}
