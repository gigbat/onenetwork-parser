//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.22 at 02:06:22 PM EEST 
//


package com.onenetwork.model.sx.se;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.onenetwork.model.position.Position;


/**
 * <p>Java class for SE17RecordDataElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SE17RecordDataElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="controlIdentifier" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="equipmentNumber" type="{http://www.model.onenetwork.com/position}Position"/&gt;
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
@XmlType(name = "SE17RecordDataElement", propOrder = {
    "controlIdentifier",
    "equipmentNumber",
    "defaultControlIdentifier",
    "messageType"
})
public class SE17RecordDataElement {

    @XmlElement(required = true)
    protected Position controlIdentifier;
    @XmlElement(required = true)
    protected Position equipmentNumber;
    @XmlElement(defaultValue = "SE17")
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
     * Gets the value of the equipmentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getEquipmentNumber() {
        return equipmentNumber;
    }

    /**
     * Sets the value of the equipmentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setEquipmentNumber(Position value) {
        this.equipmentNumber = value;
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
