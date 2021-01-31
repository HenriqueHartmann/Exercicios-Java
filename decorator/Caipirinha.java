package decorator;

public class Caipirinha extends Drink {
    public Caipirinha() {
        description = "Caipirinha - Cachaça, Limao, Gelo e Açucar";
    }

    @Override
    public double cost() {
        return 6;
    }
}
