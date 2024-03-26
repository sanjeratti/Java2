package oop;

public class DogMain {
    public static void main(String[] args) {

        Dog rex = new Dog();
        rex.name = "Barbos";
        rex.age = 2;
        rex.breed = "Ovcharka";
        rex.color = "Seriy";

        System.out.println(rex);
        System.out.println(rex.bark());
        System.out.println(rex.eat());
        System.out.println(rex.run());

        Dog aktosh = new Dog();
        aktosh.name = "aktosh";
        aktosh.age = 5;
        aktosh.breed = "Mashke";
        aktosh.color = "Beliy";

        System.out.println(aktosh);
        System.out.println(rex.bark());
        System.out.println(rex.eat());
        System.out.println(rex.run());

        //System.out.println(myDog(aktosh));
    }

}
