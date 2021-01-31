package decorator;

public class Caipira extends Drink {
    public Caipira() {
        description = "Caipira";
    }

    @Override
    public double cost() {
        return 3;
    }
}
