package oop.inheritance.car;

public class Audi extends VW {

    public Audi(String name, int age, String kusov, String engine) {
        super(name, age, kusov, engine);

    }

    @Override
    public String toString() {
        return "Audi{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", kusov='" + kusov + '\'' +
                "engine='" + getEngine()+ '\'' +
                '}';
    }

    public Audi(String name, int age) {
        super (name, age);

    }

    @Override
    public int price() {
       if (name=="A6"){
           return 10000;

       }
        return 8000;
    }

}
