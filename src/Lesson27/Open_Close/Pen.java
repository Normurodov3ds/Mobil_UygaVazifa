package Lesson27.Open_Close;

public class Pen implements PenFather {

    @Override
    public void WritePen(Writer s) {
        System.out.println(s.getText()+" pen writing...");
    }
}
