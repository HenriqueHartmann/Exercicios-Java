public class Cruze implements Carro {

    @Override
    public void adicionaAcessorio() {
        System.out.println("Adicionando acessórios Cruze");
    }

    @Override
    public void escolhaCombustivel() {
        System.out.println("Escolhendo combustível Cruze");
    }

    @Override
    public void escolheCor() {
        System.out.println("Escolhendo cor Cruze");
    }

    @Override
    public void enviaMontagem() {
        System.out.println("Montando Cruze");
    }
}
