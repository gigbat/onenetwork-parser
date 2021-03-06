//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.22 at 07:16:43 PM EEST 
//


package com.onenetwork.model.so;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.onenetwork.model.position.Position;


/**
 * <p>Java class for SO70RecordDataElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SO70RecordDataElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="controlIdentifier" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="governmentAgencyCode" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="governmentAgencyProgramCode" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="statusActionDate" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="statusActionTime" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="pgaEntryLevelStatusCode" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="pgaEntryLevelStatusMessage" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="entryLineLevelStatusCode" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="pgaLineLevelStatusCode" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="statusReasonCode" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="beginningCbpLine" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="beginningTariffPosition" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="beginningPgaLine" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="endingCbpLine" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="endingTariffPosition" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="endingPgaLine" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="documentTypeCode" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="pgaEntryHoldType" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="pgaProcessingGroupVersion" type="{http://www.model.onenetwork.com/position}Position"/&gt;
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
@XmlType(name = "SO70RecordDataElement", propOrder = {
    "controlIdentifier",
    "governmentAgencyCode",
    "governmentAgencyProgramCode",
    "statusActionDate",
    "statusActionTime",
    "pgaEntryLevelStatusCode",
    "pgaEntryLevelStatusMessage",
    "entryLineLevelStatusCode",
    "pgaLineLevelStatusCode",
    "statusReasonCode",
    "beginningCbpLine",
    "beginningTariffPosition",
    "beginningPgaLine",
    "endingCbpLine",
    "endingTariffPosition",
    "endingPgaLine",
    "documentTypeCode",
    "pgaEntryHoldType",
    "pgaProcessingGroupVersion",
    "defaultControlIdentifier",
    "messageType",
    "endPositionOfControlIdentifier"
})
public class SO70RecordDataElement {

    @XmlElement(required = true)
    protected Position controlIdentifier;
    @XmlElement(required = true)
    protected Position governmentAgencyCode;
    @XmlElement(required = true)
    protected Position governmentAgencyProgramCode;
    @XmlElement(required = true)
    protected Position statusActionDate;
    @XmlElement(required = true)
    protected Position statusActionTime;
    @XmlElement(required = true)
    protected Position pgaEntryLevelStatusCode;
    @XmlElement(required = true)
    protected Position pgaEntryLevelStatusMessage;
    @XmlElement(required = true)
    protected Position entryLineLevelStatusCode;
    @XmlElement(required = true)
    protected Position pgaLineLevelStatusCode;
    @XmlElement(required = true)
    protected Position statusReasonCode;
    @XmlElement(required = true)
    protected Position beginningCbpLine;
    @XmlElement(required = true)
    protected Position beginningTariffPosition;
    @XmlElement(required = true)
    protected Position beginningPgaLine;
    @XmlElement(required = true)
    protected Position endingCbpLine;
    @XmlElement(required = true)
    protected Position endingTariffPosition;
    @XmlElement(required = true)
    protected Position endingPgaLine;
    @XmlElement(required = true)
    protected Position documentTypeCode;
    @XmlElement(required = true)
    protected Position pgaEntryHoldType;
    @XmlElement(required = true)
    protected Position pgaProcessingGroupVersion;
    @XmlElement(defaultValue = "SO70")
    protected String defaultControlIdentifier;
    @XmlElement(defaultValue = "SO")
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
     * Gets the value of the governmentAgencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getGovernmentAgencyCode() {
        return governmentAgencyCode;
    }

    /**
     * Sets the value of the governmentAgencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setGovernmentAgencyCode(Position value) {
        this.governmentAgencyCode = value;
    }

    /**
     * Gets the value of the governmentAgencyProgramCode property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getGovernmentAgencyProgramCode() {
        return governmentAgencyProgramCode;
    }

    /**
     * Sets the value of the governmentAgencyProgramCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setGovernmentAgencyProgramCode(Position value) {
        this.governmentAgencyProgramCode = value;
    }

    /**
     * Gets the value of the statusActionDate property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getStatusActionDate() {
        return statusActionDate;
    }

    /**
     * Sets the value of the statusActionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setStatusActionDate(Position value) {
        this.statusActionDate = value;
    }

    /**
     * Gets the value of the statusActionTime property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getStatusActionTime() {
        return statusActionTime;
    }

    /**
     * Sets the value of the statusActionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setStatusActionTime(Position value) {
        this.statusActionTime = value;
    }

    /**
     * Gets the value of the pgaEntryLevelStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getPgaEntryLevelStatusCode() {
        return pgaEntryLevelStatusCode;
    }

    /**
     * Sets the value of the pgaEntryLevelStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setPgaEntryLevelStatusCode(Position value) {
        this.pgaEntryLevelStatusCode = value;
    }

    /**
     * Gets the value of the pgaEntryLevelStatusMessage property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getPgaEntryLevelStatusMessage() {
        return pgaEntryLevelStatusMessage;
    }

    /**
     * Sets the value of the pgaEntryLevelStatusMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setPgaEntryLevelStatusMessage(Position value) {
        this.pgaEntryLevelStatusMessage = value;
    }

    /**
     * Gets the value of the entryLineLevelStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getEntryLineLevelStatusCode() {
        return entryLineLevelStatusCode;
    }

    /**
     * Sets the value of the entryLineLevelStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setEntryLineLevelStatusCode(Position value) {
        this.entryLineLevelStatusCode = value;
    }

    /**
     * Gets the value of the pgaLineLevelStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getPgaLineLevelStatusCode() {
        return pgaLineLevelStatusCode;
    }

    /**
     * Sets the value of the pgaLineLevelStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setPgaLineLevelStatusCode(Position value) {
        this.pgaLineLevelStatusCode = value;
    }

    /**
     * Gets the value of the statusReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getStatusReasonCode() {
        return statusReasonCode;
    }

    /**
     * Sets the value of the statusReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setStatusReasonCode(Position value) {
        this.statusReasonCode = value;
    }

    /**
     * Gets the value of the beginningCbpLine property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getBeginningCbpLine() {
        return beginningCbpLine;
    }

    /**
     * Sets the value of the beginningCbpLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setBeginningCbpLine(Position value) {
        this.beginningCbpLine = value;
    }

    /**
     * Gets the value of the beginningTariffPosition property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getBeginningTariffPosition() {
        return beginningTariffPosition;
    }

    /**
     * Sets the value of the beginningTariffPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setBeginningTariffPosition(Position value) {
        this.beginningTariffPosition = value;
    }

    /**
     * Gets the value of the beginningPgaLine property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getBeginningPgaLine() {
        return beginningPgaLine;
    }

    /**
     * Sets the value of the beginningPgaLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setBeginningPgaLine(Position value) {
        this.beginningPgaLine = value;
    }

    /**
     * Gets the value of the endingCbpLine property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getEndingCbpLine() {
        return endingCbpLine;
    }

    /**
     * Sets the value of the endingCbpLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setEndingCbpLine(Position value) {
        this.endingCbpLine = value;
    }

    /**
     * Gets the value of the endingTariffPosition property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getEndingTariffPosition() {
        return endingTariffPosition;
    }

    /**
     * Sets the value of the endingTariffPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setEndingTariffPosition(Position value) {
        this.endingTariffPosition = value;
    }

    /**
     * Gets the value of the endingPgaLine property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getEndingPgaLine() {
        return endingPgaLine;
    }

    /**
     * Sets the value of the endingPgaLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setEndingPgaLine(Position value) {
        this.endingPgaLine = value;
    }

    /**
     * Gets the value of the documentTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getDocumentTypeCode() {
        return documentTypeCode;
    }

    /**
     * Sets the value of the documentTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setDocumentTypeCode(Position value) {
        this.documentTypeCode = value;
    }

    /**
     * Gets the value of the pgaEntryHoldType property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getPgaEntryHoldType() {
        return pgaEntryHoldType;
    }

    /**
     * Sets the value of the pgaEntryHoldType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setPgaEntryHoldType(Position value) {
        this.pgaEntryHoldType = value;
    }

    /**
     * Gets the value of the pgaProcessingGroupVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getPgaProcessingGroupVersion() {
        return pgaProcessingGroupVersion;
    }

    /**
     * Sets the value of the pgaProcessingGroupVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setPgaProcessingGroupVersion(Position value) {
        this.pgaProcessingGroupVersion = value;
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
