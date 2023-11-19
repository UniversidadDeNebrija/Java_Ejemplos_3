package e_Bebidas_FactoryMethod;

/**
 * Fábrica concreta CoffeeFactory que extiende BeverageFactory.
 * Se encarga de crear instancias de Coffee.
 */
class CoffeeFactory extends BeverageFactory {
    @Override
    Beverage createBeverage() {
        // Creando una nueva instancia de Coffee.
        return new Coffee();
    }
}
