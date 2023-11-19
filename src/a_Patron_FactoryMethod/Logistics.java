package a_Patron_FactoryMethod;

/**
 * Clase abstracta Logistics que define el método factory.
 */
abstract class Logistics {

    /**
     * Método factory para crear instancias de Transport.
     */
    public abstract Transport createTransport();

    public void planDelivery() {
        Transport transport = createTransport();
        transport.deliver();
    }
}
