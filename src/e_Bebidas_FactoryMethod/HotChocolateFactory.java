package e_Bebidas_FactoryMethod;

/**
 * Fábrica concreta HotChocolateFactory que extiende BeverageFactory.
 * Se encarga de crear instancias de HotChocolate.
 */
class HotChocolateFactory extends BeverageFactory {
    @Override
    Beverage createBeverage() {
        // Creando una nueva instancia de HotChocolate.
        return new HotChocolate();
    }
}
