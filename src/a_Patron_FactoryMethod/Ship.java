package a_Patron_FactoryMethod;

/**
 * Clase concreta Ship que implementa Transport.
 */
class Ship implements Transport {

    @Override
    public void deliver() {
        System.out.println("Entrega por barco");
    }
}
