package access_modifiers;

public class SecondClass {
    public static void main(String[] args) {
        System.out.println(FirstClass.namePublic("Public"));
        System.out.println(FirstClass.nameProtected("Protected"));
        System.out.println(FirstClass.nameDefault("Defaut"));
        System.out.println(Privatnyi.namePublic1("Public"));
    }
}
