//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.21 at 11:00:31 PM EEST 
//


package com.onenetwork.model.sx.se;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.onenetwork.model.position.Position;


/**
 * <p>Java class for SE55RecordDataElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SE55RecordDataElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="controlIdentifier" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="addressComponentQualifierFirst" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="addressInformationFist" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="addressComponentQualifierSecond" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="addressInformationSecond" type="{http://www.model.onenetwork.com/position}Position"/&gt;
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
@XmlType(name = "SE55RecordDataElement", propOrder = {
    "controlIdentifier",
    "addressComponentQualifierFirst",
    "addressInformationFist",
    "addressComponentQualifierSecond",
    "addressInformationSecond",
    "defaultControlIdentifier",
    "messageType"
})
public class SE55RecordDataElement {

    @XmlElement(required = true)
    protected Position controlIdentifier;
    @XmlElement(required = true)
    protected Position addressComponentQualifierFirst;
    @XmlElement(required = true)
    protected Position addressInformationFist;
    @XmlElement(required = true)
    protected Position addressComponentQualifierSecond;
    @XmlElement(required = true)
    protected Position addressInformationSecond;
    @XmlElement(defaultValue = "SE55")
    protected String defaultControlIdentifier;
    @XmlElement(defaultValue = "SX")
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
     * Gets the value of the addressComponentQualifierFirst property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getAddressComponentQualifierFirst() {
        return addressComponentQualifierFirst;
    }

    /**
     * Sets the value of the addressComponentQualifierFirst property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setAddressComponentQualifierFirst(Position value) {
        this.addressComponentQualifierFirst = value;
    }

    /**
     * Gets the value of the addressInformationFist property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getAddressInformationFist() {
        return addressInformationFist;
    }

    /**
     * Sets the value of the addressInformationFist property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setAddressInformationFist(Position value) {
        this.addressInformationFist = value;
    }

    /**
     * Gets the value of the addressComponentQualifierSecond property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getAddressComponentQualifierSecond() {
        return addressComponentQualifierSecond;
    }

    /**
     * Sets the value of the addressComponentQualifierSecond property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setAddressComponentQualifierSecond(Position value) {
        this.addressComponentQualifierSecond = value;
    }

    /**
     * Gets the value of the addressInformationSecond property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getAddressInformationSecond() {
        return addressInformationSecond;
    }

    /**
     * Sets the value of the addressInformationSecond property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setAddressInformationSecond(Position value) {
        this.addressInformationSecond = value;
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
