//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.22 at 07:03:31 PM EEST 
//


package com.onenetwork.model.ae_ax.se;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.onenetwork.model.position.Position;


/**
 * <p>Java class for SE36RecordDataElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SE36RecordDataElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="controlIdentifier" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="cityName" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="countrySubEntityCode" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="postalCode" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="countryCode" type="{http://www.model.onenetwork.com/position}Position"/&gt;
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
@XmlType(name = "SE36RecordDataElement", propOrder = {
    "controlIdentifier",
    "cityName",
    "countrySubEntityCode",
    "postalCode",
    "countryCode",
    "defaultControlIdentifier",
    "messageType",
    "endPositionOfControlIdentifier"
})
public class SE36RecordDataElement {

    @XmlElement(required = true)
    protected Position controlIdentifier;
    @XmlElement(required = true)
    protected Position cityName;
    @XmlElement(required = true)
    protected Position countrySubEntityCode;
    @XmlElement(required = true)
    protected Position postalCode;
    @XmlElement(required = true)
    protected Position countryCode;
    @XmlElement(defaultValue = "SE36")
    protected String defaultControlIdentifier;
    @XmlElement(defaultValue = "AE|AX")
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
     * Gets the value of the cityName property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getCityName() {
        return cityName;
    }

    /**
     * Sets the value of the cityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setCityName(Position value) {
        this.cityName = value;
    }

    /**
     * Gets the value of the countrySubEntityCode property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getCountrySubEntityCode() {
        return countrySubEntityCode;
    }

    /**
     * Sets the value of the countrySubEntityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setCountrySubEntityCode(Position value) {
        this.countrySubEntityCode = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setPostalCode(Position value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the countryCode property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getCountryCode() {
        return countryCode;
    }

    /**
     * Sets the value of the countryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setCountryCode(Position value) {
        this.countryCode = value;
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
