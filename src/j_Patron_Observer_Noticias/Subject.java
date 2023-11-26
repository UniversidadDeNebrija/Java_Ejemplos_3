package j_Patron_Observer_Noticias;

/**
 * Interfaz Subject que define las operaciones para añadir, eliminar y notificar observadores.
 */
interface Subject {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
