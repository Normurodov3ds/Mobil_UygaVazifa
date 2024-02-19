package Lesson28.HomeWork.DependensyInvertion;

public class Main2 {
    public static void main(String[] args) {

        MakeBread rusBread = new RusBread();
        MakeBread uzBread = new UzBread();

        Baker komil = new Baker("Komil",rusBread);
        Baker bahrom = new Baker("Bahrom",uzBread);
        komil.make();
        bahrom.make();

    }
}



class Baker {
    private MakeBread makeBread;
    private String name;
    public Baker(String name,MakeBread makeBread) {
        this.makeBread = makeBread;
        this.name = name;
    }
    void make() {
        System.out.print(name+" ");
        makeBread.makeBrad();
    }

}


interface MakeBread {
    void makeBrad();
}



 class RusBread implements MakeBread {
    @Override
    public void makeBrad() {
        System.out.println("make rus bread!");
    }
}



 class UzBread implements MakeBread {

    @Override
    public void makeBrad() {
        System.out.println("make uz bread!");
    }
}
