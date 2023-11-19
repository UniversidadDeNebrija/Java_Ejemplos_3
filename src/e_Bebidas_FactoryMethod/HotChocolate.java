package e_Bebidas_FactoryMethod;

/**
 * Clase concreta HotChocolate que implementa Beverage.
 * Representa el chocolate caliente como una bebida con su preparación y servicio.
 */
class HotChocolate implements Beverage {
    @Override
    public void prepare() {
        System.out.println("Preparando chocolate caliente");
    }

    @Override
    public void serve() {
        System.out.println("Sirviendo chocolate caliente");
    }
}
