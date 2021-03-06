//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.22 at 07:16:43 PM EEST 
//


package com.onenetwork.model.nr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.onenetwork.model.position.Position;


/**
 * <p>Java class for N4RecordDataElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="N4RecordDataElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="controlIdentifier" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="recordType" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="districtOrPortOfEntryOrSummary" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="brokerNumberOrEntryFilerCode" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="entryNumber" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="totalPaidCountervailingDuty" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="totalPaidFees" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="liquidatedAntidumpingDuty" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="liquidatedCountervailingDuty" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="liquidatedFees" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="changeLiquidationReasonCodeFirst" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="changeLiquidationReasonCodeSecond" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="changeLiquidationReasonCodeThird" type="{http://www.model.onenetwork.com/position}Position"/&gt;
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
@XmlType(name = "N4RecordDataElement", propOrder = {
    "controlIdentifier",
    "recordType",
    "districtOrPortOfEntryOrSummary",
    "brokerNumberOrEntryFilerCode",
    "entryNumber",
    "totalPaidCountervailingDuty",
    "totalPaidFees",
    "liquidatedAntidumpingDuty",
    "liquidatedCountervailingDuty",
    "liquidatedFees",
    "changeLiquidationReasonCodeFirst",
    "changeLiquidationReasonCodeSecond",
    "changeLiquidationReasonCodeThird",
    "defaultControlIdentifier",
    "messageType",
    "endPositionOfControlIdentifier"
})
public class N4RecordDataElement {

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
    protected Position totalPaidCountervailingDuty;
    @XmlElement(required = true)
    protected Position totalPaidFees;
    @XmlElement(required = true)
    protected Position liquidatedAntidumpingDuty;
    @XmlElement(required = true)
    protected Position liquidatedCountervailingDuty;
    @XmlElement(required = true)
    protected Position liquidatedFees;
    @XmlElement(required = true)
    protected Position changeLiquidationReasonCodeFirst;
    @XmlElement(required = true)
    protected Position changeLiquidationReasonCodeSecond;
    @XmlElement(required = true)
    protected Position changeLiquidationReasonCodeThird;
    @XmlElement(defaultValue = "N4")
    protected String defaultControlIdentifier;
    @XmlElement(defaultValue = "NR")
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
     * Gets the value of the totalPaidCountervailingDuty property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getTotalPaidCountervailingDuty() {
        return totalPaidCountervailingDuty;
    }

    /**
     * Sets the value of the totalPaidCountervailingDuty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setTotalPaidCountervailingDuty(Position value) {
        this.totalPaidCountervailingDuty = value;
    }

    /**
     * Gets the value of the totalPaidFees property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getTotalPaidFees() {
        return totalPaidFees;
    }

    /**
     * Sets the value of the totalPaidFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setTotalPaidFees(Position value) {
        this.totalPaidFees = value;
    }

    /**
     * Gets the value of the liquidatedAntidumpingDuty property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getLiquidatedAntidumpingDuty() {
        return liquidatedAntidumpingDuty;
    }

    /**
     * Sets the value of the liquidatedAntidumpingDuty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setLiquidatedAntidumpingDuty(Position value) {
        this.liquidatedAntidumpingDuty = value;
    }

    /**
     * Gets the value of the liquidatedCountervailingDuty property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getLiquidatedCountervailingDuty() {
        return liquidatedCountervailingDuty;
    }

    /**
     * Sets the value of the liquidatedCountervailingDuty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setLiquidatedCountervailingDuty(Position value) {
        this.liquidatedCountervailingDuty = value;
    }

    /**
     * Gets the value of the liquidatedFees property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getLiquidatedFees() {
        return liquidatedFees;
    }

    /**
     * Sets the value of the liquidatedFees property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setLiquidatedFees(Position value) {
        this.liquidatedFees = value;
    }

    /**
     * Gets the value of the changeLiquidationReasonCodeFirst property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getChangeLiquidationReasonCodeFirst() {
        return changeLiquidationReasonCodeFirst;
    }

    /**
     * Sets the value of the changeLiquidationReasonCodeFirst property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setChangeLiquidationReasonCodeFirst(Position value) {
        this.changeLiquidationReasonCodeFirst = value;
    }

    /**
     * Gets the value of the changeLiquidationReasonCodeSecond property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getChangeLiquidationReasonCodeSecond() {
        return changeLiquidationReasonCodeSecond;
    }

    /**
     * Sets the value of the changeLiquidationReasonCodeSecond property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setChangeLiquidationReasonCodeSecond(Position value) {
        this.changeLiquidationReasonCodeSecond = value;
    }

    /**
     * Gets the value of the changeLiquidationReasonCodeThird property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getChangeLiquidationReasonCodeThird() {
        return changeLiquidationReasonCodeThird;
    }

    /**
     * Sets the value of the changeLiquidationReasonCodeThird property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setChangeLiquidationReasonCodeThird(Position value) {
        this.changeLiquidationReasonCodeThird = value;
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
