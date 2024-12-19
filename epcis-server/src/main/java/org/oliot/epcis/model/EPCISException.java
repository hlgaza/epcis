//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.12.19 at 02:07:29 PM KST 
//


package org.oliot.epcis.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EPCISException complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EPCISException">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reason" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EPCISException", propOrder = {
    "reason"
})
@XmlSeeAlso({
    ValidationException.class,
    InvalidURIException.class,
    NoSuchSubscriptionException.class,
    SubscribeNotPermittedException.class,
    DuplicateSubscriptionException.class,
    SubscriptionControlsException.class,
    QueryTooLargeException.class,
    ImplementationException.class,
    SecurityException.class,
    NoSuchNameException.class,
    QueryTooComplexException.class,
    QueryParameterException.class,
    DuplicateNameException.class
})
public class EPCISException extends Throwable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 8408539993661081501L;
	@XmlElement(required = true)
    protected String reason;

    public EPCISException() {
        this.setStackTrace(new StackTraceElement[0]);
    }

    public EPCISException(String reason) {
        this.setStackTrace(new StackTraceElement[0]);
        this.setReason(reason);
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

}
