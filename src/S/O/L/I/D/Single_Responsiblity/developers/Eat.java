package S.O.L.I.D.Single_Responsiblity.developers;

public class Eat implements EatFather {
    @Override
    public void eating(Devoloper devoloper) {
        System.out.println(devoloper.getName()+" eating....");
    }
}
