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
 * <p>Java class for SO60RecordDataElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SO60RecordDataElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="controlIdentifier" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="dispositionActionDate" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="dispositionActionTime" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="dispositionActionCode" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="narrativeMessage" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="releaseDate" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="releaseOriginCode" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="documentType" type="{http://www.model.onenetwork.com/position}Position"/&gt;
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
@XmlType(name = "SO60RecordDataElement", propOrder = {
    "controlIdentifier",
    "dispositionActionDate",
    "dispositionActionTime",
    "dispositionActionCode",
    "narrativeMessage",
    "releaseDate",
    "releaseOriginCode",
    "documentType",
    "defaultControlIdentifier",
    "messageType",
    "endPositionOfControlIdentifier"
})
public class SO60RecordDataElement {

    @XmlElement(required = true)
    protected Position controlIdentifier;
    @XmlElement(required = true)
    protected Position dispositionActionDate;
    @XmlElement(required = true)
    protected Position dispositionActionTime;
    @XmlElement(required = true)
    protected Position dispositionActionCode;
    @XmlElement(required = true)
    protected Position narrativeMessage;
    @XmlElement(required = true)
    protected Position releaseDate;
    @XmlElement(required = true)
    protected Position releaseOriginCode;
    @XmlElement(required = true)
    protected Position documentType;
    @XmlElement(defaultValue = "SO60")
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
     * Gets the value of the dispositionActionDate property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getDispositionActionDate() {
        return dispositionActionDate;
    }

    /**
     * Sets the value of the dispositionActionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setDispositionActionDate(Position value) {
        this.dispositionActionDate = value;
    }

    /**
     * Gets the value of the dispositionActionTime property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getDispositionActionTime() {
        return dispositionActionTime;
    }

    /**
     * Sets the value of the dispositionActionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setDispositionActionTime(Position value) {
        this.dispositionActionTime = value;
    }

    /**
     * Gets the value of the dispositionActionCode property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getDispositionActionCode() {
        return dispositionActionCode;
    }

    /**
     * Sets the value of the dispositionActionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setDispositionActionCode(Position value) {
        this.dispositionActionCode = value;
    }

    /**
     * Gets the value of the narrativeMessage property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getNarrativeMessage() {
        return narrativeMessage;
    }

    /**
     * Sets the value of the narrativeMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setNarrativeMessage(Position value) {
        this.narrativeMessage = value;
    }

    /**
     * Gets the value of the releaseDate property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getReleaseDate() {
        return releaseDate;
    }

    /**
     * Sets the value of the releaseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setReleaseDate(Position value) {
        this.releaseDate = value;
    }

    /**
     * Gets the value of the releaseOriginCode property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getReleaseOriginCode() {
        return releaseOriginCode;
    }

    /**
     * Sets the value of the releaseOriginCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setReleaseOriginCode(Position value) {
        this.releaseOriginCode = value;
    }

    /**
     * Gets the value of the documentType property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getDocumentType() {
        return documentType;
    }

    /**
     * Sets the value of the documentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setDocumentType(Position value) {
        this.documentType = value;
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
