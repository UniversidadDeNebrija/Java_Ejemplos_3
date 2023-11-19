package d_Multimedia_AbstractFactory;

/**
 * Clase BasicMediaPlayerFactory que implementa MediaPlayerFactory.
 * Se encarga de crear las versiones básicas de reproductores de audio y video.
 */
class BasicMediaPlayerFactory implements MediaPlayerFactory {
    public AudioPlayer createAudioPlayer() {
        return new BasicAudioPlayer();
    }

    public VideoPlayer createVideoPlayer() {
        return new BasicVideoPlayer();
    }
}
