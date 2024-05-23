package codingbat.string1;

public class MakeTags {
    public static void main(String[] args) {
        MakeTags instance = new MakeTags();
        System.out.println(instance.makeTags("i", "Hello"));  // Should print "<i>Hello</i>"
    }

    public String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }
}
