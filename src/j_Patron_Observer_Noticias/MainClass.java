package j_Patron_Observer_Noticias;
/*
 * Ejemplo sencillo del patrón Observer en Java
 * El patrón Observer se utiliza para crear un sistema de suscripción donde los objetos 
 * pueden escuchar y ser notificados de los cambios en otro objeto, conocido como sujeto.
 * En este programa, simularemos un sistema de notificaciones donde los suscriptores 
 * reciben actualizaciones sobre un tema de interés, como un canal de noticias.
 * 
 * Explicación de la Implementación:
 * 
 * - Interfaz Observer: Define el contrato para los observadores con el método update, que 
 *   se llama cuando el sujeto (en este caso, el canal de noticias) tiene una actualización.
 * - Interfaz Subject: Define los métodos para agregar, eliminar y notificar a los observadores.
 * - Clase Concreta NewsChannel (Sujeto): Mantiene una lista de sus observadores y notifica a 
 *   estos observadores cuando hay una actualización de noticias.
 *   El método publishNews es responsable de establecer las noticias y notificar a los observadores.
 * - Clase Concreta Subscriber (Observador): Implementa la interfaz Observer.
 *   Cada suscriptor recibe y procesa la actualización de noticias.
 * - Clase Principal ObserverPatternDemo: Demuestra la creación de un sujeto (NewsChannel) y dos 
 *   observadores (Subscriber).
 *   Los observadores se registran en el canal de noticias, que posteriormente publica una noticia 
 *   y notifica a todos los observadores registrados.
 */

/**
 * Clase principal para demostrar el uso del patrón Observer.
 */
public class MainClass {
    public static void main(String[] args) {
        // Crear el Subject (canal de noticias)
        NewsChannel channel = new NewsChannel();

        // Crear Observadores (suscriptores)
        Observer subscriber1 = new Subscriber("Suscriptor 1");
        Observer subscriber2 = new Subscriber("Suscriptor 2");

        // Añadir observadores al canal de noticias
        channel.addObserver(subscriber1);
        channel.addObserver(subscriber2);

        // Publicar noticias. Los observadores serán notificados
        channel.publishNews("Noticias importantes del día");
    }
}
