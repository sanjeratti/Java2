package methods;

public class Method1 {

    public static void main(String[] args) {
//        System.out.println(dollarToSom());
//        System.out.println(euroToSom(100));
       // System.out.println(nbkrDoll(89.7));
        System.out.println(zum(89.7, 500, "Prodaja"));
        System.out.println(zum(89.7, 500, "Pokupka"));


    }
    public static double nbkrDoll(){
        return 89.7;
    }

    public static double nbkrRubl(){
        return 1;
    }
    public static double dollarToSom(){

       // return 100 * 89.7;

        double course = 89.7;
        int doll = 100;
        double itogo = doll * course;
        return itogo;

    }
    public static double dollarToSom2(double course, int doll){
        return doll * course;
    }

    public static double RublToSom(double course, int rubl){
        return rubl * course;
    }
    public static float euroToSom(float course)
    {

        int euro = 100;
        float itogo = euro * course;
        return itogo;
    }

    public static String zum(double course, int summa, String obmen){
        if (obmen == "Pokupka"){
            return "Pokupka: " + (course - 0.05) * summa;
        } else if (obmen == "Prodaja"){
            return "Prodaja: " + (course + 0.05) * summa;
        }
       return "My ne mojem obmenyat!";

    }

}

