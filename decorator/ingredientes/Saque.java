package decorator.ingredientes;

import decorator.Caipira;
import decorator.IngredienteDecorator;

public class Saque extends IngredienteDecorator {
    Caipira drink;

    public Saque(Caipira drink) {
        this.drink = drink;
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + ", Saque";
    }

    @Override
    public double cost() {
        return 2 + drink.cost();
    }
}
