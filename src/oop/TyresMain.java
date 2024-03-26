package oop;

public class TyresMain {
    public static void main(String[] args) {
        Tyres continental = new Tyres();
        continental.Width = 205F;
        continental.Height = 55F;
        continental.Type = "R";
        continental.diametr = 16;
        continental.LoadIndex = 615;
        continental.SpeedRating = 240;
        continental.Year = 2019;
        System.out.println("continental");
        System.out.println(continental.Price(continental.diametr,continental.Year));




    }

}
