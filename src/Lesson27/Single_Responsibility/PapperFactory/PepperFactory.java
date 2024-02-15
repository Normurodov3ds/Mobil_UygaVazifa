package Lesson27.Single_Responsibility.PapperFactory;

public class PepperFactory {
    private  String pepperName;
    private int price;
    private char tape;

    public PepperFactory(String pepperName, int price, char tape) {
        this.pepperName = pepperName;
        this.price = price;
        this.tape = tape;
    }

    public String getPepperName() {
        return pepperName;
    }

    public int getPrice() {
        return price;
    }

    public char getTape() {
        return tape;
    }

    @Override
    public String toString() {
        return "PepperFactory{" +
                "pepperName='" + pepperName + '\'' +
                ", price=" + price +
                ", tape=" + tape +
                '}';
    }
}
