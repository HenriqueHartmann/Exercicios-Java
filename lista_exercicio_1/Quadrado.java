package lista_exercicio_1;

public class Quadrado {
	private float tamanhoLado;
	
	public Quadrado(float tamanhoLado) {
		this.tamanhoLado = tamanhoLado;
	}
	
	public void mudarLado(float tamanhoLado) {
		this.tamanhoLado = tamanhoLado;
	}
	
	public float retornaValorLado() {
		return this.tamanhoLado;
	}
	
	public void calcularArea() {
		double area = Math.pow(this.tamanhoLado, 2);
		System.out.println("Área: " + area);
	}
}
