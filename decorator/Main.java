package decorator;

import decorator.ingredientes.Saque;
import decorator.ingredientes.Vodka;
import decorator.ingredientes.*;

public class Main {
    public static void main(String[] args) {
        Caipira caipira1 = new Caipira();
        caipira1 = new Saque(caipira1);
        caipira1 = new Abacaxi(caipira1);
        caipira1 = new Kiwi(caipira1);
        caipira1 = new Açucar(caipira1);
        System.out.println(caipira1.getDescription() + " R$" + caipira1.cost());

        System.out.println("------ \n");

        Caipira caipira2 = new Caipira();
        caipira2 = new Vodka(caipira2);
        caipira2 = new Morango(caipira2);
        caipira2 = new Adoçante(caipira2);
        System.out.println(caipira2.getDescription() + " R$" + caipira2.cost());

        System.out.println("------ \n");

        Caipirinha caipirinha = new Caipirinha();
        System.out.println(caipirinha.getDescription() + " R$" + caipirinha.cost());

        System.out.println("------ \n");
    }
}
