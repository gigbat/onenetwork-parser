//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.21 at 05:38:52 PM EEST 
//


package com.onenetwork.model.ae_ax.numbers;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.onenetwork.model.position.Position;


/**
 * <p>Java class for FiftyTwoRecordDataElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FiftyTwoRecordDataElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="controlIdentifier" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="licenseOrCertificateOrPermitTypeCode" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="licenseNumberOrCertificateNumberOrPermitNumber" type="{http://www.model.onenetwork.com/position}Position"/&gt;
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
@XmlType(name = "FiftyTwoRecordDataElement", propOrder = {
    "controlIdentifier",
    "licenseOrCertificateOrPermitTypeCode",
    "licenseNumberOrCertificateNumberOrPermitNumber",
    "defaultControlIdentifier",
    "messageType"
})
public class FiftyTwoRecordDataElement {

    @XmlElement(required = true)
    protected Position controlIdentifier;
    @XmlElement(required = true)
    protected Position licenseOrCertificateOrPermitTypeCode;
    @XmlElement(required = true)
    protected Position licenseNumberOrCertificateNumberOrPermitNumber;
    @XmlElement(defaultValue = "52")
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
     * Gets the value of the licenseOrCertificateOrPermitTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getLicenseOrCertificateOrPermitTypeCode() {
        return licenseOrCertificateOrPermitTypeCode;
    }

    /**
     * Sets the value of the licenseOrCertificateOrPermitTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setLicenseOrCertificateOrPermitTypeCode(Position value) {
        this.licenseOrCertificateOrPermitTypeCode = value;
    }

    /**
     * Gets the value of the licenseNumberOrCertificateNumberOrPermitNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getLicenseNumberOrCertificateNumberOrPermitNumber() {
        return licenseNumberOrCertificateNumberOrPermitNumber;
    }

    /**
     * Sets the value of the licenseNumberOrCertificateNumberOrPermitNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setLicenseNumberOrCertificateNumberOrPermitNumber(Position value) {
        this.licenseNumberOrCertificateNumberOrPermitNumber = value;
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
