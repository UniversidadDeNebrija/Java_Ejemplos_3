package e_Bebidas_FactoryMethod;

abstract class BeverageFactory {
    /**
     * Método abstracto para crear una bebida.
     * Las subclases concretas de BeverageFactory implementarán este método para crear instancias específicas de Beverage.
     * @return una instancia de Beverage.
     */
    abstract Beverage createBeverage();
}
