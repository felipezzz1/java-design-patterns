package main.java.com.fezor.structural.adapter.convertXMLtoJSONExample;

import main.java.com.fezor.structural.adapter.convertXMLtoJSONExample.adapters.XLMToJSONAdapter;
import main.java.com.fezor.structural.adapter.convertXMLtoJSONExample.json.JSONData;
import main.java.com.fezor.structural.adapter.convertXMLtoJSONExample.xml.XMLData;

public class Main {
    public static void main(String[] args) {
        String xml = "<data><item>report</item></data>";

        XMLData oldData = new XMLData(xml);

        System.out.println("Data available in raw XML" + oldData.getXmlContent());

        System.out.println("------------------------------");

        JSONData adapter = new XLMToJSONAdapter(oldData);

        System.out.println(adapter.getFormattedJSONData());
    }
}
