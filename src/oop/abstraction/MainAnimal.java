package oop.abstraction;

public class MainAnimal {
   public static void main(String[] args) {

      WildAnimal lion = new WildAnimal("Korol Lev", 5);
      System.out.println(lion);
      lion.voice();

      Pet cat = new Pet("Murka", 3);
      System.out.println(cat);
      cat.voice();
   }

}