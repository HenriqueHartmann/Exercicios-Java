package lista_exercicio_1;

public class BichinhoVirtual {
	private String nome;
	private boolean fome;
	private boolean saude;
	private int idade;
	
	public BichinhoVirtual(String nome, boolean fome, boolean saude, int idade) {
		this.nome = nome;
		this.fome = fome;
		this.saude = saude;
		this.idade = idade;
	}
	
	public void alterarNome(String nome) {
		this.nome = nome;
	}
	
	public void alterarFome(boolean fome) {
		this.fome = fome;
	}
	
	public void alterarSaude(boolean saude) {
		this.saude = saude;
	}
	
	public void alterarIdade(int idade) {
		this.idade = idade;
	}
	
	public String retornarNome() {
		return this.nome;
	}
	
	public boolean retornarFome() {
		return this.fome;
	}
	
	public boolean retornarSaude() {
		return this.saude;
	}
	
	public int retornarIdade() {
		return this.idade;
	}
	
	public String calcularHumor() {
		String humor = "";
		if (this.saude && this.fome) {
			humor = "Baixo";
		} else if (this.saude == false && this.fome == false) {
			humor = "Alto";
		} else {
			humor = "Médio";
		}
		return humor;
	}
}
