package e_Bebidas_FactoryMethod;

/**
 * Clase concreta Tea que implementa Beverage.
 * Representa otra bebida específica (té) con su propia preparación y servicio.
 */
class Tea implements Beverage {
    @Override
    public void prepare() {
        System.out.println("Preparando té");
    }

    @Override
    public void serve() {
        System.out.println("Sirviendo té");
    }
}
