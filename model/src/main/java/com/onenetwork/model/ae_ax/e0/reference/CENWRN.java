//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.21 at 04:26:39 PM EEST 
//


package com.onenetwork.model.ae_ax.e0.reference;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.onenetwork.model.position.Position;


/**
 * <p>Java class for CENWRN complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CENWRN"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="censusWarningConditionCode" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="censusWarningConditionOverrideCode" type="{http://www.model.onenetwork.com/position}Position"/&gt;
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
@XmlType(name = "CENWRN", propOrder = {
    "censusWarningConditionCode",
    "censusWarningConditionOverrideCode",
    "defaultControlIdentifier",
    "messageType"
})
public class CENWRN {

    @XmlElement(required = true)
    protected Position censusWarningConditionCode;
    @XmlElement(required = true)
    protected Position censusWarningConditionOverrideCode;
    @XmlElement(defaultValue = "CENWRN")
    protected String defaultControlIdentifier;
    @XmlElement(defaultValue = "AE|AX")
    protected String messageType;

    /**
     * Gets the value of the censusWarningConditionCode property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getCensusWarningConditionCode() {
        return censusWarningConditionCode;
    }

    /**
     * Sets the value of the censusWarningConditionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setCensusWarningConditionCode(Position value) {
        this.censusWarningConditionCode = value;
    }

    /**
     * Gets the value of the censusWarningConditionOverrideCode property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getCensusWarningConditionOverrideCode() {
        return censusWarningConditionOverrideCode;
    }

    /**
     * Sets the value of the censusWarningConditionOverrideCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setCensusWarningConditionOverrideCode(Position value) {
        this.censusWarningConditionOverrideCode = value;
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
