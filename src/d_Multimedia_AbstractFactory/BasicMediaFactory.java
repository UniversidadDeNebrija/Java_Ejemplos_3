package d_Multimedia_AbstractFactory;

/**
 * Fábrica concreta BasicMediaFactory que crea reproductores multimedia básicos.
 */
class BasicMediaFactory implements MediaFactory {

    @Override
    public MediaPlayer createAudioPlayer() {
        return new AudioPlayer("Básico");
    }

    @Override
    public MediaPlayer createVideoPlayer() {
        return new VideoPlayer("Básico");
    }
}
