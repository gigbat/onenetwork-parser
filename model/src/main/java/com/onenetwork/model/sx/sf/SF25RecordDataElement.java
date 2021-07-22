//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.22 at 01:53:37 PM EEST 
//


package com.onenetwork.model.sx.sf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.onenetwork.model.position.Position;


/**
 * <p>Java class for SF25RecordDataElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SF25RecordDataElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="controlIdentifier" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="equipmentDescriptionCode" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="equipmentInitial" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="equipmentNumber" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="equipmentNumberCheckDigit" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="equipmentSizeTypeCode" type="{http://www.model.onenetwork.com/position}Position"/&gt;
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
@XmlType(name = "SF25RecordDataElement", propOrder = {
    "controlIdentifier",
    "equipmentDescriptionCode",
    "equipmentInitial",
    "equipmentNumber",
    "equipmentNumberCheckDigit",
    "equipmentSizeTypeCode",
    "defaultControlIdentifier",
    "messageType"
})
public class SF25RecordDataElement {

    @XmlElement(required = true)
    protected Position controlIdentifier;
    @XmlElement(required = true)
    protected Position equipmentDescriptionCode;
    @XmlElement(required = true)
    protected Position equipmentInitial;
    @XmlElement(required = true)
    protected Position equipmentNumber;
    @XmlElement(required = true)
    protected Position equipmentNumberCheckDigit;
    @XmlElement(required = true)
    protected Position equipmentSizeTypeCode;
    @XmlElement(defaultValue = "SF25")
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
     * Gets the value of the equipmentDescriptionCode property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getEquipmentDescriptionCode() {
        return equipmentDescriptionCode;
    }

    /**
     * Sets the value of the equipmentDescriptionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setEquipmentDescriptionCode(Position value) {
        this.equipmentDescriptionCode = value;
    }

    /**
     * Gets the value of the equipmentInitial property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getEquipmentInitial() {
        return equipmentInitial;
    }

    /**
     * Sets the value of the equipmentInitial property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setEquipmentInitial(Position value) {
        this.equipmentInitial = value;
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
     * Gets the value of the equipmentNumberCheckDigit property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getEquipmentNumberCheckDigit() {
        return equipmentNumberCheckDigit;
    }

    /**
     * Sets the value of the equipmentNumberCheckDigit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setEquipmentNumberCheckDigit(Position value) {
        this.equipmentNumberCheckDigit = value;
    }

    /**
     * Gets the value of the equipmentSizeTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getEquipmentSizeTypeCode() {
        return equipmentSizeTypeCode;
    }

    /**
     * Sets the value of the equipmentSizeTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setEquipmentSizeTypeCode(Position value) {
        this.equipmentSizeTypeCode = value;
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
