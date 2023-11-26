package i_Patron_Chain_of_Responsibility_Aprobaciones;

/**
 * Manejador concreto para gastos medianos, manejado por un Gerente.
 */
class Manager extends AbstractHandler {
    @Override
    public void handleRequest(int amount) {
        if (amount <= 500) {
            System.out.println("Gerente aprobó el gasto de $" + amount);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(amount);
        }
    }
}
