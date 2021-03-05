public class ReverseWithHook extends StringWithHook {
    public String transform(String str) {
        System.out.println("Inverter string: \n");
        String reverse = new StringBuilder(str).reverse().toString();
        return reverse;
    }
}
