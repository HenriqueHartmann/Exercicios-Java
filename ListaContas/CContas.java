package ListaContas;

public class CContas {

    public static void main(String[] args) {
        ListaClientes l1 = new ListaClientes();

        Cliente c1 = new Cliente("121.211.751-90", "Henrique Luiz Hartmann");
        Cliente c2 = new Cliente("121.255.800-90", "Edson Luiz Hartmann");
        Cliente c3 = new Cliente("001.300.655-85", "Silvia Regina Grawe Hartmann");
        Cliente c4 = new Cliente("500.614.950-10", "Zé Ninguém1");

        CCorrente conta1 = new CCorrente(1, (float)400);
        c1.addContas(conta1);
        l1.addClientes(c1);
        System.out.println(c1.getContas());

        System.out.println("- - - - - - - - - - -");

        CEspecial conta2 = new CEspecial(2, (float)1000, 2000);
        c2.addContas(conta2);
        l1.addClientes(c2);
        System.out.println(c2.getContas());

        System.out.println("- - - - - - - - - - -");

        CPoupanca conta3 = new CPoupanca(3, (float)1000, 100);
        c3.addContas(conta3);
        l1.addClientes(c3);
        System.out.println(c3.getContas());

        System.out.println("- - - - - - - - - - -");

        CInvestimento conta4 = new CInvestimento(4, (float)1000, 2, 20);
        c4.addContas(conta4);
        l1.addClientes(c4);
        System.out.println(c4.getContas());

        System.out.println("- - - - - - - - - - -");

        l1.imprimirClientes();
    }
}
