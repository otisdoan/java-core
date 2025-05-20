import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("Hieu*");
        Matcher matcher = pattern.matcher("Hieu");
        System.out.println(matcher.find());
    }
}
