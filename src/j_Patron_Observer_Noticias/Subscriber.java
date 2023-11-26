package j_Patron_Observer_Noticias;

/**
 * Clase concreta del Observer que representa un suscriptor de noticias.
 */
class Subscriber implements Observer {
    private final String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String news) {
        System.out.println(name + " recibió la noticia: " + news);
    }
}
