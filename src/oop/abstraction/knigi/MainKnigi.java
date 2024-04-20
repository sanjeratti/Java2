package oop.abstraction.knigi;

public class MainKnigi {
    public static void main(String[] args) {
        KindleBook amazonKindle = new KindleBook("Harry Potter", 2015);
        System.out.println(amazonKindle);
        amazonKindle.read();
        
        PaperBook stariy = new PaperBook("Singan kilich", 1984);
        System.out.println(stariy);
        stariy.read();

    }
}
