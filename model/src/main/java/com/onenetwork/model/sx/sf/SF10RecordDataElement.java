//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.22 at 02:06:22 PM EEST 
//


package com.onenetwork.model.sx.sf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.onenetwork.model.position.Position;


/**
 * <p>Java class for SF10RecordDataElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SF10RecordDataElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="controlIdentifier" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="isfSubmissionType" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="shipmentTypeCode" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="actionCode" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="actionReasonCode" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="isfImporterNumberQualifier" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="isfImporterNumber" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="dateOfBirth" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="modeOfTransportationCode" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="isfTransactionNumber" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="scasIdentifier" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="bondHolder" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="bondActivityCode" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="bondType" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="countryOfIssuance" type="{http://www.model.onenetwork.com/position}Position"/&gt;
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
@XmlType(name = "SF10RecordDataElement", propOrder = {
    "controlIdentifier",
    "isfSubmissionType",
    "shipmentTypeCode",
    "actionCode",
    "actionReasonCode",
    "isfImporterNumberQualifier",
    "isfImporterNumber",
    "dateOfBirth",
    "modeOfTransportationCode",
    "isfTransactionNumber",
    "scasIdentifier",
    "bondHolder",
    "bondActivityCode",
    "bondType",
    "countryOfIssuance",
    "defaultControlIdentifier",
    "messageType"
})
public class SF10RecordDataElement {

    @XmlElement(required = true)
    protected Position controlIdentifier;
    @XmlElement(required = true)
    protected Position isfSubmissionType;
    @XmlElement(required = true)
    protected Position shipmentTypeCode;
    @XmlElement(required = true)
    protected Position actionCode;
    @XmlElement(required = true)
    protected Position actionReasonCode;
    @XmlElement(required = true)
    protected Position isfImporterNumberQualifier;
    @XmlElement(required = true)
    protected Position isfImporterNumber;
    @XmlElement(required = true)
    protected Position dateOfBirth;
    @XmlElement(required = true)
    protected Position modeOfTransportationCode;
    @XmlElement(required = true)
    protected Position isfTransactionNumber;
    @XmlElement(required = true)
    protected Position scasIdentifier;
    @XmlElement(required = true)
    protected Position bondHolder;
    @XmlElement(required = true)
    protected Position bondActivityCode;
    @XmlElement(required = true)
    protected Position bondType;
    @XmlElement(required = true)
    protected Position countryOfIssuance;
    @XmlElement(defaultValue = "SF10")
    protected String defaultControlIdentifier;
    @XmlElement(defaultValue = "SX")
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
     * Gets the value of the isfSubmissionType property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getIsfSubmissionType() {
        return isfSubmissionType;
    }

    /**
     * Sets the value of the isfSubmissionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setIsfSubmissionType(Position value) {
        this.isfSubmissionType = value;
    }

    /**
     * Gets the value of the shipmentTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getShipmentTypeCode() {
        return shipmentTypeCode;
    }

    /**
     * Sets the value of the shipmentTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setShipmentTypeCode(Position value) {
        this.shipmentTypeCode = value;
    }

    /**
     * Gets the value of the actionCode property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getActionCode() {
        return actionCode;
    }

    /**
     * Sets the value of the actionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setActionCode(Position value) {
        this.actionCode = value;
    }

    /**
     * Gets the value of the actionReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getActionReasonCode() {
        return actionReasonCode;
    }

    /**
     * Sets the value of the actionReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setActionReasonCode(Position value) {
        this.actionReasonCode = value;
    }

    /**
     * Gets the value of the isfImporterNumberQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getIsfImporterNumberQualifier() {
        return isfImporterNumberQualifier;
    }

    /**
     * Sets the value of the isfImporterNumberQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setIsfImporterNumberQualifier(Position value) {
        this.isfImporterNumberQualifier = value;
    }

    /**
     * Gets the value of the isfImporterNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getIsfImporterNumber() {
        return isfImporterNumber;
    }

    /**
     * Sets the value of the isfImporterNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setIsfImporterNumber(Position value) {
        this.isfImporterNumber = value;
    }

    /**
     * Gets the value of the dateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setDateOfBirth(Position value) {
        this.dateOfBirth = value;
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
     * Gets the value of the isfTransactionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getIsfTransactionNumber() {
        return isfTransactionNumber;
    }

    /**
     * Sets the value of the isfTransactionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setIsfTransactionNumber(Position value) {
        this.isfTransactionNumber = value;
    }

    /**
     * Gets the value of the scasIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getScasIdentifier() {
        return scasIdentifier;
    }

    /**
     * Sets the value of the scasIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setScasIdentifier(Position value) {
        this.scasIdentifier = value;
    }

    /**
     * Gets the value of the bondHolder property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getBondHolder() {
        return bondHolder;
    }

    /**
     * Sets the value of the bondHolder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setBondHolder(Position value) {
        this.bondHolder = value;
    }

    /**
     * Gets the value of the bondActivityCode property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getBondActivityCode() {
        return bondActivityCode;
    }

    /**
     * Sets the value of the bondActivityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setBondActivityCode(Position value) {
        this.bondActivityCode = value;
    }

    /**
     * Gets the value of the bondType property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getBondType() {
        return bondType;
    }

    /**
     * Sets the value of the bondType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setBondType(Position value) {
        this.bondType = value;
    }

    /**
     * Gets the value of the countryOfIssuance property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getCountryOfIssuance() {
        return countryOfIssuance;
    }

    /**
     * Sets the value of the countryOfIssuance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setCountryOfIssuance(Position value) {
        this.countryOfIssuance = value;
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
