package f_Patron_Adapter_XMLtoJASON;



/**
 * Demostración del uso del patrón Adapter.
 */
public class MainClass {
    public static void main(String[] args) {
        // Creamos una instancia de XmlData con datos XML de ejemplo.
        XmlData xmlData = new XmlData("<data>Hello XML</data>");

        // Creamos un adaptador que convertirá XML a JSON.
        XmlToJsonAdapter adapter = new XmlToJsonAdapter(xmlData);

        // Utilizamos el adaptador para procesar los datos JSON convertidos.
        Client client = new Client(adapter);
        client.process(xmlData.getXmlData()); // Aquí se pasaría el XML, y el adaptador lo convierte a JSON
    }
}
