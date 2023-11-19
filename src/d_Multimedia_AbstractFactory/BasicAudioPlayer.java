package d_Multimedia_AbstractFactory;

/**
 * Clase BasicAudioPlayer que implementa AudioPlayer.
 * Representa una versión básica del reproductor de audio.
 */
class BasicAudioPlayer implements AudioPlayer {
    public void playAudio() {
        System.out.println("Reproduciendo audio en modo básico.");
    }
}
