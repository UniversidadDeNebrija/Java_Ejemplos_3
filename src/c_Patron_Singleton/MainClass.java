package c_Patron_Singleton;
/*
 * Ejemplo de patrón Singleton.
 * 
 * El patrón Singleton es un patrón de diseño que garantiza que una 
 * clase tenga una única instancia y proporciona un punto de acceso 
 * global a ella. Este patrón es útil cuando necesitas asegurarte de 
 * que solo exista una instancia de una clase a lo largo de toda la 
 * aplicación, como en el caso de un controlador de configuración o 
 * una conexión a una base de datos.
 */

/**
 * Clase MainClass para probar el patrón Singleton.
 */
public class MainClass {
    public static void main(String[] args) {
        Singleton miSingleton = Singleton.obtenerInstancia();
        miSingleton.hacerAlgo();
    }
}
