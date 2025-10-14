import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.File;
public class DomParser {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(new File("book.xml"));
            document.getDocumentElement().normalize();
            NodeList bookList = document.getElementsByTagName("book");
            for (int i = 0; i < bookList.getLength(); i++) {
                Node bookNode = bookList.item(i);
                if (bookNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element bookElement = (Element) bookNode;
                    String title = bookElement.getElementsByTagName("title").item(0).getTextContent();
                    String author = bookElement.getElementsByTagName("author").item(0).getTextContent();
                    System.out.println("Title: " + title);
                    System.out.println("Author: " + author); 
                    System.out.println("-----------------------");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
