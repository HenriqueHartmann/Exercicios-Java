package lista_exercicio_1;

public class Pessoa {
	private String nome;
	private int idade;
	private int peso;
	private float altura;
	
	public Pessoa(String nome, int idade, int peso, float altura) {
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
	}
	
	public void envelhecerPessoa(int anos) {
		if (this.idade < 21) {
			for (int i = this.idade; i < 21; i++) {
				this.altura += 0.5;
			}
		}
		this.idade += anos;
		System.out.println("Altura: "+this.altura+" cm");
		System.out.println("Idade: "+this.idade+" anos");
	}
	
	public void engordarPessoa(int quilos) {
		this.peso += quilos;
		System.out.println("Peso: "+this.peso+" kg");
	}
	
	public void emagrecerPessoa(int quilos) {
		this.peso -= quilos;
		System.out.println("Peso: "+this.peso+" kg");
	}
	
	public void crescerPessoa(float altura) {
		this.altura += altura;
		System.out.println("Altura: "+this.altura+" cm");
	}
}
