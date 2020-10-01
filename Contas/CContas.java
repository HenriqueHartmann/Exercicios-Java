package Contas;

public class CContas {

    public static void main(String[] args) {
        CCorrente conta1 = new CCorrente(1, (float)400, "Henrique Luiz Hartmann");
        conta1.debitar((float)200);
        System.out.println(conta1.get_saldo());
        conta1.creditar((float)800);
        System.out.println(conta1.get_saldo());

        System.out.println("- - - - - - - - - - -");

        CEspecial conta2 = new CEspecial(2, (float)1000, "Edson Luiz Hartmann", 2000);
        conta2.debitar((float) 3000);
        System.out.println(conta2.get_saldo());
        conta2.creditar((float)800);
        System.out.println(conta2.get_saldo());

        System.out.println("- - - - - - - - - - -");

        CPoupanca conta3 = new CPoupanca(3, (float)1000, "Silvia Regina Grawe Hartmann", 100);
        conta3.debitar((float) 1000);
        System.out.println(conta3.get_saldo());
        System.out.println(conta3.get_saldominimo());
        conta3.creditar((float)800);
        System.out.println(conta3.get_saldo());
        conta3.atualizar_saldo();
        System.out.println(conta3.get_saldo());

        System.out.println("- - - - - - - - - - -");

        CInvestimento conta4 = new CInvestimento(4, (float)1000, "Zé Ninguém", 2, 20);
        conta4.atualizar_saldo();
        System.out.println(conta4.get_saldo());

        System.out.println("- - - - - - - - - - -");

        CInvestimento conta5 = new CInvestimento(5, (float)1000, "Zé Ninguém2", 1, 20);
        conta5.atualizar_saldo();
        System.out.println(conta5.get_saldo());
    }
}
