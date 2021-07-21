//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.21 at 05:38:52 PM EEST 
//


package com.onenetwork.model.so;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.onenetwork.model.position.Position;


/**
 * <p>Java class for SO42RecordDataElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SO42RecordDataElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="controlIdentifier" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="inBondNumber" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="inBondEntryType" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="portOfInBondDeparture" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="portOfInBondArrival" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="inBondCreateDate" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="dateOfInBondArrival" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="inBondQuantity" type="{http://www.model.onenetwork.com/position}Position"/&gt;
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
@XmlType(name = "SO42RecordDataElement", propOrder = {
    "controlIdentifier",
    "inBondNumber",
    "inBondEntryType",
    "portOfInBondDeparture",
    "portOfInBondArrival",
    "inBondCreateDate",
    "dateOfInBondArrival",
    "inBondQuantity",
    "defaultControlIdentifier",
    "messageType"
})
public class SO42RecordDataElement {

    @XmlElement(required = true)
    protected Position controlIdentifier;
    @XmlElement(required = true)
    protected Position inBondNumber;
    @XmlElement(required = true)
    protected Position inBondEntryType;
    @XmlElement(required = true)
    protected Position portOfInBondDeparture;
    @XmlElement(required = true)
    protected Position portOfInBondArrival;
    @XmlElement(required = true)
    protected Position inBondCreateDate;
    @XmlElement(required = true)
    protected Position dateOfInBondArrival;
    @XmlElement(required = true)
    protected Position inBondQuantity;
    @XmlElement(defaultValue = "SO42")
    protected String defaultControlIdentifier;
    @XmlElement(defaultValue = "SO")
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
     * Gets the value of the inBondNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getInBondNumber() {
        return inBondNumber;
    }

    /**
     * Sets the value of the inBondNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setInBondNumber(Position value) {
        this.inBondNumber = value;
    }

    /**
     * Gets the value of the inBondEntryType property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getInBondEntryType() {
        return inBondEntryType;
    }

    /**
     * Sets the value of the inBondEntryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setInBondEntryType(Position value) {
        this.inBondEntryType = value;
    }

    /**
     * Gets the value of the portOfInBondDeparture property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getPortOfInBondDeparture() {
        return portOfInBondDeparture;
    }

    /**
     * Sets the value of the portOfInBondDeparture property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setPortOfInBondDeparture(Position value) {
        this.portOfInBondDeparture = value;
    }

    /**
     * Gets the value of the portOfInBondArrival property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getPortOfInBondArrival() {
        return portOfInBondArrival;
    }

    /**
     * Sets the value of the portOfInBondArrival property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setPortOfInBondArrival(Position value) {
        this.portOfInBondArrival = value;
    }

    /**
     * Gets the value of the inBondCreateDate property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getInBondCreateDate() {
        return inBondCreateDate;
    }

    /**
     * Sets the value of the inBondCreateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setInBondCreateDate(Position value) {
        this.inBondCreateDate = value;
    }

    /**
     * Gets the value of the dateOfInBondArrival property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getDateOfInBondArrival() {
        return dateOfInBondArrival;
    }

    /**
     * Sets the value of the dateOfInBondArrival property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setDateOfInBondArrival(Position value) {
        this.dateOfInBondArrival = value;
    }

    /**
     * Gets the value of the inBondQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getInBondQuantity() {
        return inBondQuantity;
    }

    /**
     * Sets the value of the inBondQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setInBondQuantity(Position value) {
        this.inBondQuantity = value;
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
