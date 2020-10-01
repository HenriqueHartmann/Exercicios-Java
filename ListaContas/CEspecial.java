package ListaContas;

public class CEspecial extends CCorrente {
    private int limite;

    public CEspecial(int numero, Float saldo, int limite) {
        super(numero, saldo);
        this.limite = limite;
    }

    @Override
    public void debitar(float valor) {
        if (valor <= (super.get_saldo() + this.limite)) {
            super.set_saldo(super.get_saldo() - valor);
        } else {
            System.out.println("O valor excedeu o limite");
        }
    }

    @Override
    public String toString() {
        return (super.toString() + " Limite:" + this.limite);
    }
}