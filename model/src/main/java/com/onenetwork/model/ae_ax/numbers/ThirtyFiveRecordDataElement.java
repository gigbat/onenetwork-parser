//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.21 at 11:00:31 PM EEST 
//


package com.onenetwork.model.ae_ax.numbers;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.onenetwork.model.position.Position;


/**
 * <p>Java class for ThirtyFiveRecordDataElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ThirtyFiveRecordDataElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="controlIdentifier" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="postSummaryCorrectionHeaderReasonCodeFirst" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="postSummaryCorrectionHeaderReasonCodeSecond" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="postSummaryCorrectionHeaderReasonCodeThird" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="postSummaryCorrectionHeaderReasonCodeFourth" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="postSummaryCorrectionHeaderReasonCodeFifth" type="{http://www.model.onenetwork.com/position}Position"/&gt;
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
@XmlType(name = "ThirtyFiveRecordDataElement", propOrder = {
    "controlIdentifier",
    "postSummaryCorrectionHeaderReasonCodeFirst",
    "postSummaryCorrectionHeaderReasonCodeSecond",
    "postSummaryCorrectionHeaderReasonCodeThird",
    "postSummaryCorrectionHeaderReasonCodeFourth",
    "postSummaryCorrectionHeaderReasonCodeFifth",
    "defaultControlIdentifier",
    "messageType"
})
public class ThirtyFiveRecordDataElement {

    @XmlElement(required = true)
    protected Position controlIdentifier;
    @XmlElement(required = true)
    protected Position postSummaryCorrectionHeaderReasonCodeFirst;
    @XmlElement(required = true)
    protected Position postSummaryCorrectionHeaderReasonCodeSecond;
    @XmlElement(required = true)
    protected Position postSummaryCorrectionHeaderReasonCodeThird;
    @XmlElement(required = true)
    protected Position postSummaryCorrectionHeaderReasonCodeFourth;
    @XmlElement(required = true)
    protected Position postSummaryCorrectionHeaderReasonCodeFifth;
    @XmlElement(defaultValue = "35")
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
     * Gets the value of the postSummaryCorrectionHeaderReasonCodeFirst property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getPostSummaryCorrectionHeaderReasonCodeFirst() {
        return postSummaryCorrectionHeaderReasonCodeFirst;
    }

    /**
     * Sets the value of the postSummaryCorrectionHeaderReasonCodeFirst property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setPostSummaryCorrectionHeaderReasonCodeFirst(Position value) {
        this.postSummaryCorrectionHeaderReasonCodeFirst = value;
    }

    /**
     * Gets the value of the postSummaryCorrectionHeaderReasonCodeSecond property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getPostSummaryCorrectionHeaderReasonCodeSecond() {
        return postSummaryCorrectionHeaderReasonCodeSecond;
    }

    /**
     * Sets the value of the postSummaryCorrectionHeaderReasonCodeSecond property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setPostSummaryCorrectionHeaderReasonCodeSecond(Position value) {
        this.postSummaryCorrectionHeaderReasonCodeSecond = value;
    }

    /**
     * Gets the value of the postSummaryCorrectionHeaderReasonCodeThird property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getPostSummaryCorrectionHeaderReasonCodeThird() {
        return postSummaryCorrectionHeaderReasonCodeThird;
    }

    /**
     * Sets the value of the postSummaryCorrectionHeaderReasonCodeThird property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setPostSummaryCorrectionHeaderReasonCodeThird(Position value) {
        this.postSummaryCorrectionHeaderReasonCodeThird = value;
    }

    /**
     * Gets the value of the postSummaryCorrectionHeaderReasonCodeFourth property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getPostSummaryCorrectionHeaderReasonCodeFourth() {
        return postSummaryCorrectionHeaderReasonCodeFourth;
    }

    /**
     * Sets the value of the postSummaryCorrectionHeaderReasonCodeFourth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setPostSummaryCorrectionHeaderReasonCodeFourth(Position value) {
        this.postSummaryCorrectionHeaderReasonCodeFourth = value;
    }

    /**
     * Gets the value of the postSummaryCorrectionHeaderReasonCodeFifth property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getPostSummaryCorrectionHeaderReasonCodeFifth() {
        return postSummaryCorrectionHeaderReasonCodeFifth;
    }

    /**
     * Sets the value of the postSummaryCorrectionHeaderReasonCodeFifth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setPostSummaryCorrectionHeaderReasonCodeFifth(Position value) {
        this.postSummaryCorrectionHeaderReasonCodeFifth = value;
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
