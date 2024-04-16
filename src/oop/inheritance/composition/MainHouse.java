package oop.inheritance.composition;

public class MainHouse {
    public static void main(String[] args) {

        House myHouse = new House();
        System.out.println("House`s bedroom:" + myHouse.getBedroom().getName());
        System.out.println("House`s kitchen:" +myHouse.getKitchen().getName());

    }


}
