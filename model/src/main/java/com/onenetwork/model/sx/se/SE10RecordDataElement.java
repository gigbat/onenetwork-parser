//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.22 at 07:16:43 PM EEST 
//


package com.onenetwork.model.sx.se;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.onenetwork.model.position.Position;


/**
 * <p>Java class for SE10RecordDataElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SE10RecordDataElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="controlIdentifier" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="updateActionCode" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="entryFilerCode" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="entryNumber" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="entryType" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="importerOfRecordType" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="importerOfRecord" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="modeOfTransportationCode" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="bondTypeCode" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="estimatedEntryValue" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="plannedPortOfEntry" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="splitShipmentReleaseCode" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="portOfUnlading" type="{http://www.model.onenetwork.com/position}Position"/&gt;
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
@XmlType(name = "SE10RecordDataElement", propOrder = {
    "controlIdentifier",
    "updateActionCode",
    "entryFilerCode",
    "entryNumber",
    "entryType",
    "importerOfRecordType",
    "importerOfRecord",
    "modeOfTransportationCode",
    "bondTypeCode",
    "estimatedEntryValue",
    "plannedPortOfEntry",
    "splitShipmentReleaseCode",
    "portOfUnlading",
    "defaultControlIdentifier",
    "messageType",
    "endPositionOfControlIdentifier"
})
public class SE10RecordDataElement {

    @XmlElement(required = true)
    protected Position controlIdentifier;
    @XmlElement(required = true)
    protected Position updateActionCode;
    @XmlElement(required = true)
    protected Position entryFilerCode;
    @XmlElement(required = true)
    protected Position entryNumber;
    @XmlElement(required = true)
    protected Position entryType;
    @XmlElement(required = true)
    protected Position importerOfRecordType;
    @XmlElement(required = true)
    protected Position importerOfRecord;
    @XmlElement(required = true)
    protected Position modeOfTransportationCode;
    @XmlElement(required = true)
    protected Position bondTypeCode;
    @XmlElement(required = true)
    protected Position estimatedEntryValue;
    @XmlElement(required = true)
    protected Position plannedPortOfEntry;
    @XmlElement(required = true)
    protected Position splitShipmentReleaseCode;
    @XmlElement(required = true)
    protected Position portOfUnlading;
    @XmlElement(defaultValue = "SE10")
    protected String defaultControlIdentifier;
    @XmlElement(defaultValue = "SX")
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
     * Gets the value of the updateActionCode property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getUpdateActionCode() {
        return updateActionCode;
    }

    /**
     * Sets the value of the updateActionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setUpdateActionCode(Position value) {
        this.updateActionCode = value;
    }

    /**
     * Gets the value of the entryFilerCode property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getEntryFilerCode() {
        return entryFilerCode;
    }

    /**
     * Sets the value of the entryFilerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setEntryFilerCode(Position value) {
        this.entryFilerCode = value;
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
     * Gets the value of the importerOfRecordType property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getImporterOfRecordType() {
        return importerOfRecordType;
    }

    /**
     * Sets the value of the importerOfRecordType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setImporterOfRecordType(Position value) {
        this.importerOfRecordType = value;
    }

    /**
     * Gets the value of the importerOfRecord property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getImporterOfRecord() {
        return importerOfRecord;
    }

    /**
     * Sets the value of the importerOfRecord property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setImporterOfRecord(Position value) {
        this.importerOfRecord = value;
    }

    /**
     * Gets the value of the modeOfTransportationCode property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getModeOfTransportationCode() {
        return modeOfTransportationCode;
    }

    /**
     * Sets the value of the modeOfTransportationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setModeOfTransportationCode(Position value) {
        this.modeOfTransportationCode = value;
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
     * Gets the value of the estimatedEntryValue property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getEstimatedEntryValue() {
        return estimatedEntryValue;
    }

    /**
     * Sets the value of the estimatedEntryValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setEstimatedEntryValue(Position value) {
        this.estimatedEntryValue = value;
    }

    /**
     * Gets the value of the plannedPortOfEntry property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getPlannedPortOfEntry() {
        return plannedPortOfEntry;
    }

    /**
     * Sets the value of the plannedPortOfEntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setPlannedPortOfEntry(Position value) {
        this.plannedPortOfEntry = value;
    }

    /**
     * Gets the value of the splitShipmentReleaseCode property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getSplitShipmentReleaseCode() {
        return splitShipmentReleaseCode;
    }

    /**
     * Sets the value of the splitShipmentReleaseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setSplitShipmentReleaseCode(Position value) {
        this.splitShipmentReleaseCode = value;
    }

    /**
     * Gets the value of the portOfUnlading property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getPortOfUnlading() {
        return portOfUnlading;
    }

    /**
     * Sets the value of the portOfUnlading property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setPortOfUnlading(Position value) {
        this.portOfUnlading = value;
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
