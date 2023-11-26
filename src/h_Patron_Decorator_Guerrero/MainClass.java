package h_Patron_Decorator_Guerrero;

/*
 * Ejercicio que sigue el enunciado: 
 * 
 * Implementar el patrón de diseño Decorator para simular la equipación 
 * de un personaje de juego con varios ítems de inventario. El personaje comenzará con una equipación básica, 
 * y podrás añadirle dinámicamente ítems como una espada, una armadura y un escudo.
 * 
 * Explicación de la Implementación:
 * 
 * - Componente (Character): La interfaz Character define la operación equip, que todos los personajes pueden realizar.
 * - Componente Concreto (BasicCharacter): La clase BasicCharacter es un personaje simple que implementa Character. 
 *   Por defecto, está equipado con ropa básica.
 * - Decorador Abstracto (CharacterDecorator): La clase abstracta CharacterDecorator extiende la funcionalidad de 
 *   Character manteniendo una referencia a un Character. Implementa la operación equip y puede añadir funcionalidades adicionales.
 * - Decoradores Concretos (SwordDecorator, ArmorDecorator, ShieldDecorator): Estos decoradores añaden equipamientos 
 *   específicos al personaje. Cada decorador invoca primero el método equip del decorador/decorado subyacente y luego 
 *   añade su propio equipamiento.
 * - Cliente (MainClass): 
 *   La clase MainClass demuestra el proceso de decorar un BasicCharacter. Decoramos al personaje con una espada, luego 
 *   con una armadura y finalmente con un escudo, mostrando cómo cada decorador añade su funcionalidad específica.
 */

/**
 * Clase de demostración para mostrar el patrón Decorator en acción.
 */
public class MainClass {
    public static void main(String[] args) {
        // Crear un personaje básico.
        Character basicCharacter = new BasicCharacter("Conan");

        // Añadirle una espada.
        Character swordCharacter = new SwordDecorator(basicCharacter);

        // Añadirle una armadura.
        Character armoredCharacter = new ArmorDecorator(swordCharacter);

        // Añadirle un escudo.
        Character shieldedCharacter = new ShieldDecorator(armoredCharacter);

        // Equipar al personaje con todas las decoraciones.
        shieldedCharacter.equip();
    }
}
