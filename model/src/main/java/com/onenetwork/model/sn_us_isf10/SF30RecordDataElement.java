//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.21 at 04:26:39 PM EEST 
//


package com.onenetwork.model.sn_us_isf10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.onenetwork.model.position.Position;


/**
 * <p>Java class for SF30RecordDataElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SF30RecordDataElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="controlIdentifier" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="entityCode" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="entityName" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="entityIdentifierQualifier" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="entityIdentifier" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="countryCode" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="dateOfBirth" type="{http://www.model.onenetwork.com/position}Position"/&gt;
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
@XmlType(name = "SF30RecordDataElement", propOrder = {
    "controlIdentifier",
    "entityCode",
    "entityName",
    "entityIdentifierQualifier",
    "entityIdentifier",
    "countryCode",
    "dateOfBirth",
    "defaultControlIdentifier",
    "messageType"
})
public class SF30RecordDataElement {

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
    @XmlElement(required = true)
    protected Position countryCode;
    @XmlElement(required = true)
    protected Position dateOfBirth;
    @XmlElement(defaultValue = "SF30")
    protected String defaultControlIdentifier;
    @XmlElement(defaultValue = "SN|US-ISF10")
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
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setCountryCode(Position value) {
        this.countryCode = value;
    }

    /**
     * Gets the value of the dateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setDateOfBirth(Position value) {
        this.dateOfBirth = value;
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
