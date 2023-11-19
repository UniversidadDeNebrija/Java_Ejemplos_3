package a_Patron_FactoryMethod;

/**
 * Clase concreta RoadLogistics que crea instancias de Truck.
 */
class RoadLogistics extends Logistics {

    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
