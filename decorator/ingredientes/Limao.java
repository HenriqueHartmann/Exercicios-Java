package decorator.ingredientes;

import decorator.Caipira;
import decorator.IngredienteDecorator;

public class Limao extends IngredienteDecorator {
    Caipira drink;

    public Limao(Caipira drink) {
        this.drink = drink;
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + ", Limao";
    }

    @Override
    public double cost() {
        return 1 + drink.cost();
    }
}
