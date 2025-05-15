import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        String s1 = "Le Doan Hieu";
        System.out.println(s1.charAt(6));
        System.out.println(s1.length());

        String name = "Le Doan Hieu";
        int age = 24;

        String s2 = String.format("Hello, My name is %s. I am %d year old", name, age);
        String s3 = name.substring(1, 5);
        String s4 = "Hieu";
        if (name.contains(s4)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        String s5 = String.join("-", name, s4);

        if (s4.equals("Hi")) {
            System.out.println("Equals true");
        }

        String a = "Hieu";
        String b = "hieu1";

        if (a.equalsIgnoreCase(b)) {
            System.out.println("Equals");
        }

        String c = " ";
        if (c.trim().isEmpty()) {
            System.out.println("Hello");
        } else {
            System.out.println("No hello");
        }

        String s = "  Hieu  A";
        String s8 = "Hieu B";

        String[] split = name.split(" ");
        for (String sg : split) {
            System.out.print(sg + " ");
        }
        System.out.println(name.replace("Hieu", "Hoa"));
        System.out.println(s.trim().concat(s8));
        System.out.println(s);
        System.out.println(s.trim());
        System.out.println(s5);
        System.out.println(s3);
        System.out.println(s2);

    }
}
