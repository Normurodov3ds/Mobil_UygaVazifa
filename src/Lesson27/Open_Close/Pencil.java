package Lesson27.Open_Close;

public class Pencil implements PencilFather{


    @Override
    public void write(Writer s) {
        System.out.println(s.getText()+" pencle writing...");
    }
}
