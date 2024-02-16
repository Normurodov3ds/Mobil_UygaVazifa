package Lesson27.LiskovSubsitution.Transport;

public class Malibu extends Avtomobil{
    public Malibu(String name, String number) {
        super(name, number);
    }

    @Override
    void carGoes() {
        System.out.println(super.getName()+" yuradi...\n" +
                "raqami: "+getNumber());

    }
}
