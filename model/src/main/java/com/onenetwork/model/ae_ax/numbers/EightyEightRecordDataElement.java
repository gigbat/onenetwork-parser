//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.22 at 06:55:02 PM EEST 
//


package com.onenetwork.model.ae_ax.numbers;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.onenetwork.model.position.Position;


/**
 * <p>Java class for EightyEightRecordDataElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EightyEightRecordDataElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="controlIdentifier" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="totalBondedAdDutyAmount" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="totalCashDepositAdDutyAmount" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="totalBondedCvDutyAmount" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="totalCashDepositCvDutyAmount" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="defaultControlIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="endPositionOfControlIdentifier" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
@XmlType(name = "EightyEightRecordDataElement", propOrder = {
    "controlIdentifier",
    "totalBondedAdDutyAmount",
    "totalCashDepositAdDutyAmount",
    "totalBondedCvDutyAmount",
    "totalCashDepositCvDutyAmount",
    "defaultControlIdentifier",
    "endPositionOfControlIdentifier",
    "messageType"
})
public class EightyEightRecordDataElement {

    @XmlElement(required = true)
    protected Position controlIdentifier;
    @XmlElement(required = true)
    protected Position totalBondedAdDutyAmount;
    @XmlElement(required = true)
    protected Position totalCashDepositAdDutyAmount;
    @XmlElement(required = true)
    protected Position totalBondedCvDutyAmount;
    @XmlElement(required = true)
    protected Position totalCashDepositCvDutyAmount;
    @XmlElement(defaultValue = "88")
    protected String defaultControlIdentifier;
    @XmlElement(defaultValue = "2")
    protected Integer endPositionOfControlIdentifier;
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
     * Gets the value of the totalBondedAdDutyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getTotalBondedAdDutyAmount() {
        return totalBondedAdDutyAmount;
    }

    /**
     * Sets the value of the totalBondedAdDutyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setTotalBondedAdDutyAmount(Position value) {
        this.totalBondedAdDutyAmount = value;
    }

    /**
     * Gets the value of the totalCashDepositAdDutyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getTotalCashDepositAdDutyAmount() {
        return totalCashDepositAdDutyAmount;
    }

    /**
     * Sets the value of the totalCashDepositAdDutyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setTotalCashDepositAdDutyAmount(Position value) {
        this.totalCashDepositAdDutyAmount = value;
    }

    /**
     * Gets the value of the totalBondedCvDutyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getTotalBondedCvDutyAmount() {
        return totalBondedCvDutyAmount;
    }

    /**
     * Sets the value of the totalBondedCvDutyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setTotalBondedCvDutyAmount(Position value) {
        this.totalBondedCvDutyAmount = value;
    }

    /**
     * Gets the value of the totalCashDepositCvDutyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getTotalCashDepositCvDutyAmount() {
        return totalCashDepositCvDutyAmount;
    }

    /**
     * Sets the value of the totalCashDepositCvDutyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setTotalCashDepositCvDutyAmount(Position value) {
        this.totalCashDepositCvDutyAmount = value;
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
