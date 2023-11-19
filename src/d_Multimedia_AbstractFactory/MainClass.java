package d_Multimedia_AbstractFactory;
/* Programa que responde al siguiente ejercicio planteado en clase:
 * Fábrica de Reproductores Multimedia.
 * Objetivo: Desarrollar un programa que utilice el patrón Abstract 
 * Factory para crear diferentes tipos de reproductores multimedia. 
 * Los reproductores pueden ser de audio o de video, y cada tipo 
 * tendrá dos variantes: Básico y Avanzado.
 * 
 * Requisitos:
 * 1. Crear una interfaz MediaPlayer que defina los métodos play() y pause().
 * 2. Implementar dos tipos de reproductores: AudioPlayer y VideoPlayer, 
 *    cada uno con dos variantes: Básico y Avanzado.
 * 3. Desarrollar una interfaz abstracta MediaFactory con métodos para crear 
 *    reproductores de audio y video. 
 * 4. Implementar dos fábricas concretas: BasicMediaFactory y AdvancedMediaFactory, 
 *    que creen las variantes Básica y Avanzada de los reproductores de audio y 
 *    video, respectivamente.
 * 5. Escribir una clase de prueba que demuestre el uso de las fábricas para 
 *    crear diferentes tipos de reproductores.
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
