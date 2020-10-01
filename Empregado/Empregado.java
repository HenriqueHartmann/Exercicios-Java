package Empregado;

public class Empregado {
    private int codigo;
    private String nome;
    private String email;
    private float salario;

    public Empregado(int codigo, String nome, String email, float salario) {
        this.codigo = codigo;
        this.nome = nome;
        this.email = email;
        this.salario = salario;
    }

    public float get_salario() { return this.salario; }

    public void set_salario(float novo_salario) {
        this.salario = novo_salario;
    }

    public void aumento_salarial(int percentual) {
        this.salario = this.salario * percentual;
    }
}
