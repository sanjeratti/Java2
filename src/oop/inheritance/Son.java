package oop.inheritance;

public class Son extends Dad{

//super   --> parent class
    public Son(String name, int age, String nose, String hair) {
        super(name, age, nose, hair);
    }

    @Override
    public String talent() {
        return "designer";
    }

    @Override
    public String toString() {
        return "Son{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", nose='" + nose + '\'' +
                ", hair='" + getHair() + '\'' +
                '}';
    }

    public Son(String name, int age) {
        super(name, age);

    }
}
