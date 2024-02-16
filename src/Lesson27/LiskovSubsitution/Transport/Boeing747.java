package Lesson27.LiskovSubsitution.Transport;

public class Boeing747 extends Pilot implements Transport{
    public Boeing747(String name, String id) {
        super(name, id);
    }

    @Override
    void fly() {
        System.out.println(super.getName()+" uchadi!\n" +
                "id: "+getId());
    }
}
