package oop.inheritance.atom;

public class Electron {
    private String name;

    public Electron(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Electron{" +
                "name='" + name + '\'' +
                '}';
    }
}
