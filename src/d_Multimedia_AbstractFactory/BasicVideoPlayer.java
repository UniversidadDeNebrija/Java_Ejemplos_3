package d_Multimedia_AbstractFactory;

/**
 * Clase BasicVideoPlayer que implementa VideoPlayer.
 * Representa una versión básica del reproductor de video.
 */
class BasicVideoPlayer implements VideoPlayer {
    public void playVideo() {
        System.out.println("Reproduciendo video en modo básico.");
    }
}
