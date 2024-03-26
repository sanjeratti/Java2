package codingbat;

public class Warmup_1 {
    public static void main(String[] args) {

    }

    // 1. sleepIn
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }
        return false;
    }

    //2.monkeyTrouble
//
//    We have two monkeys, a and b,
//    and the parameters aSmile and bSmile indicate if each is smiling.
//    We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.
    ////
//    monkeyTrouble(true, true) → true
//    monkeyTrouble(false, false) → true
//    monkeyTrouble(true, false) → false

    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile && bSmile) {
            return true;
        }
        if (!aSmile && !bSmile) {
            return true;
        }
        return false;
        // The above can be shortened to:
        //   return ((aSmile && bSmile) || (!aSmile && !bSmile));
        // Or this very short version (think about how this is the same as the above)
        //   return (aSmile == bSmile);
    }

//    //3.
//    Given two int values, return their sum. Unless the two values are the same, then return double their sum.
//
//
//            sumDouble(1, 2) → 3
//    sumDouble(3, 2) → 5
//    sumDouble(2, 2) → 8

    public static int sumDouble(int a, int b) {
        // Store the sum in a local variable
        int sum = a + b;

        // Double it if a and b are the same
        if (a == b) {
            sum = sum * 2;
        }

        return sum;
    }

    // 4. Diff21

//    Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.
//
//
//    diff21(19) → 2
//    diff21(10) → 11
//    diff21(21) → 0

    public static int diff21(int n) {
        if (n <= 21) {
            return 21 - n;
        } else {
            return (n - 21) * 2;
        }
    }
    // 5 .  parrotTrouble
    //
//    We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.
//
//
//    parrotTrouble(true, 6) → true
//    parrotTrouble(true, 7) → false
//    parrotTrouble(false, 6) → false

    public static boolean parrotTrouble(boolean talking, int hour) {
        return (talking && (hour < 7 || hour > 20));
        // Need extra parenthesis around the || clause
        // since && binds more tightly than ||
        // && is like arithmetic *, || is like arithmetic +
    }
}
