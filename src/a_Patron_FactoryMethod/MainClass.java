package a_Patron_FactoryMethod;
/* Exemplo de implementación de Patrón Factory Method basado en Refactoring Guru
 * https://refactoring.guru/es/design-patterns/factory-method 
 * 
 * En este ejemplo, Transport es la interfaz que define la funcionalidad común 
 * de los productos (en este caso, los medios de transporte como "Truck" y "Ship"). 
 * Logistics es la clase abstracta que define el método factory, y RoadLogistics y 
 * SeaLogistics son las clases concretas que implementan este método para crear 
 * instancias específicas de Transport.
 */

/**
 * Clase MainClass para probar el patrón Factory Method.
 */
public class MainClass {
    public static void main(String[] args) {
        Logistics logistics = new RoadLogistics();
        logistics.planDelivery();

        logistics = new SeaLogistics();
        logistics.planDelivery();
    }
}
