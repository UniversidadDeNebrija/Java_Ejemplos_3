package i_Patron_Chain_of_Responsibility_Aprobaciones;

/**
 * Manejador concreto para grandes gastos, manejado por un Director.
 */
class Director extends AbstractHandler {
    @Override
    public void handleRequest(int amount) {
        if (amount <= 1000) {
            System.out.println("Director aprobó el gasto de $" + amount);
        } else {
            System.out.println("Gasto de $" + amount + " necesita aprobación adicional");
        }
    }
}
