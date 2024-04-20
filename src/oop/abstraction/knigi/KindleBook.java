package oop.abstraction.knigi;

import java.util.Deque;

public class KindleBook extends Knigi {
    public KindleBook(String name, int year){
        super(name, year);
    }


    @Override
    public void read() {
        System.out.println("Najimaem i chitaem");

    }


}
