package i_Patron_Chain_of_Responsibility_Aprobaciones;

/**
 * Manejador abstracto que implementa la funcionalidad común para todos los manejadores concretos.
 */
abstract class AbstractHandler implements Handler {
    protected Handler nextHandler;

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public abstract void handleRequest(int amount);
}
