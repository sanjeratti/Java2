package oop.inheritance.practice;

public class CarMain {
    public static void main(String[] args) {

        Passenger nuraika = new Passenger("nuraika", 35);

        Car bmw = new Car("BMW", "X7", "Grey", 2024, nuraika);
    }
}