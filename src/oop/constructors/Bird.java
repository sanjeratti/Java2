package oop.constructors;

//  если в конструкторе одинаковый тип данных и одинаковое
//  количество параметров, то офмф не дает создавать конструктор

public class Bird {

    public String type;
    public String name;


    public Bird(String type) {
        this.type = type;
    }
    public Bird(String name, String type) {
        this.name = name;
        this.type = type;
    }
    public Bird(){

    }
}
