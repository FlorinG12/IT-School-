package session_17_equals_hashcode_generics.challenge.xml_to_json_challenge;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;

public class XmlToJsonConvertor {
    public static void main(String[] args) {
        String inputFilePath = "src/main/java/session_17_equals_hashcode_generics/challenge/xml_to_json_challenge/library.xml";
        File inputFile = new File(inputFilePath);

        if (!inputFile.exists()) {
            System.out.println("File not found: " + inputFilePath);
            return;
        }

        String jsonString = convertXmlToJson(inputFile);
        if (jsonString != null) {
            System.out.println(jsonString);
        } else {
            System.out.println("Conversion failed");
        }
    }

    public static String convertXmlToJson(File input) {
        String converter = null;
        try {
            // Create XmlMapper and ObjectMapper instances
            XmlMapper xmlMapper = new XmlMapper();
            ObjectMapper jsonMapper = new ObjectMapper();

            // Read the XML file into a JsonNode
            JsonNode rootNode = xmlMapper.readTree(input);

            // Extract the array node to match the desired output format
            JsonNode booksNode = rootNode.get("book");

            // Convert the JsonNode to JSON string
            converter = jsonMapper.writerWithDefaultPrettyPrinter().writeValueAsString(booksNode);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return converter;
    }
}