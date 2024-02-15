package Lesson27.Single_Responsibility.Developers;

public class Swimming implements SwimmingFather{

    @Override
    public void developerSwim(Developer developer) {
        System.out.println(developer.getName()+" "+developer.getTitle()+" is developer swimming...");
    }
}
