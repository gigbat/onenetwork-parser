//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.22 at 06:55:02 PM EEST 
//


package com.onenetwork.model.sx.se;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.onenetwork.model.position.Position;


/**
 * <p>Java class for SE13RecordDataElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SE13RecordDataElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="controlIdentifier" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="contactName" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="contactPhone" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="reasonCode" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="multipleCargoDispositionsIndicator" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="disIndicator" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="splitShipmentIndicator" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="defaultControlIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="messageType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="endPositionOfControlIdentifier" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SE13RecordDataElement", propOrder = {
    "controlIdentifier",
    "contactName",
    "contactPhone",
    "reasonCode",
    "multipleCargoDispositionsIndicator",
    "disIndicator",
    "splitShipmentIndicator",
    "defaultControlIdentifier",
    "messageType",
    "endPositionOfControlIdentifier"
})
public class SE13RecordDataElement {

    @XmlElement(required = true)
    protected Position controlIdentifier;
    @XmlElement(required = true)
    protected Position contactName;
    @XmlElement(required = true)
    protected Position contactPhone;
    @XmlElement(required = true)
    protected Position reasonCode;
    @XmlElement(required = true)
    protected Position multipleCargoDispositionsIndicator;
    @XmlElement(required = true)
    protected Position disIndicator;
    @XmlElement(required = true)
    protected Position splitShipmentIndicator;
    @XmlElement(defaultValue = "SE13")
    protected String defaultControlIdentifier;
    @XmlElement(defaultValue = "SX")
    protected String messageType;
    @XmlElement(defaultValue = "4")
    protected Integer endPositionOfControlIdentifier;

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
     * Gets the value of the contactName property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getContactName() {
        return contactName;
    }

    /**
     * Sets the value of the contactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setContactName(Position value) {
        this.contactName = value;
    }

    /**
     * Gets the value of the contactPhone property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getContactPhone() {
        return contactPhone;
    }

    /**
     * Sets the value of the contactPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setContactPhone(Position value) {
        this.contactPhone = value;
    }

    /**
     * Gets the value of the reasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getReasonCode() {
        return reasonCode;
    }

    /**
     * Sets the value of the reasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setReasonCode(Position value) {
        this.reasonCode = value;
    }

    /**
     * Gets the value of the multipleCargoDispositionsIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getMultipleCargoDispositionsIndicator() {
        return multipleCargoDispositionsIndicator;
    }

    /**
     * Sets the value of the multipleCargoDispositionsIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setMultipleCargoDispositionsIndicator(Position value) {
        this.multipleCargoDispositionsIndicator = value;
    }

    /**
     * Gets the value of the disIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getDisIndicator() {
        return disIndicator;
    }

    /**
     * Sets the value of the disIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setDisIndicator(Position value) {
        this.disIndicator = value;
    }

    /**
     * Gets the value of the splitShipmentIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getSplitShipmentIndicator() {
        return splitShipmentIndicator;
    }

    /**
     * Sets the value of the splitShipmentIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setSplitShipmentIndicator(Position value) {
        this.splitShipmentIndicator = value;
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

    /**
     * Gets the value of the endPositionOfControlIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEndPositionOfControlIdentifier() {
        return endPositionOfControlIdentifier;
    }

    /**
     * Sets the value of the endPositionOfControlIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEndPositionOfControlIdentifier(Integer value) {
        this.endPositionOfControlIdentifier = value;
    }

}
