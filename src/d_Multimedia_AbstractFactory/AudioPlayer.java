package d_Multimedia_AbstractFactory;

/**
 * Clase concreta AudioPlayer que implementa MediaPlayer.
 */
class AudioPlayer implements MediaPlayer {
    private String type;

    public AudioPlayer(String type) {
        this.type = type;
    }

    @Override
    public void play() {
        System.out.println("Reproduciendo audio " + type + ".");
    }

    @Override
    public void pause() {
        System.out.println("Audio " + type + " pausado.");
    }
}
