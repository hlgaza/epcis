//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.01.05 at 11:33:26 AM KST 
//

package org.oliot.epcis.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;

import org.w3c.dom.Element;

/**
 * <p>
 * Java class for EPCISCaptureJobType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="EPCISCaptureJobType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="captureErrorBehaviour" type="{urn:epcglobal:epcis:xsd:2}EPCISCaptureErrorBehaviourType"/>
 *         &lt;element name="createdAt" type="{urn:epcglobal:epcis:xsd:2}DateTimeStamp" minOccurs="0"/>
 *         &lt;element name="finishedAt" type="{urn:epcglobal:epcis:xsd:2}DateTimeStamp" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="errors" type="{urn:epcglobal:epcis:xsd:2}EPCISCaptureDocumentErrorListType"/>
 *           &lt;element name="errorFile" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;/choice>
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="running" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="success" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="captureID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EPCISCaptureJobType", propOrder = { "captureErrorBehaviour", "createdAt", "finishedAt", "errors",
		"errorFile", "any" })
@XmlRootElement
public class EPCISCaptureJobType {

	@XmlElement(required = true)
	@XmlSchemaType(name = "string")
	protected EPCISCaptureErrorBehaviourType captureErrorBehaviour;
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar createdAt;
	@XmlSchemaType(name = "dateTime")
	protected XMLGregorianCalendar finishedAt;
	protected EPCISCaptureDocumentErrorListType errors;
	@XmlSchemaType(name = "anyURI")
	protected String errorFile;
	@XmlAnyElement(lax = true)
	protected List<Object> any;
	@XmlAttribute(name = "running", required = true)
	protected boolean running;
	@XmlAttribute(name = "success", required = true)
	protected boolean success;
	@XmlAttribute(name = "captureID", required = true)
	protected String captureID;
	@XmlAnyAttribute
	private Map<QName, String> otherAttributes = new HashMap<QName, String>();

	/**
	 * Gets the value of the captureErrorBehaviour property.
	 * 
	 * @return possible object is {@link EPCISCaptureErrorBehaviourType }
	 * 
	 */
	public EPCISCaptureErrorBehaviourType getCaptureErrorBehaviour() {
		return captureErrorBehaviour;
	}

	/**
	 * Sets the value of the captureErrorBehaviour property.
	 * 
	 * @param value allowed object is {@link EPCISCaptureErrorBehaviourType }
	 * 
	 */
	public void setCaptureErrorBehaviour(EPCISCaptureErrorBehaviourType value) {
		this.captureErrorBehaviour = value;
	}

	/**
	 * Gets the value of the createdAt property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getCreatedAt() {
		return createdAt;
	}

	/**
	 * Sets the value of the createdAt property.
	 * 
	 * @param value allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setCreatedAt(XMLGregorianCalendar value) {
		this.createdAt = value;
	}

	/**
	 * Gets the value of the finishedAt property.
	 * 
	 * @return possible object is {@link XMLGregorianCalendar }
	 * 
	 */
	public XMLGregorianCalendar getFinishedAt() {
		return finishedAt;
	}

	/**
	 * Sets the value of the finishedAt property.
	 * 
	 * @param value allowed object is {@link XMLGregorianCalendar }
	 * 
	 */
	public void setFinishedAt(XMLGregorianCalendar value) {
		this.finishedAt = value;
	}

	/**
	 * Gets the value of the errors property.
	 * 
	 * @return possible object is {@link EPCISCaptureDocumentErrorListType }
	 * 
	 */
	public EPCISCaptureDocumentErrorListType getErrors() {
		return errors;
	}

	/**
	 * Sets the value of the errors property.
	 * 
	 * @param value allowed object is {@link EPCISCaptureDocumentErrorListType }
	 * 
	 */
	public void setErrors(EPCISCaptureDocumentErrorListType value) {
		this.errors = value;
	}

	/**
	 * Gets the value of the errorFile property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getErrorFile() {
		return errorFile;
	}

	/**
	 * Sets the value of the errorFile property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setErrorFile(String value) {
		this.errorFile = value;
	}

	/**
	 * Gets the value of the any property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot.
	 * Therefore any modification you make to the returned list will be present
	 * inside the JAXB object. This is why there is not a <CODE>set</CODE> method
	 * for the any property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getAny().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Element }
	 * {@link Object }
	 * 
	 * 
	 */
	public List<Object> getAny() {
		if (any == null) {
			any = new ArrayList<Object>();
		}
		return this.any;
	}

	/**
	 * Gets the value of the running property.
	 * 
	 */
	public boolean isRunning() {
		return running;
	}

	/**
	 * Sets the value of the running property.
	 * 
	 */
	public void setRunning(boolean value) {
		this.running = value;
	}

	/**
	 * Gets the value of the success property.
	 * 
	 */
	public boolean isSuccess() {
		return success;
	}

	/**
	 * Sets the value of the success property.
	 * 
	 */
	public void setSuccess(boolean value) {
		this.success = value;
	}

	/**
	 * Gets the value of the captureID property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCaptureID() {
		return captureID;
	}

	/**
	 * Sets the value of the captureID property.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setCaptureID(String value) {
		this.captureID = value;
	}

	/**
	 * Gets a map that contains attributes that aren't bound to any typed property
	 * on this class.
	 * 
	 * <p>
	 * the map is keyed by the name of the attribute and the value is the string
	 * value of the attribute.
	 * 
	 * the map returned by this method is live, and you can add new attribute by
	 * updating the map directly. Because of this design, there's no setter.
	 * 
	 * 
	 * @return always non-null
	 */
	public Map<QName, String> getOtherAttributes() {
		return otherAttributes;
	}

}