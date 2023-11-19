package d_Multimedia_AbstractFactory;

/**
 * Fábrica concreta AdvancedMediaFactory que crea reproductores multimedia avanzados.
 */
class AdvancedMediaFactory implements MediaFactory {

    @Override
    public MediaPlayer createAudioPlayer() {
        return new AudioPlayer("Avanzado");
    }

    @Override
    public MediaPlayer createVideoPlayer() {
        return new VideoPlayer("Avanzado");
    }
}
