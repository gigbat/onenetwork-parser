//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.22 at 01:53:37 PM EEST 
//


package com.onenetwork.model.sx.se;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.onenetwork.model.position.Position;


/**
 * <p>Java class for SE16RecordDataElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SE16RecordDataElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="controlIdentifier" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="carrierCode" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="voyageOrFlightOrTripManifestNumber" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="dateOfArrival" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="quantity" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="unitOfMeasure" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="conveyanceName" type="{http://www.model.onenetwork.com/position}Position"/&gt;
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
@XmlType(name = "SE16RecordDataElement", propOrder = {
    "controlIdentifier",
    "carrierCode",
    "voyageOrFlightOrTripManifestNumber",
    "dateOfArrival",
    "quantity",
    "unitOfMeasure",
    "conveyanceName",
    "defaultControlIdentifier",
    "messageType"
})
public class SE16RecordDataElement {

    @XmlElement(required = true)
    protected Position controlIdentifier;
    @XmlElement(required = true)
    protected Position carrierCode;
    @XmlElement(required = true)
    protected Position voyageOrFlightOrTripManifestNumber;
    @XmlElement(required = true)
    protected Position dateOfArrival;
    @XmlElement(required = true)
    protected Position quantity;
    @XmlElement(required = true)
    protected Position unitOfMeasure;
    @XmlElement(required = true)
    protected Position conveyanceName;
    @XmlElement(defaultValue = "SE16")
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
     * Gets the value of the carrierCode property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getCarrierCode() {
        return carrierCode;
    }

    /**
     * Sets the value of the carrierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setCarrierCode(Position value) {
        this.carrierCode = value;
    }

    /**
     * Gets the value of the voyageOrFlightOrTripManifestNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getVoyageOrFlightOrTripManifestNumber() {
        return voyageOrFlightOrTripManifestNumber;
    }

    /**
     * Sets the value of the voyageOrFlightOrTripManifestNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setVoyageOrFlightOrTripManifestNumber(Position value) {
        this.voyageOrFlightOrTripManifestNumber = value;
    }

    /**
     * Gets the value of the dateOfArrival property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getDateOfArrival() {
        return dateOfArrival;
    }

    /**
     * Sets the value of the dateOfArrival property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setDateOfArrival(Position value) {
        this.dateOfArrival = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setQuantity(Position value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the unitOfMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * Sets the value of the unitOfMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setUnitOfMeasure(Position value) {
        this.unitOfMeasure = value;
    }

    /**
     * Gets the value of the conveyanceName property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getConveyanceName() {
        return conveyanceName;
    }

    /**
     * Sets the value of the conveyanceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setConveyanceName(Position value) {
        this.conveyanceName = value;
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
