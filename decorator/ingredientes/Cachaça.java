package decorator.ingredientes;

import decorator.Caipira;
import decorator.IngredienteDecorator;

public class Cachaça extends IngredienteDecorator {
    Caipira drink;

    public Cachaça(Caipira drink) {
        this.drink = drink;
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + ", Cachaça";
    }

    @Override
    public double cost() {
        return 2 + drink.cost();
    }
}
