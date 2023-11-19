package d_Multimedia_AbstractFactory;

/**
 * Interfaz abstracta MediaPlayerFactory que define los métodos para crear componentes del reproductor multimedia.
 * Las implementaciones concretas de esta interfaz crearán diferentes variantes de reproductores de audio y video.
 */
public interface MediaPlayerFactory {
    AudioPlayer createAudioPlayer();
    VideoPlayer createVideoPlayer();
}
