package d_Multimedia_AbstractFactory;

/**
 * Clase concreta VideoPlayer que implementa MediaPlayer.
 */
class VideoPlayer implements MediaPlayer {
    private String type;

    public VideoPlayer(String type) {
        this.type = type;
    }

    @Override
    public void play() {
        System.out.println("Reproduciendo video " + type + ".");
    }

    @Override
    public void pause() {
        System.out.println("Video " + type + " pausado.");
    }
}
