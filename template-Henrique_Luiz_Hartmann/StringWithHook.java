import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class StringWithHook {

    final void templateMethod() {
        String str = getUserInput();
        printString(str, transform(str));
    }

    private String getUserInput() {
        String str = null;
        System.out.println("Digite a String: ");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        try {
            str = in.readLine();
        } catch (IOException ioe) {
            System.out.println("Erro IO tentando ler o que você digitou");
        }

        if (str == null || str.isEmpty()) {
            throw new RuntimeException("Erro o valor digitado não pode ser em branco");
        }

        return str;
    }

    private void printString(String original, String str) {
        System.out.println(original + " = " + str);
    }

    abstract String transform(String str);
}
