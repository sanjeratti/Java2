package oop.encapsulation;

public class Car {

    public String mark;
    public String model;
    private String programm;

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", programm='" + programm + '\'' +
                '}';
    }

    public Car(String mark, String model, String programm) {
        this.mark = mark;
        this.model = model;
        this.programm = programm;
    }
// Getter method
    public String getProgramm(){
        return programm;
    }

    // Setter  method
    public void setProgramm(String programm){
        this.programm = programm;


    }
}

