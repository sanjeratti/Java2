package loops;

public class Loop2 {
    public static void main(String[] args) {

        String fio = "Asanov Asan";
        String familia = "";
        for (int i = 0; i < fio.length(); i++) {
            familia = familia + fio.charAt(i);
            if (fio.charAt(i) == ' ') {
                break;
                // System.out.println(fio.substring(0, ));
            }
            //  0                0< fio.length()
            //  familia = ""  + "A"

        }
        System.out.println(familia);


        String fio1 = "Asanov Aman";
        String name = "";
        String surname = "";

        for (int i = 0; i < fio1.length(); i++) {
            surname += fio1.charAt(i);
            if (fio.charAt(i) == ' ') {
                name += fio1.substring(i);
                break;

            }
        }
        System.out.println(name + " " + surname);
    }

}