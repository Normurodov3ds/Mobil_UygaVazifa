package Lesson27.Single_Responsibility.DessertProduction;

public class Desert {
    private String name;
    private int price;
    private boolean isChocolate;

    public Desert(String name, int price, boolean isChocolate) {
        this.name = name;
        this.price = price;
        this.isChocolate = isChocolate;
    }

    void isDesertShowInfo() {
        System.out.println("name is: " + name);
        System.out.println("prise : " + price);
        System.out.println("is chocalate ? : " + isChocolate);
    }

    public double realCostDesert() {
        return price - (price * .2);
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public boolean isChocolate() {
        return isChocolate;
    }

    @Override
    public String toString() {
        return "Desert{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", isChocolate=" + isChocolate +
                '}';
    }
}
