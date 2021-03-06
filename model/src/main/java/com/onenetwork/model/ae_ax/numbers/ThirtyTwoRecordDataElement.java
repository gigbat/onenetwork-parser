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
 * <p>Java class for ThirtyTwoRecordDataElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ThirtyTwoRecordDataElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="controlIdentifier" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="releaseEntryFilerCodeFirst" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="releaseEntryNumberFirst" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="releaseEntryFilerCodeSecond" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="releaseEntryNumberSecond" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="releaseEntryFilerCodeThird" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="releaseEntryNumberThird" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="releaseEntryFilerCodeFourth" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="releaseEntryNumberFourth" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="releaseEntryFilerCodeFifth" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="releaseEntryNumberFifth" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="releaseEntryFilerCodeSixth" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="releaseEntryNumberSixth" type="{http://www.model.onenetwork.com/position}Position"/&gt;
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
@XmlType(name = "ThirtyTwoRecordDataElement", propOrder = {
    "controlIdentifier",
    "releaseEntryFilerCodeFirst",
    "releaseEntryNumberFirst",
    "releaseEntryFilerCodeSecond",
    "releaseEntryNumberSecond",
    "releaseEntryFilerCodeThird",
    "releaseEntryNumberThird",
    "releaseEntryFilerCodeFourth",
    "releaseEntryNumberFourth",
    "releaseEntryFilerCodeFifth",
    "releaseEntryNumberFifth",
    "releaseEntryFilerCodeSixth",
    "releaseEntryNumberSixth",
    "defaultControlIdentifier",
    "messageType",
    "endPositionOfControlIdentifier"
})
public class ThirtyTwoRecordDataElement {

    @XmlElement(required = true)
    protected Position controlIdentifier;
    @XmlElement(required = true)
    protected Position releaseEntryFilerCodeFirst;
    @XmlElement(required = true)
    protected Position releaseEntryNumberFirst;
    @XmlElement(required = true)
    protected Position releaseEntryFilerCodeSecond;
    @XmlElement(required = true)
    protected Position releaseEntryNumberSecond;
    @XmlElement(required = true)
    protected Position releaseEntryFilerCodeThird;
    @XmlElement(required = true)
    protected Position releaseEntryNumberThird;
    @XmlElement(required = true)
    protected Position releaseEntryFilerCodeFourth;
    @XmlElement(required = true)
    protected Position releaseEntryNumberFourth;
    @XmlElement(required = true)
    protected Position releaseEntryFilerCodeFifth;
    @XmlElement(required = true)
    protected Position releaseEntryNumberFifth;
    @XmlElement(required = true)
    protected Position releaseEntryFilerCodeSixth;
    @XmlElement(required = true)
    protected Position releaseEntryNumberSixth;
    @XmlElement(defaultValue = "32")
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
     * Gets the value of the releaseEntryFilerCodeFirst property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getReleaseEntryFilerCodeFirst() {
        return releaseEntryFilerCodeFirst;
    }

    /**
     * Sets the value of the releaseEntryFilerCodeFirst property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setReleaseEntryFilerCodeFirst(Position value) {
        this.releaseEntryFilerCodeFirst = value;
    }

    /**
     * Gets the value of the releaseEntryNumberFirst property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getReleaseEntryNumberFirst() {
        return releaseEntryNumberFirst;
    }

    /**
     * Sets the value of the releaseEntryNumberFirst property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setReleaseEntryNumberFirst(Position value) {
        this.releaseEntryNumberFirst = value;
    }

    /**
     * Gets the value of the releaseEntryFilerCodeSecond property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getReleaseEntryFilerCodeSecond() {
        return releaseEntryFilerCodeSecond;
    }

    /**
     * Sets the value of the releaseEntryFilerCodeSecond property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setReleaseEntryFilerCodeSecond(Position value) {
        this.releaseEntryFilerCodeSecond = value;
    }

    /**
     * Gets the value of the releaseEntryNumberSecond property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getReleaseEntryNumberSecond() {
        return releaseEntryNumberSecond;
    }

    /**
     * Sets the value of the releaseEntryNumberSecond property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setReleaseEntryNumberSecond(Position value) {
        this.releaseEntryNumberSecond = value;
    }

    /**
     * Gets the value of the releaseEntryFilerCodeThird property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getReleaseEntryFilerCodeThird() {
        return releaseEntryFilerCodeThird;
    }

    /**
     * Sets the value of the releaseEntryFilerCodeThird property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setReleaseEntryFilerCodeThird(Position value) {
        this.releaseEntryFilerCodeThird = value;
    }

    /**
     * Gets the value of the releaseEntryNumberThird property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getReleaseEntryNumberThird() {
        return releaseEntryNumberThird;
    }

    /**
     * Sets the value of the releaseEntryNumberThird property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setReleaseEntryNumberThird(Position value) {
        this.releaseEntryNumberThird = value;
    }

    /**
     * Gets the value of the releaseEntryFilerCodeFourth property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getReleaseEntryFilerCodeFourth() {
        return releaseEntryFilerCodeFourth;
    }

    /**
     * Sets the value of the releaseEntryFilerCodeFourth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setReleaseEntryFilerCodeFourth(Position value) {
        this.releaseEntryFilerCodeFourth = value;
    }

    /**
     * Gets the value of the releaseEntryNumberFourth property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getReleaseEntryNumberFourth() {
        return releaseEntryNumberFourth;
    }

    /**
     * Sets the value of the releaseEntryNumberFourth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setReleaseEntryNumberFourth(Position value) {
        this.releaseEntryNumberFourth = value;
    }

    /**
     * Gets the value of the releaseEntryFilerCodeFifth property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getReleaseEntryFilerCodeFifth() {
        return releaseEntryFilerCodeFifth;
    }

    /**
     * Sets the value of the releaseEntryFilerCodeFifth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setReleaseEntryFilerCodeFifth(Position value) {
        this.releaseEntryFilerCodeFifth = value;
    }

    /**
     * Gets the value of the releaseEntryNumberFifth property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getReleaseEntryNumberFifth() {
        return releaseEntryNumberFifth;
    }

    /**
     * Sets the value of the releaseEntryNumberFifth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setReleaseEntryNumberFifth(Position value) {
        this.releaseEntryNumberFifth = value;
    }

    /**
     * Gets the value of the releaseEntryFilerCodeSixth property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getReleaseEntryFilerCodeSixth() {
        return releaseEntryFilerCodeSixth;
    }

    /**
     * Sets the value of the releaseEntryFilerCodeSixth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setReleaseEntryFilerCodeSixth(Position value) {
        this.releaseEntryFilerCodeSixth = value;
    }

    /**
     * Gets the value of the releaseEntryNumberSixth property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getReleaseEntryNumberSixth() {
        return releaseEntryNumberSixth;
    }

    /**
     * Sets the value of the releaseEntryNumberSixth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setReleaseEntryNumberSixth(Position value) {
        this.releaseEntryNumberSixth = value;
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
