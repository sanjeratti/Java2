package codingbat.string1;

public class MakeAbba {
    public static void main(String[] args) {
        MakeAbba instance = new MakeAbba();
        System.out.println(instance.makeAbba("Hi", "Bye"));
    }

    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }
}
