package oop.inheritance.practice;

public class Car {

    public String marc;
    protected String model;
    String color;
    private int year;

    Passenger passenger;

    public Car(String marc, String model, String color, int year, Passenger passenger) {
        this.marc = marc;
        this.model = model;
        this.color = color;
        this.year = year;
        this.passenger = passenger;
    }

    public int getYear() {
        return  year;
    }
public String drive (boolean gas){
    if (gas) {

        return "Woom-woom";
    }
    return "Stop";
}
    @Override
    public String toString() {
        return "Car{" +
                "marc='" + marc + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", passenger=" + passenger +
                '}';
    }
}
