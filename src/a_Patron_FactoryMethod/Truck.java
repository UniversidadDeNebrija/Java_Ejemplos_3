package a_Patron_FactoryMethod;

/**
 * Clase concreta Truck que implementa Transport.
 */
class Truck implements Transport {

    @Override
    public void deliver() {
        System.out.println("Entrega por camión");
    }
}
