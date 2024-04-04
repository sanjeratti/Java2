package oop.encapsulation;

public class MegacomTariff {
    // Private attributes
    private String name;
    private double basePrice;
    private double dataLimit;
    private int minutesLimit;
    private int textsLimit;
    private int abroadLimit;

    // Constructor
    public MegacomTariff(String name, double basePrice, double dataLimit, int minutesLimit, int textsLimit) {
        this.name = name;
        this.basePrice = basePrice;
        this.dataLimit = dataLimit;
        this.minutesLimit = minutesLimit;
        this.textsLimit = textsLimit;
        this.abroadLimit = abroadLimit;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public double getDataLimit() {
        return dataLimit;
    }

    public int getMinutesLimit() {
        return minutesLimit;
    }
    public int getAbroadLimit(){
        return abroadLimit;
    }

    public int getTextsLimit() {
        return textsLimit;
    }

    // Setter methods (optional)
    public void setName(String name) {
        this.name = name;
    }

    public void setBasePrice(double basePrice) {
        if (basePrice >= 0) {
            this.basePrice = basePrice;
        } else {
            System.out.println("Bazovaya tzena ne doljna byt` negativnim");
        }
    }
    public void setDataLimit(double dataLimit) {
        if (dataLimit >= 0) {
            this.dataLimit = dataLimit;
        } else{
            System.out.println("Bazovaya tzena ne doljna byt` negativnim");
        }
    }

    public void setMinutesLimit(int minutesLimit) {
        this.minutesLimit = minutesLimit;
    }

    public void setTextsLimit(int textsLimit) {
        this.textsLimit = textsLimit;
    }
    public void setAbroadLimit(int abroadLimit){
        this.abroadLimit = abroadLimit;
    }
}
