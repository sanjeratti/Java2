package oop.inheritance.composition;

public class House {

    private Room bedroom;
    private Room kitchen;

    public House(){
        this.bedroom = new Room ("BedRoom");
        this.kitchen = new Room ("Kitchen");
    }

    public Room getBedroom() {
        return bedroom;
    }

    public Room getKitchen() {
        return kitchen;
    }

    @Override
    public String toString() {
        return "House{" +
                "bedroom=" + bedroom +
                ", kitchen=" + kitchen +
                '}';
    }
}
