package ContasCliente;

public class CContas {

    public static void main(String[] args) {
        Cliente c1 = new Cliente("121.211.751-90", "Henrique Luiz Hartmann");
        Cliente c2 = new Cliente("121.255.800-90", "Edson Luiz Hartmann");
        Cliente c3 = new Cliente("001.300.655-85", "Silvia Regina Grawe Hartmann");
        Cliente c4 = new Cliente("500.614.950-10", "Zé Ninguém1");

        CCorrente conta1 = new CCorrente(1, (float)400, c1);
        System.out.println(conta1);

        System.out.println("- - - - - - - - - - -");

        CEspecial conta2 = new CEspecial(2, (float)1000, c2, 2000);
        System.out.println(conta2);

        System.out.println("- - - - - - - - - - -");

        CPoupanca conta3 = new CPoupanca(3, (float)1000, c3, 100);
        System.out.println(conta3);

        System.out.println("- - - - - - - - - - -");

        CInvestimento conta4 = new CInvestimento(4, (float)1000, c4, 2, 20);
        System.out.println(conta4);
    }
}
