import org.xml.sax.*;
import org.xml.sax.helpers.*;
import javax.xml.parsers.*;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
import java.io.File;
public class SAXparser {
    public static void main(String[] args) {
        try{
            SAXParserFactory factory=SAXParserFactory.newInstance();
            SAXParser saxParser=factory.newSAXParser();
            DefaultHandler handler=new DefaultHandler(){
                boolean bTitle=false;
                boolean bAuthor=false;
                public void startElement(String uri,String localName,String qName,Attributes attributes){
                    if(qName.equalsIgnoreCase("title")){
                        bTitle=true;
                    }
                    else if(qName.equalsIgnoreCase("author")){
                        bAuthor=true;
                    }
                }
                public void characters(char ch[],int start,int length){
                    if(bTitle){
                        System.out.println("Title: "+new String(ch,start,length));
                        bTitle=false;
                    }

                    else if(bAuthor){
                        System.out.println("Author: "+new String(ch,start,length));
                        bAuthor=false;
                        System.out.println("-----------------------");
                    }
                }
            };
            saxParser.parse(new File("book.xml"), handler);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
