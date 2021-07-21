//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.21 at 03:53:23 PM EEST 
//


package com.onenetwork.model.so;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.onenetwork.model.position.Position;


/**
 * <p>Java class for SO71RecordDataElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SO71RecordDataElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="controlIdentifier" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="pgaReferenceIdentificationNumberQualifier" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="pgaReferenceIdentificationNumberFirst" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="pgaReferenceIdentificationNumberReceiptDate" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="pgaReferenceIdentificationNumberReceiptTime" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="pgaLineSubReasonCodeFirst" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="pgaLineSubReasonCodeSecond" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="pgaLineSubReasonCodeThird" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="pgaLineSubReasonCodeFourth" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="pgaLineSubReasonCodeFifth" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="pgaLineSubReasonCodeSixth" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="pgaLineSubReasonCodeSeventh" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="pgaLineSubReasonCodeEighth" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="pgaLineSubReasonCodeNinth" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="pgaLineSubReasonCodeTenth" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="pgaLineSubReasonCodeEleventh" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="pgaReferenceIdentificationNumberSecond" type="{http://www.model.onenetwork.com/position}Position"/&gt;
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
@XmlType(name = "SO71RecordDataElement", propOrder = {
    "controlIdentifier",
    "pgaReferenceIdentificationNumberQualifier",
    "pgaReferenceIdentificationNumberFirst",
    "pgaReferenceIdentificationNumberReceiptDate",
    "pgaReferenceIdentificationNumberReceiptTime",
    "pgaLineSubReasonCodeFirst",
    "pgaLineSubReasonCodeSecond",
    "pgaLineSubReasonCodeThird",
    "pgaLineSubReasonCodeFourth",
    "pgaLineSubReasonCodeFifth",
    "pgaLineSubReasonCodeSixth",
    "pgaLineSubReasonCodeSeventh",
    "pgaLineSubReasonCodeEighth",
    "pgaLineSubReasonCodeNinth",
    "pgaLineSubReasonCodeTenth",
    "pgaLineSubReasonCodeEleventh",
    "pgaReferenceIdentificationNumberSecond",
    "defaultControlIdentifier",
    "messageType"
})
public class SO71RecordDataElement {

    @XmlElement(required = true)
    protected Position controlIdentifier;
    @XmlElement(required = true)
    protected Position pgaReferenceIdentificationNumberQualifier;
    @XmlElement(required = true)
    protected Position pgaReferenceIdentificationNumberFirst;
    @XmlElement(required = true)
    protected Position pgaReferenceIdentificationNumberReceiptDate;
    @XmlElement(required = true)
    protected Position pgaReferenceIdentificationNumberReceiptTime;
    @XmlElement(required = true)
    protected Position pgaLineSubReasonCodeFirst;
    @XmlElement(required = true)
    protected Position pgaLineSubReasonCodeSecond;
    @XmlElement(required = true)
    protected Position pgaLineSubReasonCodeThird;
    @XmlElement(required = true)
    protected Position pgaLineSubReasonCodeFourth;
    @XmlElement(required = true)
    protected Position pgaLineSubReasonCodeFifth;
    @XmlElement(required = true)
    protected Position pgaLineSubReasonCodeSixth;
    @XmlElement(required = true)
    protected Position pgaLineSubReasonCodeSeventh;
    @XmlElement(required = true)
    protected Position pgaLineSubReasonCodeEighth;
    @XmlElement(required = true)
    protected Position pgaLineSubReasonCodeNinth;
    @XmlElement(required = true)
    protected Position pgaLineSubReasonCodeTenth;
    @XmlElement(required = true)
    protected Position pgaLineSubReasonCodeEleventh;
    @XmlElement(required = true)
    protected Position pgaReferenceIdentificationNumberSecond;
    @XmlElement(defaultValue = "SO71")
    protected String defaultControlIdentifier;
    @XmlElement(defaultValue = "SO")
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
     * Gets the value of the pgaReferenceIdentificationNumberQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getPgaReferenceIdentificationNumberQualifier() {
        return pgaReferenceIdentificationNumberQualifier;
    }

    /**
     * Sets the value of the pgaReferenceIdentificationNumberQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setPgaReferenceIdentificationNumberQualifier(Position value) {
        this.pgaReferenceIdentificationNumberQualifier = value;
    }

    /**
     * Gets the value of the pgaReferenceIdentificationNumberFirst property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getPgaReferenceIdentificationNumberFirst() {
        return pgaReferenceIdentificationNumberFirst;
    }

    /**
     * Sets the value of the pgaReferenceIdentificationNumberFirst property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setPgaReferenceIdentificationNumberFirst(Position value) {
        this.pgaReferenceIdentificationNumberFirst = value;
    }

    /**
     * Gets the value of the pgaReferenceIdentificationNumberReceiptDate property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getPgaReferenceIdentificationNumberReceiptDate() {
        return pgaReferenceIdentificationNumberReceiptDate;
    }

    /**
     * Sets the value of the pgaReferenceIdentificationNumberReceiptDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setPgaReferenceIdentificationNumberReceiptDate(Position value) {
        this.pgaReferenceIdentificationNumberReceiptDate = value;
    }

    /**
     * Gets the value of the pgaReferenceIdentificationNumberReceiptTime property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getPgaReferenceIdentificationNumberReceiptTime() {
        return pgaReferenceIdentificationNumberReceiptTime;
    }

    /**
     * Sets the value of the pgaReferenceIdentificationNumberReceiptTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setPgaReferenceIdentificationNumberReceiptTime(Position value) {
        this.pgaReferenceIdentificationNumberReceiptTime = value;
    }

    /**
     * Gets the value of the pgaLineSubReasonCodeFirst property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getPgaLineSubReasonCodeFirst() {
        return pgaLineSubReasonCodeFirst;
    }

    /**
     * Sets the value of the pgaLineSubReasonCodeFirst property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setPgaLineSubReasonCodeFirst(Position value) {
        this.pgaLineSubReasonCodeFirst = value;
    }

    /**
     * Gets the value of the pgaLineSubReasonCodeSecond property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getPgaLineSubReasonCodeSecond() {
        return pgaLineSubReasonCodeSecond;
    }

    /**
     * Sets the value of the pgaLineSubReasonCodeSecond property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setPgaLineSubReasonCodeSecond(Position value) {
        this.pgaLineSubReasonCodeSecond = value;
    }

    /**
     * Gets the value of the pgaLineSubReasonCodeThird property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getPgaLineSubReasonCodeThird() {
        return pgaLineSubReasonCodeThird;
    }

    /**
     * Sets the value of the pgaLineSubReasonCodeThird property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setPgaLineSubReasonCodeThird(Position value) {
        this.pgaLineSubReasonCodeThird = value;
    }

    /**
     * Gets the value of the pgaLineSubReasonCodeFourth property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getPgaLineSubReasonCodeFourth() {
        return pgaLineSubReasonCodeFourth;
    }

    /**
     * Sets the value of the pgaLineSubReasonCodeFourth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setPgaLineSubReasonCodeFourth(Position value) {
        this.pgaLineSubReasonCodeFourth = value;
    }

    /**
     * Gets the value of the pgaLineSubReasonCodeFifth property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getPgaLineSubReasonCodeFifth() {
        return pgaLineSubReasonCodeFifth;
    }

    /**
     * Sets the value of the pgaLineSubReasonCodeFifth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setPgaLineSubReasonCodeFifth(Position value) {
        this.pgaLineSubReasonCodeFifth = value;
    }

    /**
     * Gets the value of the pgaLineSubReasonCodeSixth property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getPgaLineSubReasonCodeSixth() {
        return pgaLineSubReasonCodeSixth;
    }

    /**
     * Sets the value of the pgaLineSubReasonCodeSixth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setPgaLineSubReasonCodeSixth(Position value) {
        this.pgaLineSubReasonCodeSixth = value;
    }

    /**
     * Gets the value of the pgaLineSubReasonCodeSeventh property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getPgaLineSubReasonCodeSeventh() {
        return pgaLineSubReasonCodeSeventh;
    }

    /**
     * Sets the value of the pgaLineSubReasonCodeSeventh property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setPgaLineSubReasonCodeSeventh(Position value) {
        this.pgaLineSubReasonCodeSeventh = value;
    }

    /**
     * Gets the value of the pgaLineSubReasonCodeEighth property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getPgaLineSubReasonCodeEighth() {
        return pgaLineSubReasonCodeEighth;
    }

    /**
     * Sets the value of the pgaLineSubReasonCodeEighth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setPgaLineSubReasonCodeEighth(Position value) {
        this.pgaLineSubReasonCodeEighth = value;
    }

    /**
     * Gets the value of the pgaLineSubReasonCodeNinth property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getPgaLineSubReasonCodeNinth() {
        return pgaLineSubReasonCodeNinth;
    }

    /**
     * Sets the value of the pgaLineSubReasonCodeNinth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setPgaLineSubReasonCodeNinth(Position value) {
        this.pgaLineSubReasonCodeNinth = value;
    }

    /**
     * Gets the value of the pgaLineSubReasonCodeTenth property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getPgaLineSubReasonCodeTenth() {
        return pgaLineSubReasonCodeTenth;
    }

    /**
     * Sets the value of the pgaLineSubReasonCodeTenth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setPgaLineSubReasonCodeTenth(Position value) {
        this.pgaLineSubReasonCodeTenth = value;
    }

    /**
     * Gets the value of the pgaLineSubReasonCodeEleventh property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getPgaLineSubReasonCodeEleventh() {
        return pgaLineSubReasonCodeEleventh;
    }

    /**
     * Sets the value of the pgaLineSubReasonCodeEleventh property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setPgaLineSubReasonCodeEleventh(Position value) {
        this.pgaLineSubReasonCodeEleventh = value;
    }

    /**
     * Gets the value of the pgaReferenceIdentificationNumberSecond property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getPgaReferenceIdentificationNumberSecond() {
        return pgaReferenceIdentificationNumberSecond;
    }

    /**
     * Sets the value of the pgaReferenceIdentificationNumberSecond property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setPgaReferenceIdentificationNumberSecond(Position value) {
        this.pgaReferenceIdentificationNumberSecond = value;
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
