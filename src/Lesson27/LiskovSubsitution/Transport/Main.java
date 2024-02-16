package Lesson27.LiskovSubsitution.Transport;

public class Main {
    public static void main(String[] args) {
        Malibu malibu = new Malibu("Malibu", "AA777A");
        Pilot pilot = new Boeing747("Boeing747", "477484");

        malibu.carGoes();
        pilot.fly();

        System.out.println("=======");
        Avtomobil avtomobil = new Malibu("Cobalt", "R757LA");
        avtomobil.carGoes();

    }
}
