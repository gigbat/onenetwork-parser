//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.22 at 01:53:37 PM EEST 
//


package com.onenetwork.model.nr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.onenetwork.model.position.Position;


/**
 * <p>Java class for N2RecordDataElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="N2RecordDataElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="controlIdentifier" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="recordType" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="districtOrPortOfEntryOrSummary" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="brokerNumberOrEntryFilerCode" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="entryNumber" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="liquidationDate" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="liquidationReasonCode" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="brokerReferenceNumber" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="liquidationType" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="entryDate" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="totalPaidAntidumpingDuty" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="interestAmount" type="{http://www.model.onenetwork.com/position}Position"/&gt;
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
@XmlType(name = "N2RecordDataElement", propOrder = {
    "controlIdentifier",
    "recordType",
    "districtOrPortOfEntryOrSummary",
    "brokerNumberOrEntryFilerCode",
    "entryNumber",
    "liquidationDate",
    "liquidationReasonCode",
    "brokerReferenceNumber",
    "liquidationType",
    "entryDate",
    "totalPaidAntidumpingDuty",
    "interestAmount",
    "defaultControlIdentifier",
    "messageType"
})
public class N2RecordDataElement {

    @XmlElement(required = true)
    protected Position controlIdentifier;
    @XmlElement(required = true)
    protected Position recordType;
    @XmlElement(required = true)
    protected Position districtOrPortOfEntryOrSummary;
    @XmlElement(required = true)
    protected Position brokerNumberOrEntryFilerCode;
    @XmlElement(required = true)
    protected Position entryNumber;
    @XmlElement(required = true)
    protected Position liquidationDate;
    @XmlElement(required = true)
    protected Position liquidationReasonCode;
    @XmlElement(required = true)
    protected Position brokerReferenceNumber;
    @XmlElement(required = true)
    protected Position liquidationType;
    @XmlElement(required = true)
    protected Position entryDate;
    @XmlElement(required = true)
    protected Position totalPaidAntidumpingDuty;
    @XmlElement(required = true)
    protected Position interestAmount;
    @XmlElement(defaultValue = "N2")
    protected String defaultControlIdentifier;
    @XmlElement(defaultValue = "NR")
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
     * Gets the value of the recordType property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getRecordType() {
        return recordType;
    }

    /**
     * Sets the value of the recordType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setRecordType(Position value) {
        this.recordType = value;
    }

    /**
     * Gets the value of the districtOrPortOfEntryOrSummary property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getDistrictOrPortOfEntryOrSummary() {
        return districtOrPortOfEntryOrSummary;
    }

    /**
     * Sets the value of the districtOrPortOfEntryOrSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setDistrictOrPortOfEntryOrSummary(Position value) {
        this.districtOrPortOfEntryOrSummary = value;
    }

    /**
     * Gets the value of the brokerNumberOrEntryFilerCode property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getBrokerNumberOrEntryFilerCode() {
        return brokerNumberOrEntryFilerCode;
    }

    /**
     * Sets the value of the brokerNumberOrEntryFilerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setBrokerNumberOrEntryFilerCode(Position value) {
        this.brokerNumberOrEntryFilerCode = value;
    }

    /**
     * Gets the value of the entryNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getEntryNumber() {
        return entryNumber;
    }

    /**
     * Sets the value of the entryNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setEntryNumber(Position value) {
        this.entryNumber = value;
    }

    /**
     * Gets the value of the liquidationDate property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getLiquidationDate() {
        return liquidationDate;
    }

    /**
     * Sets the value of the liquidationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setLiquidationDate(Position value) {
        this.liquidationDate = value;
    }

    /**
     * Gets the value of the liquidationReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getLiquidationReasonCode() {
        return liquidationReasonCode;
    }

    /**
     * Sets the value of the liquidationReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setLiquidationReasonCode(Position value) {
        this.liquidationReasonCode = value;
    }

    /**
     * Gets the value of the brokerReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getBrokerReferenceNumber() {
        return brokerReferenceNumber;
    }

    /**
     * Sets the value of the brokerReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setBrokerReferenceNumber(Position value) {
        this.brokerReferenceNumber = value;
    }

    /**
     * Gets the value of the liquidationType property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getLiquidationType() {
        return liquidationType;
    }

    /**
     * Sets the value of the liquidationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setLiquidationType(Position value) {
        this.liquidationType = value;
    }

    /**
     * Gets the value of the entryDate property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getEntryDate() {
        return entryDate;
    }

    /**
     * Sets the value of the entryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setEntryDate(Position value) {
        this.entryDate = value;
    }

    /**
     * Gets the value of the totalPaidAntidumpingDuty property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getTotalPaidAntidumpingDuty() {
        return totalPaidAntidumpingDuty;
    }

    /**
     * Sets the value of the totalPaidAntidumpingDuty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setTotalPaidAntidumpingDuty(Position value) {
        this.totalPaidAntidumpingDuty = value;
    }

    /**
     * Gets the value of the interestAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getInterestAmount() {
        return interestAmount;
    }

    /**
     * Sets the value of the interestAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setInterestAmount(Position value) {
        this.interestAmount = value;
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
