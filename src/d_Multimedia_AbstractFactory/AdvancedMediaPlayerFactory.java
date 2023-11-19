package d_Multimedia_AbstractFactory;

/**
 * Clase AdvancedMediaPlayerFactory que implementa MediaPlayerFactory.
 * Se encarga de crear las versiones avanzadas de reproductores de audio y video.
 */
class AdvancedMediaPlayerFactory implements MediaPlayerFactory {
    public AudioPlayer createAudioPlayer() {
        return new AdvancedAudioPlayer();
    }

    public VideoPlayer createVideoPlayer() {
        return new AdvancedVideoPlayer();
    }
}
