//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.22 at 07:16:43 PM EEST 
//


package com.onenetwork.model.sn_us_isf10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.onenetwork.model.position.Position;


/**
 * <p>Java class for SF50RecordDataElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SF50RecordDataElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="controlIdentifier" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="codeQualifierFirst" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="foreignPortOfUnlading" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="codeQualifierSecond" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="placeOfDelivery" type="{http://www.model.onenetwork.com/position}Position"/&gt;
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
@XmlType(name = "SF50RecordDataElement", propOrder = {
    "controlIdentifier",
    "codeQualifierFirst",
    "foreignPortOfUnlading",
    "codeQualifierSecond",
    "placeOfDelivery",
    "defaultControlIdentifier",
    "messageType",
    "endPositionOfControlIdentifier"
})
public class SF50RecordDataElement {

    @XmlElement(required = true)
    protected Position controlIdentifier;
    @XmlElement(required = true)
    protected Position codeQualifierFirst;
    @XmlElement(required = true)
    protected Position foreignPortOfUnlading;
    @XmlElement(required = true)
    protected Position codeQualifierSecond;
    @XmlElement(required = true)
    protected Position placeOfDelivery;
    @XmlElement(defaultValue = "SF50")
    protected String defaultControlIdentifier;
    @XmlElement(defaultValue = "SN|US-ISF10")
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
     * Gets the value of the codeQualifierFirst property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getCodeQualifierFirst() {
        return codeQualifierFirst;
    }

    /**
     * Sets the value of the codeQualifierFirst property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setCodeQualifierFirst(Position value) {
        this.codeQualifierFirst = value;
    }

    /**
     * Gets the value of the foreignPortOfUnlading property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getForeignPortOfUnlading() {
        return foreignPortOfUnlading;
    }

    /**
     * Sets the value of the foreignPortOfUnlading property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setForeignPortOfUnlading(Position value) {
        this.foreignPortOfUnlading = value;
    }

    /**
     * Gets the value of the codeQualifierSecond property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getCodeQualifierSecond() {
        return codeQualifierSecond;
    }

    /**
     * Sets the value of the codeQualifierSecond property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setCodeQualifierSecond(Position value) {
        this.codeQualifierSecond = value;
    }

    /**
     * Gets the value of the placeOfDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getPlaceOfDelivery() {
        return placeOfDelivery;
    }

    /**
     * Sets the value of the placeOfDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setPlaceOfDelivery(Position value) {
        this.placeOfDelivery = value;
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
