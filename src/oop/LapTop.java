package oop;

//import java.security.PublicKey;

public class LapTop {

    String mark;
    String color;
    double price;

    //funktsii
    public String code() {

        return "Coding...";
    }
    public String typing(){
        return "Typing...";
    }

    @Override
    public String toString() {
        return "LapTop{" +
                "mark='" + mark + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
//  public String vyvod(){
    //    return "Mark" + mark + "Color: "+color + "price:";
    //}

}
