package Empregado;

public class Chefe extends Empregado{
    private float beneficio;

    public Chefe(int codigo, String nome, String email, float salario, float beneficio) {
        super(codigo, nome, email, salario);
        this.beneficio = beneficio;
    }

    @Override
    public void aumento_salarial(int percentual) {
        super.set_salario(((super.get_salario() * percentual) + this.beneficio));
    }
}
