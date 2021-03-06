//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.22 at 07:16:43 PM EEST 
//


package com.onenetwork.model.so;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.onenetwork.model.position.Position;


/**
 * <p>Java class for SO40RecordDataElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SO40RecordDataElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="controlIdentifier" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="billTypeIndicator" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="issuerCodeOfBillOfLadingNumber" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="billOfLadingNumber" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="quantity" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="unitOfMeasure" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="manifestedQuantity" type="{http://www.model.onenetwork.com/position}Position"/&gt;
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
@XmlType(name = "SO40RecordDataElement", propOrder = {
    "controlIdentifier",
    "billTypeIndicator",
    "issuerCodeOfBillOfLadingNumber",
    "billOfLadingNumber",
    "quantity",
    "unitOfMeasure",
    "manifestedQuantity",
    "defaultControlIdentifier",
    "messageType",
    "endPositionOfControlIdentifier"
})
public class SO40RecordDataElement {

    @XmlElement(required = true)
    protected Position controlIdentifier;
    @XmlElement(required = true)
    protected Position billTypeIndicator;
    @XmlElement(required = true)
    protected Position issuerCodeOfBillOfLadingNumber;
    @XmlElement(required = true)
    protected Position billOfLadingNumber;
    @XmlElement(required = true)
    protected Position quantity;
    @XmlElement(required = true)
    protected Position unitOfMeasure;
    @XmlElement(required = true)
    protected Position manifestedQuantity;
    @XmlElement(defaultValue = "SO40")
    protected String defaultControlIdentifier;
    @XmlElement(defaultValue = "SO")
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
     * Gets the value of the billTypeIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getBillTypeIndicator() {
        return billTypeIndicator;
    }

    /**
     * Sets the value of the billTypeIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setBillTypeIndicator(Position value) {
        this.billTypeIndicator = value;
    }

    /**
     * Gets the value of the issuerCodeOfBillOfLadingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getIssuerCodeOfBillOfLadingNumber() {
        return issuerCodeOfBillOfLadingNumber;
    }

    /**
     * Sets the value of the issuerCodeOfBillOfLadingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setIssuerCodeOfBillOfLadingNumber(Position value) {
        this.issuerCodeOfBillOfLadingNumber = value;
    }

    /**
     * Gets the value of the billOfLadingNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getBillOfLadingNumber() {
        return billOfLadingNumber;
    }

    /**
     * Sets the value of the billOfLadingNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setBillOfLadingNumber(Position value) {
        this.billOfLadingNumber = value;
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
     * Gets the value of the manifestedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getManifestedQuantity() {
        return manifestedQuantity;
    }

    /**
     * Sets the value of the manifestedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setManifestedQuantity(Position value) {
        this.manifestedQuantity = value;
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
