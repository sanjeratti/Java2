package arrays1;

import java.util.Arrays;
// massivi
public class Arrays1  {

    public static void main(String[] args) {

            // 1 sposob
            int[] arrs = new int[2];
            arrs[0] = 1;
            arrs[1] = 3;

            System.out.println(arrs[0]);
            System.out.println(arrs[1]);
            System.out.println(Arrays.toString(arrs));

            // 2 sposob
            int[] arrs2 = new int[]{4, 6, 8};
            System.out.println(arrs2[1]);
            System.out.println(Arrays.toString(arrs2));


            String[] names = new String[3];
            names[0] = "Aida";
            System.out.println(Arrays.toString(names));

            boolean[] trues = new boolean[4];
            trues[2] = true;
            System.out.println(Arrays.toString(trues));

            int[] numbers = new int[17];
            numbers[0] = 7;
            numbers[8] = 9;
            System.out.println(Arrays.toString(numbers));


            String[] name1 = new String[]{"Nuraika", "Zamira", "Zarina"};
            System.out.println(Arrays.toString(name1));


            for (String i : name1) {
                    System.out.println(i);
            }
    }
}
