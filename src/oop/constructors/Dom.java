package oop.constructors;

public class Dom {

    public String type;
    public int kvm2;
    public int jiteli;
    public int rooms;

    public Dom(String type1, int kvm22, int jiteli1, int rooms1 ) {
        type = type1;
        kvm2 = kvm22;
        jiteli = jiteli1;
        rooms = rooms1;
    }

    @Override
    public String toString() {
        return "Dom{" + "\n" +
                "type='" + type + "\n" +
                ", kvm2=" + kvm2 + "\n" +
                ", jiteli=" + jiteli + "\n" +
                ", rooms=" + rooms + "\n" +
        '}';
    }
}

