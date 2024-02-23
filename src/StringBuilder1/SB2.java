package StringBuilder1;

public class SB2 {
    public static void main(String[] args) {

        StringBuilder sb1= new StringBuilder();
        System.out.println(sb1.capacity()); //16

        StringBuilder sb2= new StringBuilder(5);
        System.out.println(sb2.capacity()); //

        StringBuilder sb3 = new StringBuilder("Hello");
        System.out.println(sb3.capacity()); // 21

        StringBuilder sb4 = new StringBuilder("Kanday jakshibi");
        System.out.println(sb4.capacity());

        // formula CAPACITY = (akirky capacity +1) * 2

        String name = "Nuradis";
        int fio = 1;
        System.out.println(name + fio);

        // System.out.println(name.concat(fio));  XXX
    StringBuilder sb5 = new StringBuilder();
    sb5.append('k');
    sb5.append(99);
    sb5.append(true);
    sb5.append("nan");
        System.out.println(sb5);  // k99truenan --> String

    }
}
