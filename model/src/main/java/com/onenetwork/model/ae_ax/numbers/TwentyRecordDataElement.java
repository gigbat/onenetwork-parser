//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.22 at 07:16:43 PM EEST 
//


package com.onenetwork.model.ae_ax.numbers;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.onenetwork.model.position.Position;


/**
 * <p>Java class for TwentyRecordDataElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TwentyRecordDataElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="controlIdentifier" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="carrierCode" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="districtOrPortOfUnlading" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="estimatedDateOfArrival" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="locationOfGoodsCode" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="conveyanceName" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="vesselCode" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="designatedExamPortCode" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="inBondOrInTransitDate" type="{http://www.model.onenetwork.com/position}Position"/&gt;
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
@XmlType(name = "TwentyRecordDataElement", propOrder = {
    "controlIdentifier",
    "carrierCode",
    "districtOrPortOfUnlading",
    "estimatedDateOfArrival",
    "locationOfGoodsCode",
    "conveyanceName",
    "vesselCode",
    "designatedExamPortCode",
    "inBondOrInTransitDate",
    "defaultControlIdentifier",
    "messageType",
    "endPositionOfControlIdentifier"
})
public class TwentyRecordDataElement {

    @XmlElement(required = true)
    protected Position controlIdentifier;
    @XmlElement(required = true)
    protected Position carrierCode;
    @XmlElement(required = true)
    protected Position districtOrPortOfUnlading;
    @XmlElement(required = true)
    protected Position estimatedDateOfArrival;
    @XmlElement(required = true)
    protected Position locationOfGoodsCode;
    @XmlElement(required = true)
    protected Position conveyanceName;
    @XmlElement(required = true)
    protected Position vesselCode;
    @XmlElement(required = true)
    protected Position designatedExamPortCode;
    @XmlElement(required = true)
    protected Position inBondOrInTransitDate;
    @XmlElement(defaultValue = "20")
    protected String defaultControlIdentifier;
    @XmlElement(defaultValue = "AE|AX")
    protected String messageType;
    @XmlElement(defaultValue = "2")
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
     * Gets the value of the districtOrPortOfUnlading property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getDistrictOrPortOfUnlading() {
        return districtOrPortOfUnlading;
    }

    /**
     * Sets the value of the districtOrPortOfUnlading property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setDistrictOrPortOfUnlading(Position value) {
        this.districtOrPortOfUnlading = value;
    }

    /**
     * Gets the value of the estimatedDateOfArrival property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getEstimatedDateOfArrival() {
        return estimatedDateOfArrival;
    }

    /**
     * Sets the value of the estimatedDateOfArrival property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setEstimatedDateOfArrival(Position value) {
        this.estimatedDateOfArrival = value;
    }

    /**
     * Gets the value of the locationOfGoodsCode property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getLocationOfGoodsCode() {
        return locationOfGoodsCode;
    }

    /**
     * Sets the value of the locationOfGoodsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setLocationOfGoodsCode(Position value) {
        this.locationOfGoodsCode = value;
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
     * Gets the value of the vesselCode property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getVesselCode() {
        return vesselCode;
    }

    /**
     * Sets the value of the vesselCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setVesselCode(Position value) {
        this.vesselCode = value;
    }

    /**
     * Gets the value of the designatedExamPortCode property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getDesignatedExamPortCode() {
        return designatedExamPortCode;
    }

    /**
     * Sets the value of the designatedExamPortCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setDesignatedExamPortCode(Position value) {
        this.designatedExamPortCode = value;
    }

    /**
     * Gets the value of the inBondOrInTransitDate property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getInBondOrInTransitDate() {
        return inBondOrInTransitDate;
    }

    /**
     * Sets the value of the inBondOrInTransitDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setInBondOrInTransitDate(Position value) {
        this.inBondOrInTransitDate = value;
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
