package Lesson27.Single_Responsibility.PapperFactory;

public class Market<T> {
    private String marketName;

    public Market(String marketName) {
        this.marketName = marketName;
    }

    public void sell(T t){
        System.out.println("this day we sell :"+t);
    }
}
