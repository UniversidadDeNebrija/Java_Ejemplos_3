package f_Patron_Adapter_XMLtoJASON;

class XmlToJsonAdapter implements JsonProcessor {
    private XmlData xmlData;

    /**
     * Constructor del adaptador que toma XmlData como entrada.
     * @param xmlData Datos XML que necesitan ser convertidos a JSON.
     */
    public XmlToJsonAdapter(XmlData xmlData) {
        this.xmlData = xmlData;
    }

    /**
     * Método que adapta el procesamiento de XML a JSON.
     * Implementa el método de procesamiento definido en JsonProcessor.
     * @param jsonData String que representa datos en formato JSON.
     */
    @Override
    public void processJson(String jsonData) {
        // Aquí se convertiría XML a JSON (se necesita una implementación real para la conversión)
        String convertedJson = convertXmlToJson(xmlData.getXmlData());
        // Procesar el JSON convertido
        System.out.println("Procesando JSON: " + convertedJson);
    }

    /**
     * Método simulado para la conversión de XML a JSON
     * En una implementación real, este método contendría la lógica de conversión.
     * @param xml String que representa datos en formato XML.
     * @return String que representa datos convertidos en formato JSON.
     */
    private String convertXmlToJson(String xmlData) {
       // Implementación de la conversión (simulada)
       return "{\"jsonEquivalent\": \"" + xmlData + "\"}";
    }
}
