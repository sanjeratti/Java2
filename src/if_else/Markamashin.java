package if_else;

import java.util.Scanner;
public class Markamashin {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
        System.out.println("хотите купить машину");
    boolean car = scan.nextBoolean();
        if(car ==true);
        System.out.println("укажите возраст");
    int age = scan.nextInt();
        if(age >=18)

    {
        System.out.println("вы можете купить машину");
        System.out.println("какую марку вы хотите");
        String car_name = scan.next();
        if (car_name.equals("bmw") || car_name.equals("honda") || car_name.equals("lexus")) {
            System.out.println("My vam pokajem " + car_name);
        } else {
            System.out.println("Takoi marki net");
        }
    } else

    {
        System.out.println("вы несовершеннолетние");
        System.out.println("вы не можете купить машину");
    }
}

}