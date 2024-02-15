package S.O.L.I.D.Single_Responsiblity;

import S.O.L.I.D.Single_Responsiblity.developers.*;

public class Main extends Eat {

    public static void main(String[] args) {
        Devoloper senior = new Devoloper("Komil",25,4);
        Devoloper middle = new Devoloper("Sardar",24,8);
        Devoloper junior  = new Devoloper("Aziz",23,12);
        Eat eat = new Eat();
        Codeing codeing = new Codeing();
        eat.eating(junior);
        System.out.println(codeing.getCoding(junior)+"\n");

        eat.eating(middle);
        System.out.println(codeing.getCoding(middle)+"\n");

        eat.eating(senior);
        System.out.println(codeing.getCoding(senior)+"\n");

        CodingFather codingFather = new Codeing();
        EatFather eatFather = new Eat();

        eatFather.eating(senior);
        System.out.println(codingFather.getCoding(senior)+"\n");

        eatFather.eating(middle);
        System.out.println(codingFather.getCoding(middle)+"\n");

        eatFather.eating(junior);
        System.out.println(codingFather.getCoding(junior));
    }
}
