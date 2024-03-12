package collections.sets;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Set1 {

    public static void main(String[] args) {


        //Set  --> no index  | no duplicates
        //HashSet                      LinkedHashSet                     TreeSet
        //unpredictable order          predictable order                 sorted




        HashSet<Integer> set1 = new HashSet<>();

        set1.add(33);
        set1.add(334343);
        set1.add(0);
        set1.add(33);
        set1.add(21);
        set1.add(2);
        set1.add(44);
        set1.add(456);
        System.out.println(set1);  //[0, 33, 334343, 2, 21, 456, 44]

        LinkedHashSet<Integer> set2 = new LinkedHashSet<>();
        set2.add(33);
        set2.add(334343);
        set2.add(0);
        set2.add(33);
        set2.add(21);
        set2.add(2);
        set2.add(44);
        set2.add(456);
        System.out.println(set2);   //[33, 334343, 0, 21, 2, 44, 456]

        TreeSet<Integer> set3 = new TreeSet<>();
        set3.add(33);
        set3.add(33);
        set3.add(0);
        set3.add(45);
        set3.add(2);
        set3.add(555);
        System.out.println(set3); //[0, 2, 33, 45, 555]


    }
}
