package b_Patron_AbstractFactory;

/**
 * Interfaz principal para la fábrica de muebles.
 * Define métodos para crear distintos tipos de muebles.
 */
public interface FurnitureFactory {
    Chair createChair();
    Sofa createSofa();
    CoffeeTable createCoffeeTable();
}
