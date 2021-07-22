//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.22 at 07:03:31 PM EEST 
//


package com.onenetwork.model.nr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.onenetwork.model.position.Position;


/**
 * <p>Java class for N1RecordDataElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="N1RecordDataElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="controlIdentifier" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="recordType" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="districtOrPortOfEntryOrSummary" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="brokerNumberOrEntryFilerCode" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="entryNumber" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="entryType" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="importerOfRecordNumber" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="totalPaidDuty" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="totalPaidTax" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="liquidatedDuty" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="liquidatedTax" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="negativeInterestAmountIndicator" type="{http://www.model.onenetwork.com/position}Position"/&gt;
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
@XmlType(name = "N1RecordDataElement", propOrder = {
    "controlIdentifier",
    "recordType",
    "districtOrPortOfEntryOrSummary",
    "brokerNumberOrEntryFilerCode",
    "entryNumber",
    "entryType",
    "importerOfRecordNumber",
    "totalPaidDuty",
    "totalPaidTax",
    "liquidatedDuty",
    "liquidatedTax",
    "negativeInterestAmountIndicator",
    "defaultControlIdentifier",
    "messageType",
    "endPositionOfControlIdentifier"
})
public class N1RecordDataElement {

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
    protected Position entryType;
    @XmlElement(required = true)
    protected Position importerOfRecordNumber;
    @XmlElement(required = true)
    protected Position totalPaidDuty;
    @XmlElement(required = true)
    protected Position totalPaidTax;
    @XmlElement(required = true)
    protected Position liquidatedDuty;
    @XmlElement(required = true)
    protected Position liquidatedTax;
    @XmlElement(required = true)
    protected Position negativeInterestAmountIndicator;
    @XmlElement(defaultValue = "N1")
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
     * Gets the value of the entryType property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getEntryType() {
        return entryType;
    }

    /**
     * Sets the value of the entryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setEntryType(Position value) {
        this.entryType = value;
    }

    /**
     * Gets the value of the importerOfRecordNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getImporterOfRecordNumber() {
        return importerOfRecordNumber;
    }

    /**
     * Sets the value of the importerOfRecordNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setImporterOfRecordNumber(Position value) {
        this.importerOfRecordNumber = value;
    }

    /**
     * Gets the value of the totalPaidDuty property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getTotalPaidDuty() {
        return totalPaidDuty;
    }

    /**
     * Sets the value of the totalPaidDuty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setTotalPaidDuty(Position value) {
        this.totalPaidDuty = value;
    }

    /**
     * Gets the value of the totalPaidTax property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getTotalPaidTax() {
        return totalPaidTax;
    }

    /**
     * Sets the value of the totalPaidTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setTotalPaidTax(Position value) {
        this.totalPaidTax = value;
    }

    /**
     * Gets the value of the liquidatedDuty property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getLiquidatedDuty() {
        return liquidatedDuty;
    }

    /**
     * Sets the value of the liquidatedDuty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setLiquidatedDuty(Position value) {
        this.liquidatedDuty = value;
    }

    /**
     * Gets the value of the liquidatedTax property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getLiquidatedTax() {
        return liquidatedTax;
    }

    /**
     * Sets the value of the liquidatedTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setLiquidatedTax(Position value) {
        this.liquidatedTax = value;
    }

    /**
     * Gets the value of the negativeInterestAmountIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getNegativeInterestAmountIndicator() {
        return negativeInterestAmountIndicator;
    }

    /**
     * Sets the value of the negativeInterestAmountIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setNegativeInterestAmountIndicator(Position value) {
        this.negativeInterestAmountIndicator = value;
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
