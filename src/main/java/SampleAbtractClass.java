public abstract class SampleAbtractClass {
    public SampleAbtractClass() {
    }

    public abstract void sayHello();

    public int caculator(int a, int b) {
        return a + b;
    }

    public static void sayGoodBye() {
        System.out.println("Bye!");
    }

    public final void noChangeBody() {
        System.out.println("No override");
    }
}
