import java.time.LocalTime;

interface SampleInterface {
    String name = "Doan Hieu";

    void getName();

    default void printName() {
        System.out.println(name);
    }

    static String getCurrentTime() {
        return String.valueOf(LocalTime.now());
    }
}
