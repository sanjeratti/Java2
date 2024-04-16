package oop.inheritance.practice;

public class Passenger {

    //Is A  --> Dad - > Son   --> Assotsiatsia
    //Has A --> Chelovek --> Ruka  --> Composition  | Aggregation

    public String name;
    private int age;

    public Passenger(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    @Override
    public String toString (){
        return "Passenger{" +
                "name='" + name + '\'' +
                ", age='" + age + +
                '}';

    }

}
