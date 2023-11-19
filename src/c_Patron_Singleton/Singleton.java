package c_Patron_Singleton;

/**
 * Clase Singleton.
 *  En este código:
 * - El constructor de la clase Singleton es privado para evitar que 
 *   se pueda instanciar desde fuera de la clase.
 * - La única instancia de Singleton se mantiene en una variable privada estática.
 * - El método obtenerInstancia() es el punto de acceso público a la instancia. 
 *   Si la instancia aún no se ha creado (instancia == null), se crea una nueva 
 *   instancia. Este método es synchronized para asegurar que sea seguro en un 
 *   entorno multihilo, evitando la creación de múltiples instancias en caso de 
 *   que varios hilos intenten acceder al método al mismo tiempo.
 */
public class Singleton {

    // La única instancia de Singleton que será creada.
    private static Singleton instancia;

    /**
     * Constructor privado para evitar la instanciación externa.
     */
    private Singleton() {
        // Inicialización de la instancia, si es necesario.
    }

    /**
     * Método para obtener la única instancia de la clase.
     * @return la única instancia de Singleton.
     */
    public static synchronized Singleton obtenerInstancia() {
        if (instancia == null) {
            instancia = new Singleton();
        }
        return instancia;
    }

    /**
     * Método de ejemplo para demostrar funcionalidad.
     */
    public void hacerAlgo() {
        System.out.println("Haciendo algo...");
    }
}
