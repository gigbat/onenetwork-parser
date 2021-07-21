//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.21 at 04:26:39 PM EEST 
//


package com.onenetwork.model.ae_ax.se;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.onenetwork.model.position.Position;


/**
 * <p>Java class for SE50RecordDataElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SE50RecordDataElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="controlIdentifier" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="entityCode" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="entityName" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="entityIdentifierQualifier" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="entityIdentifier" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="defaultControlIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="messageType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SE50RecordDataElement", propOrder = {
    "controlIdentifier",
    "entityCode",
    "entityName",
    "entityIdentifierQualifier",
    "entityIdentifier",
    "defaultControlIdentifier",
    "messageType"
})
public class SE50RecordDataElement {

    @XmlElement(required = true)
    protected Position controlIdentifier;
    @XmlElement(required = true)
    protected Position entityCode;
    @XmlElement(required = true)
    protected Position entityName;
    @XmlElement(required = true)
    protected Position entityIdentifierQualifier;
    @XmlElement(required = true)
    protected Position entityIdentifier;
    @XmlElement(defaultValue = "SE50")
    protected String defaultControlIdentifier;
    @XmlElement(defaultValue = "AE|AX")
    protected String messageType;

    /**
     * Gets the value of the controlIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getControlIdentifier() {
        return controlIdentifier;
    }

    /**
     * Sets the value of the controlIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setControlIdentifier(Position value) {
        this.controlIdentifier = value;
    }

    /**
     * Gets the value of the entityCode property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getEntityCode() {
        return entityCode;
    }

    /**
     * Sets the value of the entityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setEntityCode(Position value) {
        this.entityCode = value;
    }

    /**
     * Gets the value of the entityName property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getEntityName() {
        return entityName;
    }

    /**
     * Sets the value of the entityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setEntityName(Position value) {
        this.entityName = value;
    }

    /**
     * Gets the value of the entityIdentifierQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getEntityIdentifierQualifier() {
        return entityIdentifierQualifier;
    }

    /**
     * Sets the value of the entityIdentifierQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setEntityIdentifierQualifier(Position value) {
        this.entityIdentifierQualifier = value;
    }

    /**
     * Gets the value of the entityIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getEntityIdentifier() {
        return entityIdentifier;
    }

    /**
     * Sets the value of the entityIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setEntityIdentifier(Position value) {
        this.entityIdentifier = value;
    }

    /**
     * Gets the value of the defaultControlIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultControlIdentifier() {
        return defaultControlIdentifier;
    }

    /**
     * Sets the value of the defaultControlIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultControlIdentifier(String value) {
        this.defaultControlIdentifier = value;
    }

    /**
     * Gets the value of the messageType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageType() {
        return messageType;
    }

    /**
     * Sets the value of the messageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageType(String value) {
        this.messageType = value;
    }

}
