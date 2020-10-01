package Empregado;

public class Estagiario extends Empregado{
    private int descontos;

    public Estagiario(int codigo, String nome, String email, float salario, int descontos) {
        super(codigo, nome, email, salario);
        this.descontos = descontos;
    }

    @Override
    public void aumento_salarial(int percentual) {
        super.set_salario(((super.get_salario() * percentual) - this.descontos));
    }
}
