package oop.polymorphism;

public class Animals {
    public String name;
    public String breed;

    public int age;
    private boolean predator;


    public Animals(int age) {
        this.age = age;
    }

    public Animals(String name, String breed, int age, boolean predator) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.predator = predator;
    }

    public Animals(boolean predator) {
        this.predator = predator;
    }

    public Animals(int age, boolean predator) {
        this.age = age;
        this.predator = predator;
    }

    public String isWild(boolean predator) {
        if (predator == true){
            return "To Zoo";
    }else{
        return "To Home";
    }

}
    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", predator=" + predator +
                '}';
    }

}
