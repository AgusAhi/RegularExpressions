import java.util.regex.*;
public class Main {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("abc");
        Matcher matcher = pattern.matcher("12345abc6789");
        matcher.find();
        System.out.println(matcher.start());
    }

}
