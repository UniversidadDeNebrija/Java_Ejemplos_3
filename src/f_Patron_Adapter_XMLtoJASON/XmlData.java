package f_Patron_Adapter_XMLtoJASON;

class XmlData {
    private String xmlData;

    /**
     * Constructor que inicializa los datos XML.
     * @param xmlData String que representa datos en formato XML.
     */
    public XmlData(String xmlData) {
        this.xmlData = xmlData;
    }

    /**
     * Obtiene los datos XML.
     * @return String que representa datos en formato XML.
     */
    public String getXmlData() {
        return xmlData;
    }
}

