package Lesson27.LiskovSubsitution.Transport;

public abstract class Pilot {
    private String name;
    private String id;

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public Pilot(String name, String id) {
        this.name = name;
        this.id = id;
    }
    abstract void fly();
}
