package lista_exercicio_1;

public class Lista1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bola novaBola = new Bola("vermelho", (float)20.0, "borracha");
		System.out.println(novaBola.mostrarCor());
		novaBola.trocarCor("azul");
		System.out.println(novaBola.mostrarCor());
		System.out.println("------------------------------------------------------------------------------------------");
		
		Quadrado novoQuadrado = new Quadrado((float)5.0);
		System.out.println("Lado: " + novoQuadrado.retornaValorLado());
		novoQuadrado.mudarLado((float)10.0);
		System.out.println("Lado: " + novoQuadrado.retornaValorLado());
		novoQuadrado.calcularArea();
		System.out.println("------------------------------------------------------------------------------------------");
		
		Pessoa novaPessoa = new Pessoa("Henrique Luiz Hartmann", 19, 95, (float)183.0);
		novaPessoa.envelhecerPessoa(2);
		novaPessoa.engordarPessoa(2);
		novaPessoa.emagrecerPessoa(2);
		novaPessoa.crescerPessoa((float)2);
		System.out.println("------------------------------------------------------------------------------------------");
		
		TV novaTV = new TV(5, 20);
		novaTV.mudarCanal(200);
		novaTV.aumentarVolume();
		novaTV.diminuirVolume();
		System.out.println("------------------------------------------------------------------------------------------");
		
		BichinhoVirtual novoBicho = new BichinhoVirtual("Zig", false, false, 1);
		novoBicho.alterarNome("Ziguerson");
		novoBicho.alterarFome(true);
		novoBicho.alterarSaude(true);
		novoBicho.alterarIdade(2);
		System.out.println("Nome: "+novoBicho.retornarNome());
		System.out.println("Fome: "+novoBicho.retornarFome());
		System.out.println("Saúde: "+novoBicho.retornarSaude());
		System.out.println("Idade: "+novoBicho.retornarIdade());
		System.out.println("Humor: "+novoBicho.calcularHumor());
		System.out.println("------------------------------------------------------------------------------------------");
		
		BombaCombustivel novaBomba = new BombaCombustivel("gasolina", (float)4.39, (float)100);
		novaBomba.abastecerPorValor((float)50);
		novaBomba.abastecerPorLitro((float)50);
		novaBomba.alterarValor((float)4.31);
		novaBomba.alterarCombustivel("Álcool");
		novaBomba.alterarQuantidadeCombustivel((float)100);
		System.out.println("------------------------------------------------------------------------------------------");
	}

}
