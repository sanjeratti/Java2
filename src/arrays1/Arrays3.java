package arrays1;

import java.util.Arrays;

public class Arrays3 {
    public static void main(String[] args) {
        int [] arrs = new int[3];
        System.out.println(Arrays.toString(arrs));

        //                       eto dlina
        String[] str = new String[4];
        //eto index
        str[3] = "Zarina";
        str[3] = "Zamira";
        System.out.println(Arrays.toString(str));

        //mnogomernie massivi
        int nums[][] = new int [3][2];
        nums[0][0] = 22;
        nums[0][1] = 23;
        nums[1][0] = 25;
        nums[1][1] = 26;
        nums[2][1] = 28;
        System.out.println(Arrays.deepToString(nums));
        System.out.println(nums[1][1]);  //26

        //


    }
}
