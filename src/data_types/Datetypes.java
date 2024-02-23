package data_types;

public class Datetypes {
    public static void main(String[] args) {
        System.out.println("Privet");
        //         Data types  | Tipy dannih
        //          /                      \
        //       Primitive                       //Non-primitive
        //  /        |        \
        // Logical  Numeric   Character       Linked (ssilochniy)
        //  ||       ||          ||
        // Boolean  Drobniye     char             String
        //          tselochislennie(1)            Array [10000, 10001] massivy
        // true     float 32 byte                        User defined
        // false    double 64 byte
        //          short
        //          int
        //          long


// примитивы
        byte a = 12; // -128 127

        System.out.println(a);

        short b = 1000; // -32768 32767

        System.out.println(b);

        int c = 10000; //4 byte

        System.out.println(c);

        long d = 10000007;
        System.out.println(d);

        long d1 = 110;
        byte d2 = (byte) d1; // casting convert

        float e = 121245f;  //32 byte
        System.out.println(e);




        System.out.println(e);


    }
}
