package d_Multimedia_AbstractFactory;

/**
 * Clase AdvancedVideoPlayer que implementa VideoPlayer.
 * Representa una versión avanzada del reproductor de video, con alta definición.
 */
class AdvancedVideoPlayer implements VideoPlayer {
    public void playVideo() {
        System.out.println("Reproduciendo video en modo avanzado con alta definición.");
    }
}
