//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.21 at 03:53:23 PM EEST 
//


package com.onenetwork.model.ae_ax.numbers;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.onenetwork.model.position.Position;


/**
 * <p>Java class for ThirtyOneRecordDataElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ThirtyOneRecordDataElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="controlIdentifier" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="bondTypeCode" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="bondDesignationTypeCode" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="continuousBondIndicator" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="suretyCompanyCode" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="singleTransactionBondAmount" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="singleTransactionBondProducerAccountNumber" type="{http://www.model.onenetwork.com/position}Position"/&gt;
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
@XmlType(name = "ThirtyOneRecordDataElement", propOrder = {
    "controlIdentifier",
    "bondTypeCode",
    "bondDesignationTypeCode",
    "continuousBondIndicator",
    "suretyCompanyCode",
    "singleTransactionBondAmount",
    "singleTransactionBondProducerAccountNumber",
    "defaultControlIdentifier",
    "messageType"
})
public class ThirtyOneRecordDataElement {

    @XmlElement(required = true)
    protected Position controlIdentifier;
    @XmlElement(required = true)
    protected Position bondTypeCode;
    @XmlElement(required = true)
    protected Position bondDesignationTypeCode;
    @XmlElement(required = true)
    protected Position continuousBondIndicator;
    @XmlElement(required = true)
    protected Position suretyCompanyCode;
    @XmlElement(required = true)
    protected Position singleTransactionBondAmount;
    @XmlElement(required = true)
    protected Position singleTransactionBondProducerAccountNumber;
    @XmlElement(defaultValue = "31")
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
     * Gets the value of the bondTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getBondTypeCode() {
        return bondTypeCode;
    }

    /**
     * Sets the value of the bondTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setBondTypeCode(Position value) {
        this.bondTypeCode = value;
    }

    /**
     * Gets the value of the bondDesignationTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getBondDesignationTypeCode() {
        return bondDesignationTypeCode;
    }

    /**
     * Sets the value of the bondDesignationTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setBondDesignationTypeCode(Position value) {
        this.bondDesignationTypeCode = value;
    }

    /**
     * Gets the value of the continuousBondIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getContinuousBondIndicator() {
        return continuousBondIndicator;
    }

    /**
     * Sets the value of the continuousBondIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setContinuousBondIndicator(Position value) {
        this.continuousBondIndicator = value;
    }

    /**
     * Gets the value of the suretyCompanyCode property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getSuretyCompanyCode() {
        return suretyCompanyCode;
    }

    /**
     * Sets the value of the suretyCompanyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setSuretyCompanyCode(Position value) {
        this.suretyCompanyCode = value;
    }

    /**
     * Gets the value of the singleTransactionBondAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getSingleTransactionBondAmount() {
        return singleTransactionBondAmount;
    }

    /**
     * Sets the value of the singleTransactionBondAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setSingleTransactionBondAmount(Position value) {
        this.singleTransactionBondAmount = value;
    }

    /**
     * Gets the value of the singleTransactionBondProducerAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getSingleTransactionBondProducerAccountNumber() {
        return singleTransactionBondProducerAccountNumber;
    }

    /**
     * Sets the value of the singleTransactionBondProducerAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setSingleTransactionBondProducerAccountNumber(Position value) {
        this.singleTransactionBondProducerAccountNumber = value;
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
