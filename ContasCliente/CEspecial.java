package ContasCliente;

public class CEspecial extends CCorrente {
    private int limite;

    public CEspecial(int numero, Float saldo, Cliente cliente, int limite) {
        super(numero, saldo, cliente);
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
}