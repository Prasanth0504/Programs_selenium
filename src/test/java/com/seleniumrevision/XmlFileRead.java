package com.seleniumrevision;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XmlFileRead {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {

	DocumentBuilderFactory fact = DocumentBuilderFactory.newInstance();	
		DocumentBuilder builder = fact.newDocumentBuilder();
		Document doc = builder.parse("src\\test\\resources\\XML\\Books.xml");
		Element root = doc.getDocumentElement();
		NodeList child = root.getChildNodes();
		
		for (int i = 0; i <child.getLength(); i++) {
			
			Node node = child.item(i);
			
		if (node.getNodeType()==node.ELEMENT_NODE) {
			Element element= (Element) node;
			String tagName = element.getTagName();
			
			String textContent = element.getTextContent();
			System.out.println("Tag Name: "+tagName);
			System.out.println("Text Content: "+textContent);
		}
		}
		
		
		
		
		
		
	}

}
