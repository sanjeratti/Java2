package oop;

public class ProgrammerMain {
    public static void main(String[] args) {
        Programmer Sanzhar = new Programmer();
        Sanzhar.name = "Sanzhar";
        Sanzhar.age = 39;
        Sanzhar.education = "KTU";
        Sanzhar.experience = 10;
        Sanzhar.Hobby = "Running";
        Sanzhar.jobtitle = "SW Tester";
        Sanzhar.Nationality = "Kyrgyz";
        System.out.println(Sanzhar);
        System.out.println(Sanzhar.relax());
        System.out.println(Sanzhar.coding());


    }
}
