//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.08.07 at 05:10:21 PM MSK 
//


package eu.nimble.service.model.ubl.ppaprequest;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the eu.nimble.service.model.ubl.ppaprequest package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _PpapRequest_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:PpapRequest-2", "PpapRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: eu.nimble.service.model.ubl.ppaprequest
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PpapRequestType }
     * 
     */
    public PpapRequestType createPpapRequestType() {
        return new PpapRequestType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PpapRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:PpapRequest-2", name = "PpapRequest")
    public JAXBElement<PpapRequestType> createPpapRequest(PpapRequestType value) {
        return new JAXBElement<PpapRequestType>(_PpapRequest_QNAME, PpapRequestType.class, null, value);
    }

}
