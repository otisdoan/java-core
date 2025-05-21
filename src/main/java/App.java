import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("Hieu*");
        Matcher matcher = pattern.matcher("Hieu");
        System.out.println(matcher.find());

        boolean isOK = Pattern.compile("Hieu").matcher("Hieu").matches();
        System.out.println(isOK);

        boolean isYes = Pattern.matches("Java", "Java");
        System.out.println(isYes);

        boolean isNo = Pattern.compile("Hieu").matcher("Hieu").find();
        System.out.println(isNo);
    }
}
