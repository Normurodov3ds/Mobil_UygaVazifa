package Lesson24.MyArrays.Enum;

public enum Enum {

    ABBOS(14){

    }, MIRJALOL(8), ELYOR(13), DILSHOT(14);

    private int a;

    Enum(int a) {
        this.a = a;
    }

    public  int getA() {

        return a;
    }

}
