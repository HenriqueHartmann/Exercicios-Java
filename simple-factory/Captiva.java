public class Captiva implements Carro{

    @Override
    public void adicionaAcessorio() {
        System.out.println("Adicionando acessórios Captiva");
    }

    @Override
    public void escolhaCombustivel() {
        System.out.println("Escolhendo combustível Captiva");
    }

    @Override
    public void escolheCor() {
        System.out.println("Escolhendo cor Captiva");
    }

    @Override
    public void enviaMontagem() {
        System.out.println("Montando Captiva");
    }
}
