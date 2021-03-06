package Contas;

import java.util.Calendar;

public class CInvestimento extends CCorrente {
    private int dia_investimento;
    private int periodo;

    public CInvestimento(int numero, Float saldo, String cliente, int dia, int periodo) {
        super(numero, saldo, cliente);
        this.dia_investimento = dia;
        this.periodo = periodo;
    }

    public void atualizar_saldo() {
        Calendar dataAtual = Calendar.getInstance();
        int dia = dataAtual.get(Calendar.DAY_OF_MONTH);
        System.out.println(dia);
        if (dia == (this.dia_investimento + this.periodo)) {
            super.set_saldo((float) (super.get_saldo() * 1.20));
        } else {
            System.out.println("Ainda não é dia do investimento");
        }
    }
}