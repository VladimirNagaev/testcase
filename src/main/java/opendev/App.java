package opendev;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws ParserConfigurationException {

        File file = new File("src/resourses/cars.xml");
        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
        Document document = null;
        try {
            document = builderFactory.newDocumentBuilder().parse(file);
        } catch (SAXException e) {
            System.out.println("Something is not ok");
            e.printStackTrace();
            return;
        } catch (IOException e) {
            System.out.println("you inserted wrong address of file, burn in hell :-) \n");
            e.printStackTrace();
            return;
        }

        String rootNode = document.getFirstChild().getNodeName();

        System.out.println("Hello World!");
        System.out.println("\n" + rootNode);
    }
}
