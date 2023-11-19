package a_Patron_FactoryMethod;

/**
 * Clase concreta SeaLogistics que crea instancias de Ship.
 */
class SeaLogistics extends Logistics {

    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
