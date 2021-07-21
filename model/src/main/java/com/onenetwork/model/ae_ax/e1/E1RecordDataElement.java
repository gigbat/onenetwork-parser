//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.21 at 05:38:52 PM EEST 
//


package com.onenetwork.model.ae_ax.e1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.onenetwork.model.position.Position;


/**
 * <p>Java class for E1RecordDataElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="E1RecordDataElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="controlIdentifier" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="dispositionTypeCode" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="severityCode" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="conditionCode" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="reasonCode" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="narrativeText" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="entryFilerCode" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="entryFilerNumber" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="versionNumber" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="brokerReferenceNumber" type="{http://www.model.onenetwork.com/position}Position"/&gt;
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
@XmlType(name = "E1RecordDataElement", propOrder = {
    "controlIdentifier",
    "dispositionTypeCode",
    "severityCode",
    "conditionCode",
    "reasonCode",
    "narrativeText",
    "entryFilerCode",
    "entryFilerNumber",
    "versionNumber",
    "brokerReferenceNumber",
    "defaultControlIdentifier",
    "messageType"
})
public class E1RecordDataElement {

    @XmlElement(required = true)
    protected Position controlIdentifier;
    @XmlElement(required = true)
    protected Position dispositionTypeCode;
    @XmlElement(required = true)
    protected Position severityCode;
    @XmlElement(required = true)
    protected Position conditionCode;
    @XmlElement(required = true)
    protected Position reasonCode;
    @XmlElement(required = true)
    protected Position narrativeText;
    @XmlElement(required = true)
    protected Position entryFilerCode;
    @XmlElement(required = true)
    protected Position entryFilerNumber;
    @XmlElement(required = true)
    protected Position versionNumber;
    @XmlElement(required = true)
    protected Position brokerReferenceNumber;
    @XmlElement(defaultValue = "E1")
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
     * Gets the value of the dispositionTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getDispositionTypeCode() {
        return dispositionTypeCode;
    }

    /**
     * Sets the value of the dispositionTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setDispositionTypeCode(Position value) {
        this.dispositionTypeCode = value;
    }

    /**
     * Gets the value of the severityCode property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getSeverityCode() {
        return severityCode;
    }

    /**
     * Sets the value of the severityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setSeverityCode(Position value) {
        this.severityCode = value;
    }

    /**
     * Gets the value of the conditionCode property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getConditionCode() {
        return conditionCode;
    }

    /**
     * Sets the value of the conditionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setConditionCode(Position value) {
        this.conditionCode = value;
    }

    /**
     * Gets the value of the reasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getReasonCode() {
        return reasonCode;
    }

    /**
     * Sets the value of the reasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setReasonCode(Position value) {
        this.reasonCode = value;
    }

    /**
     * Gets the value of the narrativeText property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getNarrativeText() {
        return narrativeText;
    }

    /**
     * Sets the value of the narrativeText property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setNarrativeText(Position value) {
        this.narrativeText = value;
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
     * Gets the value of the entryFilerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getEntryFilerNumber() {
        return entryFilerNumber;
    }

    /**
     * Sets the value of the entryFilerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setEntryFilerNumber(Position value) {
        this.entryFilerNumber = value;
    }

    /**
     * Gets the value of the versionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getVersionNumber() {
        return versionNumber;
    }

    /**
     * Sets the value of the versionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setVersionNumber(Position value) {
        this.versionNumber = value;
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
