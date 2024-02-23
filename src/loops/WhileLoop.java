package loops;

public class WhileLoop {
    public static void main(String[] args) {

// while loop only BOOLEAN

        int n = 1;

        // 1 < 5 (true)  // println1
        // 2 < 5 (true)  // println1
        // 3 < 5 (true)  // println1
        // 4 < 5 (true)  // println1
        // 5 < 5 (false)  // vihodit iz cikla


        // kol-vo iteratsii ne izvestno
        while ((n < 5)) {

            System.out.println(n);
            n++;

            //kol-vo iteratsii izvestno
            for (int m = 1; m < 5; m++){
                System.out.println(m);
            }

            int days = 0;
            int savings = 0;
            int som = 1000;

            while (savings < 100000){
                savings += som;   // savings = savings + spm   ---> savings += som
                days += 2;
            }

            System.out.println("Nam potrebuetsya" + days + "dney");

            int days1 = 0;
            int savings1 = 0;
            int som1 = 1000;

            for (days1 = 0; savings1 < 100000; days1 += 2){
                savings1 += som1;
            }
            System.out.println("nam potrebuetsya" + days1+ "dney");


            // do  - while loop

            int q = 7;
            do{
                System.out.println(q);
                q++;
            }
            // false\
            while (q< 5);
        }
    }
}
