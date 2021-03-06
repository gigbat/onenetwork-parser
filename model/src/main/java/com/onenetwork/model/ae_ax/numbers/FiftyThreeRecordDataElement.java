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
 * <p>Java class for FiftyThreeRecordDataElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FiftyThreeRecordDataElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="controlIdentifier" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="caseNumber" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="bondOrCashClaimCode" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="caseDepositRate" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="caseRateTypeQualifierCode" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="adOrCvdValueOfGoodsAmount" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="adOrCvdQuantity" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="adOrCvdDutyAmount" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="adOrCvdNonReimbursementDeclarationIdentifier" type="{http://www.model.onenetwork.com/position}Position"/&gt;
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
@XmlType(name = "FiftyThreeRecordDataElement", propOrder = {
    "controlIdentifier",
    "caseNumber",
    "bondOrCashClaimCode",
    "caseDepositRate",
    "caseRateTypeQualifierCode",
    "adOrCvdValueOfGoodsAmount",
    "adOrCvdQuantity",
    "adOrCvdDutyAmount",
    "adOrCvdNonReimbursementDeclarationIdentifier",
    "defaultControlIdentifier",
    "messageType",
    "endPositionOfControlIdentifier"
})
public class FiftyThreeRecordDataElement {

    @XmlElement(required = true)
    protected Position controlIdentifier;
    @XmlElement(required = true)
    protected Position caseNumber;
    @XmlElement(required = true)
    protected Position bondOrCashClaimCode;
    @XmlElement(required = true)
    protected Position caseDepositRate;
    @XmlElement(required = true)
    protected Position caseRateTypeQualifierCode;
    @XmlElement(required = true)
    protected Position adOrCvdValueOfGoodsAmount;
    @XmlElement(required = true)
    protected Position adOrCvdQuantity;
    @XmlElement(required = true)
    protected Position adOrCvdDutyAmount;
    @XmlElement(required = true)
    protected Position adOrCvdNonReimbursementDeclarationIdentifier;
    @XmlElement(defaultValue = "53")
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
     * Gets the value of the caseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getCaseNumber() {
        return caseNumber;
    }

    /**
     * Sets the value of the caseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setCaseNumber(Position value) {
        this.caseNumber = value;
    }

    /**
     * Gets the value of the bondOrCashClaimCode property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getBondOrCashClaimCode() {
        return bondOrCashClaimCode;
    }

    /**
     * Sets the value of the bondOrCashClaimCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setBondOrCashClaimCode(Position value) {
        this.bondOrCashClaimCode = value;
    }

    /**
     * Gets the value of the caseDepositRate property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getCaseDepositRate() {
        return caseDepositRate;
    }

    /**
     * Sets the value of the caseDepositRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setCaseDepositRate(Position value) {
        this.caseDepositRate = value;
    }

    /**
     * Gets the value of the caseRateTypeQualifierCode property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getCaseRateTypeQualifierCode() {
        return caseRateTypeQualifierCode;
    }

    /**
     * Sets the value of the caseRateTypeQualifierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setCaseRateTypeQualifierCode(Position value) {
        this.caseRateTypeQualifierCode = value;
    }

    /**
     * Gets the value of the adOrCvdValueOfGoodsAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getAdOrCvdValueOfGoodsAmount() {
        return adOrCvdValueOfGoodsAmount;
    }

    /**
     * Sets the value of the adOrCvdValueOfGoodsAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setAdOrCvdValueOfGoodsAmount(Position value) {
        this.adOrCvdValueOfGoodsAmount = value;
    }

    /**
     * Gets the value of the adOrCvdQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getAdOrCvdQuantity() {
        return adOrCvdQuantity;
    }

    /**
     * Sets the value of the adOrCvdQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setAdOrCvdQuantity(Position value) {
        this.adOrCvdQuantity = value;
    }

    /**
     * Gets the value of the adOrCvdDutyAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getAdOrCvdDutyAmount() {
        return adOrCvdDutyAmount;
    }

    /**
     * Sets the value of the adOrCvdDutyAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setAdOrCvdDutyAmount(Position value) {
        this.adOrCvdDutyAmount = value;
    }

    /**
     * Gets the value of the adOrCvdNonReimbursementDeclarationIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getAdOrCvdNonReimbursementDeclarationIdentifier() {
        return adOrCvdNonReimbursementDeclarationIdentifier;
    }

    /**
     * Sets the value of the adOrCvdNonReimbursementDeclarationIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setAdOrCvdNonReimbursementDeclarationIdentifier(Position value) {
        this.adOrCvdNonReimbursementDeclarationIdentifier = value;
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
