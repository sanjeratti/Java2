package oop.inheritance.atom;

public class Atom {

    private Electron electron;
    private Proton proton;
    private Neutron neutron;

    public Atom() {
        this.electron = new Electron("Electron");
        this.proton = new Proton("Proton");
        this.neutron = new Neutron("Neutron");
    }

    public Electron getElectron() {
        return electron;
    }

    public Proton getProton() {
        return proton;
    }

    public Neutron getNeutron() {
        return neutron;
    }

    @Override
    public String toString() {
        return "Atom{" +
                "electron=" + electron +
                ", proton=" + proton +
                ", neutron=" + neutron +
                '}';
    }

}
