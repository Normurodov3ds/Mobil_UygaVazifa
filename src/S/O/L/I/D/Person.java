package S.O.L.I.D;

import java.util.*;

public class Person {
    static class Student{
        String name;
        public Student(String name) {
            this.name = name;
        }
    }
    class Worker{ // member inner class
        String name;
        int age;
        public Worker(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    void makeDoctor(boolean b){

        if (b){
            class Doctor{
                String name;
                int age;

                public Doctor(String name, int age) {
                    this.name = name;
                    this.age = age;
                }

                @Override
                public String toString() {
                    return "Doctor{" +
                            "name='" + name + '\'' +
                            ", age=" + age +
                            '}';
                }
            }
            Doctor doctor = new Doctor("Aziz",20);
            System.out.println(doctor);
        }else {
            class Developer{
                String name;
                int price;

                public Developer(String name, int price) {
                    this.name = name;
                    this.price = price;
                }

                @Override
                public String toString() {
                    return "Developer{" +
                            "name='" + name + '\'' +
                            ", price=" + price +
                            '}';
                }
            }
            Developer developer = new Developer("Komil",5000);
            System.out.println(developer);
        }
    }


    abstract class dev{
       abstract void showinfo();
    }

}

class Main4{
    public static void main(String[] args) {
        Person person =  new Person();

        Person.dev dev = person.new dev() {
            @Override
            void showinfo() {
                System.out.println("Abstract class running...");
            }
        };

        dev.showinfo();
    }
}