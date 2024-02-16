package Lesson27.Open_Close.SamarkandBreads;

public class BigBread implements SamBreadFactory{
    private String flour;
    private String water;

    public BigBread(String flour, String water) {
        this.flour = flour;
        this.water = water;
    }

    @Override
    public void makeBread() {
        System.out.println(FactoryName);
        System.out.println("make BigBread...\n"+
                this);
    }

    @Override
    public String toString() {
        return "BigBread{" +
                "flour='" + flour + '\'' +
                ", water='" + water + '\'' +
                '}';
    }
}
