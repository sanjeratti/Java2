package oop.polymorphism;

public class Man {

    public String name;
    private int age;

    public Man(){

    }
    public Man(String name){
        this.name = name;
    }

    public Man(int age){
        this.name = name;
        }

    public Man(String name, int age){
        this.name = name;
        this.age = age;
        }
    public Man(int age, String name){
        this.name = name;
        this.age = age;
    }

    public String toWork(String work){
        return work;
    }
    public String toWork(int hours, String work){
        return hours + work;
    }

    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
