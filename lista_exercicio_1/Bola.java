package lista_exercicio_1;

public class Bola {
	private String corBola;
	private	float circuferenciaBola;
	private	String materialBola;
	
	public Bola(String cor, float circuferencia, String material) {
		this.corBola = cor;
		this.circuferenciaBola = circuferencia;
		this.materialBola = material;
	}
	
	public void trocarCor(String cor) {
		this.corBola = cor;
	}
	
	public String mostrarCor() {
		return this.corBola;
	}
}
