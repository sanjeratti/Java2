package oop.inheritance.atom;

public class Neutron {
private String name;
public Neutron(String name) {this.name = name;}

    public String getName() {return name; }

    @Override
    public String toString() {
    return "Neutron{" +
            "name='" + name + '\'' +
            '}';
    }
}
