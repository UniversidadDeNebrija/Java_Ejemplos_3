package e_Bebidas_FactoryMethod;

/**
 * Interfaz Beverage que define las operaciones comunes en bebidas.
 * Esta interfaz será implementada por diferentes tipos de bebidas.
 */
public interface Beverage {
    void prepare();
    void serve();
}
