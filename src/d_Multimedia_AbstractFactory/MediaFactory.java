package d_Multimedia_AbstractFactory;

/**
 * Interfaz abstracta MediaFactory que define los métodos para crear reproductores de audio y video.
 */
public interface MediaFactory {
    MediaPlayer createAudioPlayer();
    MediaPlayer createVideoPlayer();
}
