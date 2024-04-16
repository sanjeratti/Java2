package oop.inheritance.aggregation;

public class MainCar {
    public static void main(String[] args) {

        Engine engine = new Engine("Diesel");
        Car mercedes = new Car ("MayBach", engine);
        System.out.println("Car model:" + mercedes.getModel());
        System.out.println("Engine type" + mercedes.getEngine().getType());

    }
}
