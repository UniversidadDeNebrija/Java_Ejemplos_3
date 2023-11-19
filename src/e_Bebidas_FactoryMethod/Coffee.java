package e_Bebidas_FactoryMethod;

/**
 * Clase concreta Coffee que implementa Beverage.
 * Representa una bebida específica (café) y su manera de ser preparada y servida.
 */
class Coffee implements Beverage {
    @Override
    public void prepare() {
        System.out.println("Preparando café");
    }

    @Override
    public void serve() {
        System.out.println("Sirviendo café");
    }
}
