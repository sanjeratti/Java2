package StringBuilder1;

import java.sql.SQLOutput;

public class SB3 {
    public static void main(String[] args) {

        // ==  --> Links
        // .equals()  --> Links


        // mutable vs immutable
        // String - neizmenyaemiy
        // StringBuilder  - izmenyaemiy

        // POOL
        String str1 = "Naryn";
        String str2 = "Naryn";
        boolean res1 = str1 == str2;  // true
        boolean res2 = str1.equals(str2);  // true

        System.out.println(res1);
        System.out.println(res2);
        System.out.println("-----");

        String zarina = str1.toUpperCase();
        System.out.println(zarina);
        System.out.println(zarina.hashCode());

        System.out.println(str1.hashCode());  // 75037780
        System.out.println(str2.hashCode());  // 75037780

        // HEAP - izmenyaemiy - new object
        StringBuilder sb1 = new StringBuilder("Bishkek");  // 2055281021
        StringBuilder sb2 = new StringBuilder("Bishkek");  // 1554547125
        StringBuilder sb3 = new StringBuilder("Naryn");
        boolean res3 = sb1 == sb2;  // flase
        boolean res4 = sb1.equals(sb2);  //flase
        System.out.println(res3);
        System.out.println(res4);

        System.out.println(sb1.hashCode()); // 1175962212
        System.out.println(sb2.hashCode()); // 918221588

        boolean res5 = sb3.toString().equals(str1);  /// true
        System.out.println(res5);

        sb1.append("KG");  // BishkekKG
        System.out.println(sb1);

    }
}
