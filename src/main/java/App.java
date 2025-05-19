import java.util.*;

class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Woof!");
    }
}

public class App {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("Z");
        list.add("C");
        List<String> list1 = new ArrayList<>();
        list1.add("D");
        list1.add("E");
        list.addAll(list1);
        list.sort(String::compareTo);
        System.out.println(list);
    }
}
