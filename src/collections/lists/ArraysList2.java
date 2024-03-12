package collections.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArraysList2 {
    public static void main(String[] args) {

        ArrayList<Character> symbol = new ArrayList<>();
        symbol.add ('!');
        symbol.add ('n');
        symbol.add ('^');
        symbol.add ('n');
        symbol.add ('*');
        symbol.add (')');
        System.out.println(symbol);
        symbol.remove(1);
        System.out.println(symbol);

        Iterator<Character> itr = symbol.iterator();
        System.out.println(itr);
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        //                    boolean
        System.out.println(itr.hasNext());   // true
        //                     sam simvol
        System.out.println(itr.next());  // !
        System.out.println(itr.hasNext());  // true
        System.out.println(itr.next());   // ^
        System.out.println(itr.hasNext());  // true
        System.out.println(itr.next());   // n
        System.out.println(itr.hasNext());  // true
        System.out.println(itr.next());   // *
        System.out.println(itr.hasNext());  // true
        System.out.println(itr.next());  // )
        System.out.println(itr.hasNext());  // false
        System.out.println(itr.next());  //
    }
}
