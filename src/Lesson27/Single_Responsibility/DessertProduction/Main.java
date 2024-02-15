package Lesson27.Single_Responsibility.DessertProduction;

public class Main {
    public static void main(String[] args) {
        Desert desert = new Desert("Napalion",5,false);
        Desert desert1 = new Desert("Projnik",3,false);
        Desert desert2 = new Desert("Mango",5,true);
        Desert desert3 = new Desert("MilkyKeks",5,false);
        desert.isDesertShowInfo();
        desert1.isDesertShowInfo();
        desert2.isDesertShowInfo();
        System.out.println();
        System.out.println("prase "+desert3.getPrice());

        Delivery<Desert> delivery = new Delivery<>("Farrux",6);
        delivery.deliverInRoad(desert1);
        delivery.deliverInRoad(desert2);
        delivery.deliverInRoad(desert3);
        delivery.deliverInRoad(desert1);
        System.out.println();

        System.out.println("=== sotish ====");

        Sell sell = new Sell();
        sell.sell(desert);
        sell.sell(desert1);
        sell.sell(desert2);
        sell.sell(desert3);

    }
}
