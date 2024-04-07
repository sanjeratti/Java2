package oop.inheritance.car;

public class VW {
    public String name;
    protected int age;
    String kusov;
    private String engine;

    public VW(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "VW{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", kusov='" + kusov + '\'' +
                ", engine='" + engine + '\'' +
                '}';
    }

    public VW(String name, int age, String kusov, String engine) {
        this.name = name;
        this.age = age;
        this.kusov = kusov;
        this.engine = engine;

    }
    public int price(){
        return 4000;
    }
}
