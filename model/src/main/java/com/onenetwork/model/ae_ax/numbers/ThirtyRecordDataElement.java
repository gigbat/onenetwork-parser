//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.21 at 11:00:31 PM EEST 
//


package com.onenetwork.model.ae_ax.numbers;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.onenetwork.model.position.Position;


/**
 * <p>Java class for ThirtyRecordDataElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ThirtyRecordDataElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="controlIdentifier" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="associatedWarehouseEntryFilerCode" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="associatedWarehouseEntryNumber" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="associatedWarehouseEntryDistrictOrPortCode" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="finalWarehouseWithdrawalIndicator" type="{http://www.model.onenetwork.com/position}Position"/&gt;
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
@XmlType(name = "ThirtyRecordDataElement", propOrder = {
    "controlIdentifier",
    "associatedWarehouseEntryFilerCode",
    "associatedWarehouseEntryNumber",
    "associatedWarehouseEntryDistrictOrPortCode",
    "finalWarehouseWithdrawalIndicator",
    "defaultControlIdentifier",
    "messageType"
})
public class ThirtyRecordDataElement {

    @XmlElement(required = true)
    protected Position controlIdentifier;
    @XmlElement(required = true)
    protected Position associatedWarehouseEntryFilerCode;
    @XmlElement(required = true)
    protected Position associatedWarehouseEntryNumber;
    @XmlElement(required = true)
    protected Position associatedWarehouseEntryDistrictOrPortCode;
    @XmlElement(required = true)
    protected Position finalWarehouseWithdrawalIndicator;
    @XmlElement(defaultValue = "30")
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
     * Gets the value of the associatedWarehouseEntryFilerCode property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getAssociatedWarehouseEntryFilerCode() {
        return associatedWarehouseEntryFilerCode;
    }

    /**
     * Sets the value of the associatedWarehouseEntryFilerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setAssociatedWarehouseEntryFilerCode(Position value) {
        this.associatedWarehouseEntryFilerCode = value;
    }

    /**
     * Gets the value of the associatedWarehouseEntryNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getAssociatedWarehouseEntryNumber() {
        return associatedWarehouseEntryNumber;
    }

    /**
     * Sets the value of the associatedWarehouseEntryNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setAssociatedWarehouseEntryNumber(Position value) {
        this.associatedWarehouseEntryNumber = value;
    }

    /**
     * Gets the value of the associatedWarehouseEntryDistrictOrPortCode property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getAssociatedWarehouseEntryDistrictOrPortCode() {
        return associatedWarehouseEntryDistrictOrPortCode;
    }

    /**
     * Sets the value of the associatedWarehouseEntryDistrictOrPortCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setAssociatedWarehouseEntryDistrictOrPortCode(Position value) {
        this.associatedWarehouseEntryDistrictOrPortCode = value;
    }

    /**
     * Gets the value of the finalWarehouseWithdrawalIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getFinalWarehouseWithdrawalIndicator() {
        return finalWarehouseWithdrawalIndicator;
    }

    /**
     * Sets the value of the finalWarehouseWithdrawalIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setFinalWarehouseWithdrawalIndicator(Position value) {
        this.finalWarehouseWithdrawalIndicator = value;
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
