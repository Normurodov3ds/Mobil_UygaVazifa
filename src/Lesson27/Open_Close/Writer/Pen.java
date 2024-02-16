package Lesson27.Open_Close.Writer;

public class Pen implements PenFather {

    @Override
    public void WritePen(Writer s) {
        System.out.println(s.getText()+" pen writing...");
    }
}
