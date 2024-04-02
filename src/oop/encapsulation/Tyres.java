package oop.encapsulation;

public class Tyres {

    public String type;
    public String season;
    public int width;
    public int height;
    public int diameter;
    private int inn = 2024;

    @Override
    public String toString() {
        return "Tyres{" +
                "type='" + type + '\'' +
                ", season='" + season + '\'' +
                ", width=" + width +
                ", height=" + height +
                ", diameter=" + diameter +
                ", inn=" + inn +
                '}';
    }

    public Tyres(String type, String season, int width, int height, int diameter) {
        this.type = type;
        this.season = season;
        this.width = width;
        this.height = height;
        this.diameter = diameter;

    }
    public int getInn(){
        return inn;
    }
    public void setInn(int inn){
        this.inn = inn;
    }

}

