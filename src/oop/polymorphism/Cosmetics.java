package oop.polymorphism;

public class Cosmetics {
    public static void main(String[] args) {
        Cosmetics manyo = new Cosmetics(true);
        Cosmetics nivea = new Cosmetics("Nivea", true);
        Cosmetics loreal = new Cosmetics("loreal", false, 2000);
        Cosmetics lancome = new Cosmetics();
        lancome.price = 1000;
        System.out.println(manyo);
        System.out.println(loreal.price);

    }

    public String marka;
    private boolean jirniy;
    public double price;

    public Cosmetics(String marka, boolean jirniy, double price) {
        this.marka = marka;
        this.jirniy = jirniy;
        if (price>=2000){
            this.price=price-(price*0.1);
        }
    }
    public Cosmetics() {
    }

    public Cosmetics(boolean jirniy) {
        this.jirniy = jirniy;
    }


    public Cosmetics(String marka, boolean jirniy) {
        this.marka = marka;
        this.jirniy = jirniy;
    }

    @Override
    public String toString() {
        return "Cosmetics{" +
                "marka='" + marka + '\'' +
                ", jirniy=" + jirniy +
                ", price=" + price +
                '}';
    }
}
