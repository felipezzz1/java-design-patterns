package main.java.com.fezor.structural.adapter.convertXMLtoJSONExample.adapters;

import main.java.com.fezor.structural.adapter.convertXMLtoJSONExample.json.JSONData;
import main.java.com.fezor.structural.adapter.convertXMLtoJSONExample.xml.XMLData;

public class XLMToJSONAdapter implements JSONData {
    private XMLData xmlAdapter;

    public XLMToJSONAdapter(XMLData xmlAdapter){
        this.xmlAdapter = xmlAdapter;
    }

    @Override
    public String getFormattedJSONData() {
        String xml = this.xmlAdapter.getXmlContent();

        String json = convertXMLToJSON(xml);

        System.out.println("Adapter: XML data successfully translated to JSON.");

        return json;
    }

    private String convertXMLToJSON(String xml){
        // just for educational purposes
        return xml.replace("<data>", "{\"data\": ").replace("</data>", "}").replace("<item>", "\"item\": \"").replace("</item>", "\"");
    }
}
