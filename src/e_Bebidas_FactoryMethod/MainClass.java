package e_Bebidas_FactoryMethod;
/* Programa que responde al siguiente ejercicio planteado en clase:
 * Fábrica de Bebidas.
 * Objetivo: Desarrollar un programa que utilice el patrón Factory Method 
 * para crear diferentes tipos de bebidas. Las bebidas pueden ser de diferentes 
 * tipos, como café, té o chocolate caliente, y cada tipo de bebida se preparará 
 * de manera diferente.
 * 
 * Requisitos:
 * 1. Crear una interfaz Beverage que defina los métodos prepare() y serve().
 * 2. Implementar diferentes tipos de bebidas como clases concretas (Coffee, Tea,  
 *    HotChocolate), cada una implementando la interfaz Beverage.
 * 3. Desarrollar una clase abstracta BeverageFactory con un método factory 
 *    createBeverage(). 
 * 4. Implementar fábricas concretas para cada tipo de bebida (CoffeeFactory, TeaFactory,  
 *    HotChocolateFactory).
 * 5. Escribir una clase de prueba que demuestre el uso de las fábricas para crear 
 *    diferentes tipos de bebidas
 */

/**
 * Clase principal para probar el patrón Factory Method.
 * Esta clase demuestra la creación de diferentes bebidas utilizando diferentes fábricas.
 */
public class MainClass {
    public static void main(String[] args) {
        // Creando una fábrica de café y utilizando para crear y usar un café.
        BeverageFactory beverageFactory = new CoffeeFactory();
        Beverage myBeverage = beverageFactory.createBeverage();
        myBeverage.prepare();
        myBeverage.serve();

        // Creando una fábrica de té y utilizando para crear y usar un té.
        beverageFactory = new TeaFactory();
        myBeverage = beverageFactory.createBeverage();
        myBeverage.prepare();
        myBeverage.serve();

        // Creando una fábrica de chocolate caliente y utilizando para crear y usar un chocolate caliente.
        beverageFactory = new HotChocolateFactory();
        myBeverage = beverageFactory.createBeverage();
        myBeverage.prepare();
        myBeverage.serve();
    }
}
