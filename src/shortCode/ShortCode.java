package schortCode;

public class ShortCode {
    public static void main(String[] args) {

        if (55 > 1){
            System.out.println("yes");
        } else {
            System.out.println("no");

        }


        String str1 = (55 >1) ? "yes"  : "no";
        System.out.println(str1);

        System.out.println("..........");

        if ("Hi".equals("Hi")) {
            System.out.println(true);
        }else {
            System.out.println(false);
        }
        boolean result = ("Hi".equals("Hi"))?  true : false;
        System.out.println(result);
    }
}