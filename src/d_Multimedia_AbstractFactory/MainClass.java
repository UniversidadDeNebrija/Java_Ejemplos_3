package d_Multimedia_AbstractFactory;
/* Programa que responde al siguiente ejercicio planteado en clase:
 * Fábrica de Reproductores Multimedia.
 * Objetivo: Desarrollar un programa que utilice el patrón Abstract 
 * Factory para crear diferentes tipos de reproductores multimedia. 
 * Los reproductores pueden ser de audio o de video, y cada tipo 
 * tendrá dos variantes: Básico y Avanzado.
 */


/**
 * Clase principal MainClass para probar el patrón Abstract Factory.
 * Esta clase demuestra cómo se pueden crear diferentes tipos de reproductores multimedia utilizando distintas fábricas.
 */
public class MainClass {
    public static void main(String[] args) {
        // Uso de la fábrica básica para crear reproductores de audio y video básicos
        MediaPlayerFactory factory = new BasicMediaPlayerFactory();
        AudioPlayer basicAudio = factory.createAudioPlayer();
        VideoPlayer basicVideo = factory.createVideoPlayer();

        basicAudio.playAudio();
        basicVideo.playVideo();

        // Uso de la fábrica avanzada para crear reproductores de audio y video avanzados
        factory = new AdvancedMediaPlayerFactory();
        AudioPlayer advancedAudio = factory.createAudioPlayer();
        VideoPlayer advancedVideo = factory.createVideoPlayer();

        advancedAudio.playAudio();
        advancedVideo.playVideo();
    }
}
