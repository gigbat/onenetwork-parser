//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.21 at 11:00:31 PM EEST 
//


package com.onenetwork.model.ae_ax.cw;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.onenetwork.model.position.Position;


/**
 * <p>Java class for CW02RecordDataElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CW02RecordDataElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="controlIdentifier" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="censusWarningConditionCodeFirst" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="censusWarningConditionOverrideCodeFirst" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="censusWarningConditionCodeSecond" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="censusWarningConditionOverrideCodeSecond" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="censusWarningConditionCodeThird" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="censusWarningConditionOverrideCodeThird" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="censusWarningConditionCodeFourth" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="censusWarningConditionOverrideCodeFourth" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="censusWarningConditionCodeFifth" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="censusWarningConditionOverrideCodeFifth" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="censusWarningConditionCodeSixth" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="censusWarningConditionOverrideCodeSixth" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="censusWarningConditionCodeSeventh" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="censusWarningConditionOverrideCodeSeventh" type="{http://www.model.onenetwork.com/position}Position"/&gt;
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
@XmlType(name = "CW02RecordDataElement", propOrder = {
    "controlIdentifier",
    "censusWarningConditionCodeFirst",
    "censusWarningConditionOverrideCodeFirst",
    "censusWarningConditionCodeSecond",
    "censusWarningConditionOverrideCodeSecond",
    "censusWarningConditionCodeThird",
    "censusWarningConditionOverrideCodeThird",
    "censusWarningConditionCodeFourth",
    "censusWarningConditionOverrideCodeFourth",
    "censusWarningConditionCodeFifth",
    "censusWarningConditionOverrideCodeFifth",
    "censusWarningConditionCodeSixth",
    "censusWarningConditionOverrideCodeSixth",
    "censusWarningConditionCodeSeventh",
    "censusWarningConditionOverrideCodeSeventh",
    "defaultControlIdentifier",
    "messageType"
})
public class CW02RecordDataElement {

    @XmlElement(required = true)
    protected Position controlIdentifier;
    @XmlElement(required = true)
    protected Position censusWarningConditionCodeFirst;
    @XmlElement(required = true)
    protected Position censusWarningConditionOverrideCodeFirst;
    @XmlElement(required = true)
    protected Position censusWarningConditionCodeSecond;
    @XmlElement(required = true)
    protected Position censusWarningConditionOverrideCodeSecond;
    @XmlElement(required = true)
    protected Position censusWarningConditionCodeThird;
    @XmlElement(required = true)
    protected Position censusWarningConditionOverrideCodeThird;
    @XmlElement(required = true)
    protected Position censusWarningConditionCodeFourth;
    @XmlElement(required = true)
    protected Position censusWarningConditionOverrideCodeFourth;
    @XmlElement(required = true)
    protected Position censusWarningConditionCodeFifth;
    @XmlElement(required = true)
    protected Position censusWarningConditionOverrideCodeFifth;
    @XmlElement(required = true)
    protected Position censusWarningConditionCodeSixth;
    @XmlElement(required = true)
    protected Position censusWarningConditionOverrideCodeSixth;
    @XmlElement(required = true)
    protected Position censusWarningConditionCodeSeventh;
    @XmlElement(required = true)
    protected Position censusWarningConditionOverrideCodeSeventh;
    @XmlElement(defaultValue = "CW02")
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
     * Gets the value of the censusWarningConditionCodeFirst property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getCensusWarningConditionCodeFirst() {
        return censusWarningConditionCodeFirst;
    }

    /**
     * Sets the value of the censusWarningConditionCodeFirst property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setCensusWarningConditionCodeFirst(Position value) {
        this.censusWarningConditionCodeFirst = value;
    }

    /**
     * Gets the value of the censusWarningConditionOverrideCodeFirst property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getCensusWarningConditionOverrideCodeFirst() {
        return censusWarningConditionOverrideCodeFirst;
    }

    /**
     * Sets the value of the censusWarningConditionOverrideCodeFirst property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setCensusWarningConditionOverrideCodeFirst(Position value) {
        this.censusWarningConditionOverrideCodeFirst = value;
    }

    /**
     * Gets the value of the censusWarningConditionCodeSecond property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getCensusWarningConditionCodeSecond() {
        return censusWarningConditionCodeSecond;
    }

    /**
     * Sets the value of the censusWarningConditionCodeSecond property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setCensusWarningConditionCodeSecond(Position value) {
        this.censusWarningConditionCodeSecond = value;
    }

    /**
     * Gets the value of the censusWarningConditionOverrideCodeSecond property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getCensusWarningConditionOverrideCodeSecond() {
        return censusWarningConditionOverrideCodeSecond;
    }

    /**
     * Sets the value of the censusWarningConditionOverrideCodeSecond property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setCensusWarningConditionOverrideCodeSecond(Position value) {
        this.censusWarningConditionOverrideCodeSecond = value;
    }

    /**
     * Gets the value of the censusWarningConditionCodeThird property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getCensusWarningConditionCodeThird() {
        return censusWarningConditionCodeThird;
    }

    /**
     * Sets the value of the censusWarningConditionCodeThird property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setCensusWarningConditionCodeThird(Position value) {
        this.censusWarningConditionCodeThird = value;
    }

    /**
     * Gets the value of the censusWarningConditionOverrideCodeThird property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getCensusWarningConditionOverrideCodeThird() {
        return censusWarningConditionOverrideCodeThird;
    }

    /**
     * Sets the value of the censusWarningConditionOverrideCodeThird property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setCensusWarningConditionOverrideCodeThird(Position value) {
        this.censusWarningConditionOverrideCodeThird = value;
    }

    /**
     * Gets the value of the censusWarningConditionCodeFourth property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getCensusWarningConditionCodeFourth() {
        return censusWarningConditionCodeFourth;
    }

    /**
     * Sets the value of the censusWarningConditionCodeFourth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setCensusWarningConditionCodeFourth(Position value) {
        this.censusWarningConditionCodeFourth = value;
    }

    /**
     * Gets the value of the censusWarningConditionOverrideCodeFourth property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getCensusWarningConditionOverrideCodeFourth() {
        return censusWarningConditionOverrideCodeFourth;
    }

    /**
     * Sets the value of the censusWarningConditionOverrideCodeFourth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setCensusWarningConditionOverrideCodeFourth(Position value) {
        this.censusWarningConditionOverrideCodeFourth = value;
    }

    /**
     * Gets the value of the censusWarningConditionCodeFifth property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getCensusWarningConditionCodeFifth() {
        return censusWarningConditionCodeFifth;
    }

    /**
     * Sets the value of the censusWarningConditionCodeFifth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setCensusWarningConditionCodeFifth(Position value) {
        this.censusWarningConditionCodeFifth = value;
    }

    /**
     * Gets the value of the censusWarningConditionOverrideCodeFifth property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getCensusWarningConditionOverrideCodeFifth() {
        return censusWarningConditionOverrideCodeFifth;
    }

    /**
     * Sets the value of the censusWarningConditionOverrideCodeFifth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setCensusWarningConditionOverrideCodeFifth(Position value) {
        this.censusWarningConditionOverrideCodeFifth = value;
    }

    /**
     * Gets the value of the censusWarningConditionCodeSixth property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getCensusWarningConditionCodeSixth() {
        return censusWarningConditionCodeSixth;
    }

    /**
     * Sets the value of the censusWarningConditionCodeSixth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setCensusWarningConditionCodeSixth(Position value) {
        this.censusWarningConditionCodeSixth = value;
    }

    /**
     * Gets the value of the censusWarningConditionOverrideCodeSixth property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getCensusWarningConditionOverrideCodeSixth() {
        return censusWarningConditionOverrideCodeSixth;
    }

    /**
     * Sets the value of the censusWarningConditionOverrideCodeSixth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setCensusWarningConditionOverrideCodeSixth(Position value) {
        this.censusWarningConditionOverrideCodeSixth = value;
    }

    /**
     * Gets the value of the censusWarningConditionCodeSeventh property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getCensusWarningConditionCodeSeventh() {
        return censusWarningConditionCodeSeventh;
    }

    /**
     * Sets the value of the censusWarningConditionCodeSeventh property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setCensusWarningConditionCodeSeventh(Position value) {
        this.censusWarningConditionCodeSeventh = value;
    }

    /**
     * Gets the value of the censusWarningConditionOverrideCodeSeventh property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getCensusWarningConditionOverrideCodeSeventh() {
        return censusWarningConditionOverrideCodeSeventh;
    }

    /**
     * Sets the value of the censusWarningConditionOverrideCodeSeventh property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setCensusWarningConditionOverrideCodeSeventh(Position value) {
        this.censusWarningConditionOverrideCodeSeventh = value;
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
