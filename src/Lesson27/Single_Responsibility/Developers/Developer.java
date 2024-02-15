package Lesson27.Single_Responsibility.Developers;

public class Developer {
    private String name;
    private String title;
    private int age;
    private int prise;

    public Developer(String name, String title, int age, int prise) {
        this.name = name;
        this.title = title;
        this.age = age;
        this.prise = prise;
    }

    public void coding(){
        System.out.println(getName()+" is writeing code...");
        System.out.println("He is "+getAge()+" years old and "+title+" developer.!");
    }


    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public int getAge() {
        return age;
    }

    public int getPrise() {
        return prise;
    }
}
