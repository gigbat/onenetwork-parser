//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.22 at 06:55:02 PM EEST 
//


package com.onenetwork.model.sn_us_isf10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.onenetwork.model.position.Position;


/**
 * <p>Java class for SF13RecordDataElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SF13RecordDataElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="controlIdentifier" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="shipmentSubType" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="estimatedValue" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="estimatedQuantity" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="unitOfMeasure" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="estimatedWeight" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="weightQualifiers" type="{http://www.model.onenetwork.com/position}Position"/&gt;
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
@XmlType(name = "SF13RecordDataElement", propOrder = {
    "controlIdentifier",
    "shipmentSubType",
    "estimatedValue",
    "estimatedQuantity",
    "unitOfMeasure",
    "estimatedWeight",
    "weightQualifiers",
    "defaultControlIdentifier",
    "messageType",
    "endPositionOfControlIdentifier"
})
public class SF13RecordDataElement {

    @XmlElement(required = true)
    protected Position controlIdentifier;
    @XmlElement(required = true)
    protected Position shipmentSubType;
    @XmlElement(required = true)
    protected Position estimatedValue;
    @XmlElement(required = true)
    protected Position estimatedQuantity;
    @XmlElement(required = true)
    protected Position unitOfMeasure;
    @XmlElement(required = true)
    protected Position estimatedWeight;
    @XmlElement(required = true)
    protected Position weightQualifiers;
    @XmlElement(defaultValue = "SF13")
    protected String defaultControlIdentifier;
    @XmlElement(defaultValue = "SN|US-ISF10")
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
     * Gets the value of the shipmentSubType property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getShipmentSubType() {
        return shipmentSubType;
    }

    /**
     * Sets the value of the shipmentSubType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setShipmentSubType(Position value) {
        this.shipmentSubType = value;
    }

    /**
     * Gets the value of the estimatedValue property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getEstimatedValue() {
        return estimatedValue;
    }

    /**
     * Sets the value of the estimatedValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setEstimatedValue(Position value) {
        this.estimatedValue = value;
    }

    /**
     * Gets the value of the estimatedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getEstimatedQuantity() {
        return estimatedQuantity;
    }

    /**
     * Sets the value of the estimatedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setEstimatedQuantity(Position value) {
        this.estimatedQuantity = value;
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
     * Gets the value of the estimatedWeight property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getEstimatedWeight() {
        return estimatedWeight;
    }

    /**
     * Sets the value of the estimatedWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setEstimatedWeight(Position value) {
        this.estimatedWeight = value;
    }

    /**
     * Gets the value of the weightQualifiers property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getWeightQualifiers() {
        return weightQualifiers;
    }

    /**
     * Sets the value of the weightQualifiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setWeightQualifiers(Position value) {
        this.weightQualifiers = value;
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
