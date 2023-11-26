package g_Patron_Decorator_Coffee;

/**
 * Implementación concreta de un objeto 'Coffee' básico.
 */
class SimpleCoffee implements Coffee {
    
    /**
     * Devuelve una descripción del café simple.
     */
    @Override
    public String getDescription() {
        return "Simple Coffee";
    }

    /**
     * Devuelve el costo del café simple.
     */
    @Override
    public double cost() {
        return 1.0;
    }
}
