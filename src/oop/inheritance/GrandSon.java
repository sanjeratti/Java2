package oop.inheritance;

import java.lang.management.GarbageCollectorMXBean;

public class GrandSon extends Son{
    public GrandSon(String name, int age, String nose, String hair) {
        super(name, age, nose, hair);
    }

    @Override
    public String talent() {
        return "UI/UX designer";
    }


    @Override
    public String toString() {
        return "GrandSon{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", nose='" + nose + '\'' +
                ", hair='" + getHair() + '\''+
                '}';
    }
}
