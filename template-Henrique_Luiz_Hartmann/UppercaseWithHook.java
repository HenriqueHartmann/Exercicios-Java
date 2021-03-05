public class UppercaseWithHook extends StringWithHook {
    public String transform(String str) {
        System.out.println("Transformar string em maiúscula: \n");
        String upper = str.toUpperCase();
        return upper;
    }
}
