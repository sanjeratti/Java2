package codingbat;

public class String1 {
    public static void main(String[] args) {

        System.out.println(helloName("Bob"));
        System.out.println(helloName("Alisa"));

    }
        public static String helloName (String name) {
            return "Hello" + name + "!";
        }

}
