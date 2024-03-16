package map;

import com.sun.source.tree.Tree;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Map1 {
    public static void main(String[] args) {


        //                  Map --> No Index (X)  key, value

        // ujnpredictable order
        Map<String, Integer> mobOperators = new HashMap<>();
        mobOperators.put("MegaCom", 555);
        mobOperators.put("O!", 700);
        mobOperators.put("Beeline", 777);
        mobOperators.put("Beeline", 777);  // perenaznachilsya
        System.out.println(mobOperators);  // {Beeline=777, O!=700, MegaCom=555}

        // predictable order
        LinkedHashMap<Boolean, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(false, "no");
        linkedHashMap.put(true, "yes");
        System.out.println(linkedHashMap);  // {false=no, true=yes}

        TreeMap<Integer, String> students = new TreeMap<>();  //Sortirovka po klyuchu
        students.put(3, "Zarina");
        students.put(1, "Sanzhar");
        students.put(2, "Zamiwka");
        System.out.println(students); // {1=Sanzhar, 2=Zamiwka, 3=Zarina}

    }
}
