package strings;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
//
//        //             012345...Index
//        String name = "Damira";
//        //             123456 --> length()
//
//        System.out.println(name.length());    // 6
//        System.out.println(name.charAt(3)); // 1
//
//        String surname = "Asanova";
//        System.out.println(name + surname); // concat String + String
//        System.out.println(name.concat(surname)); //Damira Asanova
//
//        System.out.println(2+2+"\n alma" ); // 4 alma
//        System.out.println("alma" + 2 +2 );// alma 22
//        System.out.println("alma" + "2" +"2" );// alma 22
//        System.out.println("alma" + (1 +2) +"2" );// alma 32
//
//        //substring
//
//        //                  0123456  --> Index
//        String notebook = "MacBook";
//        //                  1234567  --> length ()
//
//        System.out.println(notebook.substring(1));
//        System.out.println(notebook.substring(0,4)); // MacB
//        System.out.println(notebook.substring(0,1)); // M
//
//        System.out.println(notebook.substring(4,6)); // oo
//
//        //
//        System.out.println(notebook.substring(notebook.length()-1) );
//        //      notebook.substring (7)
//        System.out.println(notebook.substring(4,6)); //
//        System.out.println(notebook.substring(notebook.length()-4));
//
//        //
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Vvedite imya");
//        String imya = scan.next();
//        //                      1 & 2 bukvasy
//        System.out.println(imya.substring(0,2));
//        System.out.println("Vvedite familiyiu");
//        String fio = scan.next();
//        System.out.println(fio.substring(0,3));
//
//        String inn = scan.next();
//        System.out.println(inn.substring(0,1));
//

        // trim

        String country = " Kyrgy  zstan";
        System.out.println(country.trim());

        // indefof


        //                 0123456  --> Index
        String country1 = "Germany";
        //                 1234567
        System.out.println(country1.indexOf('m'));
        System.out.println(country1.indexOf("er"));


        //             012345678901234567
        String film = "Dyavol nosit Prada";
        System.out.println(film.indexOf('a', 7));  // 15
        System.out.println(film.indexOf('a', 16));  // 17
        System.out.println(film.indexOf("no", 7));  // 7


        //
        String book = "Anna KARENINA";
        System.out.println(book.toLowerCase());  // anna karenina
        System.out.println(book.toUpperCase());  // ANNA KARENINA

        System.out.println(book.charAt(4));  // probel

        System.out.println(book.codePointAt(5)); //65 ASQItable chigarip beret
        System.out.println(book.codePointAt(8)); //97 ASQItable chigarip beret

        System.out.println(book.contains("anna")); // false
        System.out.println(book.contains("Anna")); // true
        System.out.println(book.contains("anna")); // true


        System.out.println(book.endsWith("na")); // false
        System.out.println(book.endsWith(" ")); // false

        String book1 = "Harry Potter";
        System.out.println(book.endsWith("potter")); // false
        System.out.println(book.replace('p','P')); // Harry Potter


// Domashka
        // videonu kor
        // imja Familiya inn 1 jenskiy esli 2 bolso mujskoy
        // if (inn.string(0,1)== )


    }
  }
