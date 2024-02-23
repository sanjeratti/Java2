package access_modifiers;

public class Privatnyi extends SuperClass{
    public static void main(String[] args) {
        System.out.println(FirstClass.namePublic("Public"));

        Privatnyi priv = new Privatnyi();
        System.out.println(priv.nameProtected2("Protected"));
    }
    public static String namePublic1(String name){
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
