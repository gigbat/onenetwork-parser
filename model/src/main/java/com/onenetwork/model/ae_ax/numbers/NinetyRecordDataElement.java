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
 * <p>Java class for NinetyRecordDataElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NinetyRecordDataElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="controlIdentifier" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="grandTotalDutyAmount" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="grandTotalUserFeeAmount" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="grandTotalIrTaxAmount" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="grandTotalAdDutyAmount" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="grandTotalCvDutyAmount" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="grandTotalOtherRevenueAmount" type="{http://www.model.onenetwork.com/position}Position"/&gt;
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
@XmlType(name = "NinetyRecordDataElement", propOrder = {
    "controlIdentifier",
    "grandTotalDutyAmount",
    "grandTotalUserFeeAmount",
    "grandTotalIrTaxAmount",
    "grandTotalAdDutyAmount",
    "grandTotalCvDutyAmount",
    "grandTotalOtherRevenueAmount",
    "defaultControlIdentifier",
    "messageType",
    "endPositionOfControlIdentifier"
})
public class NinetyRecordDataElement {

    @XmlElement(required = true)
    protected Position controlIdentifier;
    @XmlElement(required = true)
    protected Position grandTotalDutyAmount;
    @XmlElement(required = true)
    protected Position grandTotalUserFeeAmount;
    @XmlElement(required = true)
    protected Position grandTotalIrTaxAmount;
    @XmlElement(required = true)
    protected Position grandTotalAdDutyAmount;
    @XmlElement(required = true)
    protected Position grandTotalCvDutyAmount;
    @XmlElement(required = true)
    protected Position grandTotalOtherRevenueAmount;
    @XmlElement(defaultValue = "90")
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
     * Gets the value of the grandTotalDutyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getGrandTotalDutyAmount() {
        return grandTotalDutyAmount;
    }

    /**
     * Sets the value of the grandTotalDutyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setGrandTotalDutyAmount(Position value) {
        this.grandTotalDutyAmount = value;
    }

    /**
     * Gets the value of the grandTotalUserFeeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getGrandTotalUserFeeAmount() {
        return grandTotalUserFeeAmount;
    }

    /**
     * Sets the value of the grandTotalUserFeeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setGrandTotalUserFeeAmount(Position value) {
        this.grandTotalUserFeeAmount = value;
    }

    /**
     * Gets the value of the grandTotalIrTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getGrandTotalIrTaxAmount() {
        return grandTotalIrTaxAmount;
    }

    /**
     * Sets the value of the grandTotalIrTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setGrandTotalIrTaxAmount(Position value) {
        this.grandTotalIrTaxAmount = value;
    }

    /**
     * Gets the value of the grandTotalAdDutyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getGrandTotalAdDutyAmount() {
        return grandTotalAdDutyAmount;
    }

    /**
     * Sets the value of the grandTotalAdDutyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setGrandTotalAdDutyAmount(Position value) {
        this.grandTotalAdDutyAmount = value;
    }

    /**
     * Gets the value of the grandTotalCvDutyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getGrandTotalCvDutyAmount() {
        return grandTotalCvDutyAmount;
    }

    /**
     * Sets the value of the grandTotalCvDutyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setGrandTotalCvDutyAmount(Position value) {
        this.grandTotalCvDutyAmount = value;
    }

    /**
     * Gets the value of the grandTotalOtherRevenueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getGrandTotalOtherRevenueAmount() {
        return grandTotalOtherRevenueAmount;
    }

    /**
     * Sets the value of the grandTotalOtherRevenueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setGrandTotalOtherRevenueAmount(Position value) {
        this.grandTotalOtherRevenueAmount = value;
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
