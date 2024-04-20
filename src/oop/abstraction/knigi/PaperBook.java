package oop.abstraction.knigi;

public class PaperBook  extends Knigi{
    public PaperBook (String name, int year){
        super(name, year);
    }

    @Override
    public void read() {
        System.out.println("Listaem i chitaem");
    }
}
