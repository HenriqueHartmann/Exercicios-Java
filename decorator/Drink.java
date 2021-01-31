package decorator;

public abstract class Drink {
    String description = "Bebida desconhecida";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
