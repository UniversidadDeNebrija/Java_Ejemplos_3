package f_Patron_Adapter_XMLtoJASON;

// Clase cliente que utiliza JsonProcessor
class Client {
    private JsonProcessor jsonProcessor;

    public Client(JsonProcessor jsonProcessor) {
        this.jsonProcessor = jsonProcessor;
    }

    public void process(String jsonData) {
        jsonProcessor.processJson(jsonData);
    }
}
