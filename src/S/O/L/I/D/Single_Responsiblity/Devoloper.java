package S.O.L.I.D.Single_Responsiblity;

public class Devoloper {
    private String name;
    private int age;
    private int hour;

    public Devoloper(String name, int age, int hour) {
        this.name = name;
        this.age = age;
        this.hour = hour;

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHour() {
        return hour;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hour=" + hour +
                '}';
    }
}
