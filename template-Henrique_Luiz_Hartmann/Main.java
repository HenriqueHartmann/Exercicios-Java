public class Main {
    public static void main(String[] args) {
        LowercaseWithHook lower = new LowercaseWithHook();
        UppercaseWithHook upper = new UppercaseWithHook();
        ReverseWithHook reverse = new ReverseWithHook();

        lower.templateMethod();
        upper.templateMethod();
        reverse.templateMethod();
    }
}
