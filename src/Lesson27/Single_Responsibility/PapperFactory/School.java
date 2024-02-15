package Lesson27.Single_Responsibility.PapperFactory;

public class School {
    String name;

    public School(String name) {
        this.name = name;
    }

    void use(PepperFactory pepper){
        System.out.println(name +" school is "+pepper.getPepperName()+" used\n" +
                "and price is: +"+pepper.getPrice()+" $");
    }
}
