public class Celta implements Carro{

    @Override
    public void adicionaAcessorio() {
        System.out.println("Adicionando acessórios Celta");
    }

    @Override
    public void escolhaCombustivel() {
        System.out.println("Escolhendo combustível Celta");
    }

    @Override
    public void escolheCor() {
        System.out.println("Escolhendo cor Celta");
    }

    @Override
    public void enviaMontagem() {
        System.out.println("Montando Celta");
    }
}
