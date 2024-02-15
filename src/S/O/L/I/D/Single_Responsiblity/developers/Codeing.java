package S.O.L.I.D.Single_Responsiblity.developers;

public class Codeing implements CodingFather {

    @Override
    public String getCoding(Devoloper devoloper) {
        return devoloper.getHour()+" soat ishlaydi!.";
    }
}
