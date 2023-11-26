package j_Patron_Observer_Noticias;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase concreta del Subject que mantiene una lista de sus observadores.
 */
class NewsChannel implements Subject {
    private final List<Observer> observers;
    private String news;

    public NewsChannel() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(news);
        }
    }

    public void publishNews(String news) {
        this.news = news;
        notifyObservers();
    }
}
