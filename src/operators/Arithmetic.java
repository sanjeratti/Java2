package operators;

public class Arithmetic {
    public static void main(String[] args) {
        int a = 1;
        int b = 3;
        System.out.println(a + b); // 1+3
        System.out.println(a-b); //1-3
        System.out.println(a*b);
        System.out.println(a / b);
        System.out.println("_____");

        int a1 = 11;
        int b1 =2;
        System.out.println(a1 / b1);  //11 /2 = 5
        System.out.println(a1 % b1);  // 11 % 2 = 1
        System.out.println("___________");


        //increment  ++  (+1) Decrement -- (-1)
        int a2 = 0;
        System.out.println(a2++);  // 0
        System.out.println(a2++);  // 1
        System.out.println(a2++);  // 2
        System.out.println(a2++);  // 3
        System.out.println(a2++);  // 4
        System.out.println("_______");

        //prefix ++a  --a| postfix a++  a--
        int a3 = 0;
        System.out.println(++a3);
        System.out.println(++a3);
        System.out.println(++a3);
        System.out.println(++a3);
        System.out.println(++a3);
        System.out.println("___________");
//
        int a4 = 10;
        System.out.println(++a3);
        System.out.println(++a3);
        System.out.println(++a3);
        System.out.println(++a3);
        System.out.println(++a3);
        System.out.println("________");







    }


}

/* operatory

    1. Arifmeticheskie + - * / % ++ --
    2. Naznachenia     = += -= *= /= %= &= |= ^=
    3. Sravneniya   == != <  >  >= <=
    4. Logicheskie  && || !(net)

 */
