package operators;

public class Logical {

    public static void main(String[] args) {

       // ?? && --> jana  || =--> ili  ! --> ne

        // && --- ampersand
        // true && true = true
        // true && false = false

        //         true         true
        boolean a= 24 > 10 && 30 == 30;
        System.out.println(a);

        //        true   && false
        boolean a1 = 25> 10 && 1==1;
        boolean a2 = 20 < 10 && 1==1;
        System.out.println(a);
        System.out.println(a1);
        System.out.println(a2);

    }
}
