package Lesson27.Single_Responsibility.PapperFactory;

public class Main {
    public static void main(String[] args) {
        PepperFactory pepperFactory = new PepperFactory("Samarqand qog'ozi",500,'A');
        Market<PepperFactory> market = new Market<>("Korzinka");

        market.sell(pepperFactory);
        System.out.println();

        School school = new School("47-");
        school.use(pepperFactory);

    }
}
