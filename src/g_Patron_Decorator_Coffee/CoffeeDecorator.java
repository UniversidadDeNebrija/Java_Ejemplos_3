package g_Patron_Decorator_Coffee;

/**
 * Clase abstracta 'CoffeeDecorator' que actúa como la clase base para todos los decoradores.
 */
abstract class CoffeeDecorator implements Coffee {
    private Coffee decoratedCoffee;

    /**
     * Constructor para el decorador de café.
     * @param decoratedCoffee El objeto 'Coffee' que está siendo decorado.
     */
    public CoffeeDecorator(Coffee decoratedCoffee) {
        this.decoratedCoffee = decoratedCoffee;
    }

    /**
     * Implementa la operación 'getDescription' del componente 'Coffee'.
     */
    public String getDescription() {
        return decoratedCoffee.getDescription();
    }

    /**
     * Implementa la operación 'cost' del componente 'Coffee'.
     */
    public double cost() {
        return decoratedCoffee.cost();
    }
}
