package e_Bebidas_FactoryMethod;

/**
 * Fábrica concreta TeaFactory que extiende BeverageFactory.
 * Se encarga de crear instancias de Tea.
 */
class TeaFactory extends BeverageFactory {
    @Override
    Beverage createBeverage() {
        // Creando una nueva instancia de Tea.
        return new Tea();
    }
}
