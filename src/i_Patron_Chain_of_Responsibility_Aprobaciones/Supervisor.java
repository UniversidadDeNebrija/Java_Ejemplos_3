package i_Patron_Chain_of_Responsibility_Aprobaciones;

/**
 * Manejador concreto para gastos pequeños, manejado por un Supervisor.
 */
class Supervisor extends AbstractHandler {
    @Override
    public void handleRequest(int amount) {
        if (amount <= 100) {
            System.out.println("Supervisor aprobó el gasto de $" + amount);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(amount);
        }
    }
}
