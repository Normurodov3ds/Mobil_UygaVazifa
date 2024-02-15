package Lesson27.Single_Responsibility.DessertProduction;

public class Delivery<D> implements DeliveryFather<D>{
    private String name;
    private int price;

    public Delivery(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void deliverInRoad(D d) {
        System.out.println(name+" is yetkazib beradi, and +"+price+" $");
        System.out.println("Your product is :"+d);
    }
}
