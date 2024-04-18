package oop.inheritance.atom;

public class Proton {
    private String name;
    public Proton(String name) {this.name = name;}

    public String getName() {return name;}
    @Override
    public String toString() {
        return "Proton{" +
                "name='" + name + '\'' +
                '}';
    }
}
