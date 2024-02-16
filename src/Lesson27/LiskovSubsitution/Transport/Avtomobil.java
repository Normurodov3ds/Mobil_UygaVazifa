package Lesson27.LiskovSubsitution.Transport;

public abstract class Avtomobil implements Transport {
    private String name;
    private String number;

    public Avtomobil(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    abstract void carGoes();

}
