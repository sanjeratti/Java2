package operators;

public class Assignment {
    public static void main(String[] args) {

        // = += -+ *= /= %= &=  |= ^=

        // =
        int num = 10;
        System.out.println(num);

        // +=
        num += 5;  // 10 + 5
        System.out.println(num);

        double d1 = (double) num;
        d1 /=2; // 15 /2 = 7,5
        System.out.println(d1);

        // -= 1;
        num -= 1;
        System.out.println(num);

        // *=
        num *= 2;
        System.out.println(num);

        // /=
        num /= 4;
        System.out.println(num);

        // %=
        num %= 3;  // 7%

    }
}
