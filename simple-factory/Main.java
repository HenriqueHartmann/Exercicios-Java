public class Main {

    public static void main (String[] args) {
        SimpleCarroFactory scf = new SimpleCarroFactory();
        LojaCarros lc = new LojaCarros(scf);
        lc.pedirCarro("cruze");
        System.out.println("\n ---------- \n");
        lc.pedirCarro("celta");
        System.out.println("\n ---------- \n");
        lc.pedirCarro("captiva");
        System.out.println("\n ---------- \n");
        lc.pedirCarro("classic");
        System.out.println("\n ---------- \n");
    }
}
