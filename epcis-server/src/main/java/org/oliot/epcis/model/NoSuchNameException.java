//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.12.19 at 02:07:29 PM KST 
//


package org.oliot.epcis.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NoSuchNameException complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NoSuchNameException">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:epcglobal:epcis-query:xsd:2}EPCISException">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NoSuchNameException", namespace = "urn:epcglobal:epcis-query:xsd:2")
public class NoSuchNameException
    extends EPCISException
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 5496092789570789203L;

	public NoSuchNameException() {
    }

    public NoSuchNameException(String reason) {
        super(reason);
    }
}
