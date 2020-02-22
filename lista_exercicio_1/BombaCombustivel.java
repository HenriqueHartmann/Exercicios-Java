package lista_exercicio_1;

public class BombaCombustivel {
	private String tipoCombustivel;
	private float valorLitro;
	private float quantidadeCombustivel;
	
	public BombaCombustivel(String tipoCombustivel, float valorLitro, float quantidadeCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
		this.valorLitro = valorLitro;
		this.quantidadeCombustivel = quantidadeCombustivel;
	}
	
	public void abastecerPorValor(float valor) {
		float quantidade = valor/this.valorLitro;
		this.quantidadeCombustivel += quantidade;
		System.out.println("Quantidade: "+quantidade+" litros");
	}
	
	public void abastecerPorLitro(float valor) {
		this.quantidadeCombustivel += valor;
		System.out.println("R$ "+valor*this.valorLitro);
	}
	
	public void alterarValor(float valor) {
		this.valorLitro = valor;
		System.out.println("Valor por Litro: "+this.valorLitro);
	}
	
	public void alterarCombustivel(String combustivel) {
		this.tipoCombustivel = combustivel;
		System.out.println("Combustível: "+this.tipoCombustivel);
	}
	
	public void alterarQuantidadeCombustivel(float quantidadeCombustivel) {
		this.quantidadeCombustivel = quantidadeCombustivel;
		System.out.println("Litros na bomba: "+this.quantidadeCombustivel);
	}
	
}
