package Lesson27.Open_Close.SamarkandBreads;

public class ButterBread implements SamBreadFactory{// yog'li patir
    private String flour;
    private String water;
    private String oil;

    public ButterBread(String flour, String water, String oil) {
        this.flour = flour;
        this.water = water;
        this.oil = oil;
    }

    @Override
    public void makeBread() {
        System.out.println(FactoryName);
        System.out.println("make Butter Bread...");
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "ButterBread{" +
                "flour='" + flour + '\'' +
                ", water='" + water + '\'' +
                ", oil='" + oil + '\'' +
                '}';
    }
}
