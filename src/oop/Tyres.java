package oop;

public class Tyres {


    public String name;
    public float Width;
    public float Height;
    public String Type;
    public int Year;
    public int diametr;
    public float LoadIndex;
    public float SpeedRating;
    public float Price(int diametr, int year){
        if (year<=2020 || diametr>16){
            return diametr*20;
        }
        return diametr*30;

    }

    @Override
    public String toString() {
        return "Tyres{" +
                "name='" + name + '\'' +
                ", Width=" + Width +
                ", Height=" + Height +
                ", Type='" + Type + '\'' +
                ", Year=" + Year +
                ", diametr=" + diametr +
                ", LoadIndex=" + LoadIndex +
                ", SpeedRating=" + SpeedRating +
                '}';
    }
}
