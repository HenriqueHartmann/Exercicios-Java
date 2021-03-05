public class LowercaseWithHook extends StringWithHook {
    public String transform(String str) {
        System.out.println("Transformar string em minúscula: \n");
        String lower = str.toLowerCase();
        return lower;
    }
}
