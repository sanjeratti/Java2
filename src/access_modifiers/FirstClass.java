package access_modifiers;

public class FirstClass {
    public static void main(String[] args) {
        System.out.println(namePublic("Public"));
        System.out.println(namePublic("Protected"));
        System.out.println(namePublic("Default"));
        System.out.println(namePublic("Private"));


        //    svoi klass                    package                     Subclass                Another Package
    }

    public static String namePublic(String name){
        return "Hi" + name;

    }
    protected static String nameProtected (String name){
        return "Hi" + name;
    }
    static String nameDefault (String name){
        return "Hi" + name;
    }
    private String namePrivate (String name){
        return "Hi" + name;
    }
}
