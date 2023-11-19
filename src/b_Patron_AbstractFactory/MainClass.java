package b_Patron_AbstractFactory;
/* Exemplo de implementación de Patrón Abstract Factory basado en Refactoring Guru
 * https://refactoring.guru/es/design-patterns/abstract-factory
 * 
 * En este escenario, imaginemos que tenemos diferentes tipos de muebles como sillas, 
 * sofás y mesas de café, y que estos pueden venir en diferentes estilos como Moderno 
 * y Victoriano. La fábrica abstracta FurnitureFactory definirá los métodos para crear 
 * estos diferentes tipos de muebles.
 * En este ejemplo, las interfaces Chair, Sofa y CoffeeTable definen los métodos que 
 * deben implementar todos los tipos de sillas, sofás y mesas de café. Las clases 
 * ModernFurnitureFactory y VictorianFurnitureFactory son implementaciones concretas 
 * de la fábrica abstracta FurnitureFactory, cada una produciendo un estilo diferente 
 * de muebles. Este patrón permite cambiar fácilmente entre diferentes familias de 
 * productos (en este caso, estilos de muebles) sin alterar el código cliente.
 */

/**
 * Clase principal para probar las fábricas de muebles.
 */
public class MainClass {
    public static void main(String[] args) {
        FurnitureFactory factory = new ModernFurnitureFactory();

        Chair chair = factory.createChair();
        Sofa sofa = factory.createSofa();
        CoffeeTable coffeeTable = factory.createCoffeeTable();

        chair.describe();
        sofa.describe();
        coffeeTable.describe();

        // Cambiar a fábrica victoriana
        factory = new VictorianFurnitureFactory();

        chair = factory.createChair();
        sofa = factory.createSofa();
        coffeeTable = factory.createCoffeeTable();

        chair.describe();
        sofa.describe();
        coffeeTable.describe();
    }
}
