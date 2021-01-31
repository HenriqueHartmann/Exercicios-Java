package decorator.ingredientes;

import decorator.Caipira;
import decorator.IngredienteDecorator;

public class Abacaxi extends IngredienteDecorator {
    Caipira drink;

    public Abacaxi(Caipira drink) {
        this.drink = drink;
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + ", Abacaxi";
    }

    @Override
    public double cost() {
        return 1 + drink.cost();
    }
}
