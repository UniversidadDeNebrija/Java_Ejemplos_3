package g_Patron_Decorator_Coffee;

/**
 * Un decorador concreto que añade azúcar al café.
 */
class WithSugar extends CoffeeDecorator {
    
    /**
     * Constructor para el decorador 'WithSugar'.
     * @param decoratedCoffee El objeto 'Coffee' que está siendo decorado con azúcar.
     */
    public WithSugar(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    /**
     * Añade la descripción del azúcar al café.
     */
    @Override
    public String getDescription() {
        return super.getDescription() + ", Sugar";
    }

    /**
     * Añade el costo del azúcar al costo total del café.
     */
    @Override
    public double cost() {
        return super.cost() + 0.2;
    }
}
