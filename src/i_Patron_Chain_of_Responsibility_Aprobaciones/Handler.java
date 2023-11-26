package i_Patron_Chain_of_Responsibility_Aprobaciones;

/**
 * Interfaz Handler en el patrón Chain of Responsibility.
 * Define un método para manejar una solicitud y establecer el siguiente manejador.
 */
interface Handler {
    void setNextHandler(Handler nextHandler);
    void handleRequest(int amount);
}
