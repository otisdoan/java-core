import java.util.*;

public class App {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();

        treeSet.add(10);
        treeSet.add(15);
        treeSet.add(20);
        treeSet.add(25);

        System.out.println(treeSet.ceiling(10));
    }
}
