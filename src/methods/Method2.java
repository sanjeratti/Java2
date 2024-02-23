package methods;

public class Method2 {
    public static void main(String[] args) {

        // objazatelnie
        // Modifikatory dostupa || Access modifier             svoy klass    subclass    svoya papka   drugaya papka
        // 1. public  ----> dostupen po vsem proekte               -            -           -               -
        // 2. protected -->                                        -            -           -               x
        // 3. default  -->                                         -            -           x               x
        // 4.  private  -->                                        -            x           x               x


        // Optsionalnie || Optional
        // 1. Static
        // 2. final
        //3. abstact

        final String name = "Nuradis"; // constant postoyanniy
        String name1 = name.toUpperCase();  // ignoriruetsya
        System.out.println(name.hashCode());
        System.out.println(name1.hashCode());

        int num = 2;
        // final num = 3;

        final int inn = 117121;
        final int id = 66;

        final StringBuilder sb1 = new StringBuilder("Hello"); // constant postoyanniy
        System.out.println(sb1);
        System.out.println(sb1.hashCode());
        sb1.append("nn");
        System.out.println(sb1);
        System.out.println(sb1.hashCode());

        System.out.println(summa(2, 3));

        System.out.println(kolichestvozvezd(5));
        System.out.println(kolichestvozvezd(7));
        System.out.println(kolichestvozvezd(15));

        Method2 object = new Method2();
        System.out.println(object.hello("Zarina"));


        sendMessage("Privet kak dela");
    }

        // static method

        public static int summa(int num1, int num2){
            return num1 + num2;
        }
        public static int kolichestvozvezd (int num) {
            return num * 100;

    }

    // non-static method

    public String hello(String name){
        return "Hi"  + name;
    }

    // non-return method

    public static void sendMessage (String message){
        System.out.println("Message delivered");
    }

}
