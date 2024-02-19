package exprement.B;

import exprement.B.Depandensing.Pilot;

public class Person implements Comparable<Person> {
    private String name;
    private  int age;

    private Pilot pilot;

    public Person(String name, int age,Pilot pilot) {
        this.name = name;
        this.age = age;
        this.pilot = pilot;
    }

   public void fly(){
        pilot.fly();
    }

    @Override
    public int compareTo(Person o) {
        return Integer.compare(this.name.length(),o.name.length());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", pilot=" + pilot +
                '}';
    }
}
