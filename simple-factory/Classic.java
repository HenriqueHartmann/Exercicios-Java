public class Classic implements Carro{

    @Override
    public void adicionaAcessorio() {
        System.out.println("Adicionando acessórios Classic");
    }

    @Override
    public void escolhaCombustivel() {
        System.out.println("Escolhendo combustível Classic");
    }

    @Override
    public void escolheCor() {
        System.out.println("Escolhendo cor Classic");
    }

    @Override
    public void enviaMontagem() {
        System.out.println("Montando Classic");
    }
}
