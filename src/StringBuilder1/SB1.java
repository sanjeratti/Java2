package StringBuilder1;

import javax.crypto.KeyGenerator;
import java.sql.SQLOutput;
import java.util.Arrays;

public class SB1 {
    public static void main(String[] args) {

        String name="Zamira";
        String surname = "Sagynalieva";

        String fullname = name.concat(surname);
        System.out.println(fullname.substring(0,4));

// .instert
           //                                 0123456
        StringBuilder sb1 = new StringBuilder("Bishkek");
        sb1.insert(0, 312);
        System.out.println(sb1);
        sb1.insert(6, "KG");
        sb1.insert(0, "DE");

        System.out.println(sb1);


        // replace ()

        StringBuilder sb2 = new StringBuilder ("Kyrgyzstan");
        sb2.replace (0, 3,"Bishkek");
        System.out.println(sb2);

        StringBuilder sb3 = new StringBuilder("Germany");
        sb3.replace(2,3,"DE");
        System.out.println(sb3);

        // .reverse()

        StringBuilder sb4 = new StringBuilder("Kitep");
        sb4.reverse();
        System.out.println(sb4);

   // .delete()
        StringBuilder sb6 = new StringBuilder("Iphone");
                sb6.delete(0,2);  //hone
        System.out.println(sb6);

    // .deleteCharAt()
        sb6.deleteCharAt(1) ; // hone --> hne
        System.out.println(sb6);

     // .toString()

     StringBuilder sb7 = new StringBuilder("Beku Beku");
        System.out.println(sb7);

        int [] arr = {23,45,34};
        System.out.println(arr);
        System.out.println(Arrays.toString(arr)); // [23, 45, 2, 34]


        // .append ()

        StringBuilder zarina = new StringBuilder("Zarina");
       StringBuilder alymbaeva = new StringBuilder("Alymbaeva");
       zarina.append(alymbaeva);
        System.out.println(zarina);
        System.out.println(alymbaeva);


    }



}
