package g_Patron_Decorator_Coffee;
/*
 * El escenario que vamos a utilizar es el de una cafetería que ofrece diferentes combinaciones 
 * de café con varios ingredientes (decoradores), como leche, azúcar, etc.
 * El patrón Decorator se utiliza en este ejemplo para añadir responsabilidades adicionales 
 * a los objetos de manera dinámica. El programa simula una cafetería que puede servir café 
 * en diferentes variantes, con la posibilidad de añadir ingredientes adicionales.
 * 
 * Componentes del patrón:
 * - Componente Concreto (SimpleCoffee): Es la implementación básica de la interfaz Coffee. 
 *   Define el objeto a decorar. En nuestro caso, es un café simple con una descripción y un costo base.
 * - Decorador Base (CoffeeDecorator): Es una clase abstracta que implementa la interfaz Coffee y 
 *   contiene una referencia a un objeto Coffee. Sirve como la clase base para todos los decoradores concretos.
 * - Decoradores Concretos (WithMilk, WithSugar): Son las implementaciones que extienden el decorador base. 
 *   Estos decoradores añaden funcionalidades (como añadir leche o azúcar) al objeto Coffee que envuelven, 
 *   modificando su descripción y costo.
 * - Cliente (DecoratorPatternDemo): Es la clase que demuestra el uso del patrón Decorator. Crea un 
 *   SimpleCoffee y luego lo decora con WithMilk y WithSugar, mostrando cómo se pueden añadir dinámicamente 
 *   características adicionales a los objetos.
 * 
 * Cómo funciona:
 * - Se crea un SimpleCoffee, que es nuestro componente concreto con su propio costo y descripción.
 * - Luego, se "envuelve" este SimpleCoffee en un WithMilk, que es un decorador. Esto añade la descripción 
 *   de la leche y su costo al café.
 * - A continuación, se envuelve el WithMilk (que ya contiene un SimpleCoffee) en un WithSugar, agregando 
 *   otra capa de decoración. Esto añade la descripción del azúcar y su costo adicional.
 * - El cliente (en el método main) solo interactúa con la interfaz Coffee, pero gracias a los decoradores, 
 *   se pueden combinar múltiples comportamientos.
 */


/**
 * Clase de demostración para mostrar el patrón Decorator en acción.
 */
public class MainClass {

    /**
     * Punto de entrada principal del programa.
     */
    public static void main(String[] args) {
        // Preparar un simple café
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() + " Cost: $" + coffee.cost());

        // Decorar el café con leche
        Coffee milkCoffee = new WithMilk(coffee);
        System.out.println(milkCoffee.getDescription() + " Cost: $" + milkCoffee.cost());

        // Decorar el café con leche y azúcar
        Coffee milkSugarCoffee = new WithSugar(milkCoffee);
        System.out.println(milkSugarCoffee.getDescription() + " Cost: $" + milkSugarCoffee.cost());
    }
}
