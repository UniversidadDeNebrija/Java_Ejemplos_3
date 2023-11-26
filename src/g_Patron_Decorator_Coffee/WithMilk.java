package g_Patron_Decorator_Coffee;

/**
 * Un decorador concreto que añade leche al café.
 */
class WithMilk extends CoffeeDecorator {
    
    /**
     * Constructor para el decorador 'WithMilk'.
     * @param decoratedCoffee El objeto 'Coffee' que está siendo decorado con leche.
     */
    public WithMilk(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    /**
     * Añade la descripción de la leche al café.
     */
    @Override
    public String getDescription() {
        return super.getDescription() + ", Milk";
    }

    /**
     * Añade el costo de la leche al costo total del café.
     */
    @Override
    public double cost() {
        return super.cost() + 0.5;
    }
}
