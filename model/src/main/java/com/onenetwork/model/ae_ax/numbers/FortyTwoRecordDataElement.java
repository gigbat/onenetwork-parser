//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.21 at 03:53:23 PM EEST 
//


package com.onenetwork.model.ae_ax.numbers;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.onenetwork.model.position.Position;


/**
 * <p>Java class for FortyTwoRecordDataElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FortyTwoRecordDataElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="controlIdentifier" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="supplierIdCode" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="invoiceNumber" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="invoiceLineRangeFirstBegin" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="invoiceLineRangeFirstEnd" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="invoiceLineRangeSecondBegin" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="invoiceLineRangeSecondEnd" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="invoiceLineRangeThirdBegin" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="invoiceLineRangeThirdEnd" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="invoiceLineRangeFourthBegin" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="invoiceLineRangeFourthEnd" type="{http://www.model.onenetwork.com/position}Position"/&gt;
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
@XmlType(name = "FortyTwoRecordDataElement", propOrder = {
    "controlIdentifier",
    "supplierIdCode",
    "invoiceNumber",
    "invoiceLineRangeFirstBegin",
    "invoiceLineRangeFirstEnd",
    "invoiceLineRangeSecondBegin",
    "invoiceLineRangeSecondEnd",
    "invoiceLineRangeThirdBegin",
    "invoiceLineRangeThirdEnd",
    "invoiceLineRangeFourthBegin",
    "invoiceLineRangeFourthEnd",
    "defaultControlIdentifier",
    "messageType"
})
public class FortyTwoRecordDataElement {

    @XmlElement(required = true)
    protected Position controlIdentifier;
    @XmlElement(required = true)
    protected Position supplierIdCode;
    @XmlElement(required = true)
    protected Position invoiceNumber;
    @XmlElement(required = true)
    protected Position invoiceLineRangeFirstBegin;
    @XmlElement(required = true)
    protected Position invoiceLineRangeFirstEnd;
    @XmlElement(required = true)
    protected Position invoiceLineRangeSecondBegin;
    @XmlElement(required = true)
    protected Position invoiceLineRangeSecondEnd;
    @XmlElement(required = true)
    protected Position invoiceLineRangeThirdBegin;
    @XmlElement(required = true)
    protected Position invoiceLineRangeThirdEnd;
    @XmlElement(required = true)
    protected Position invoiceLineRangeFourthBegin;
    @XmlElement(required = true)
    protected Position invoiceLineRangeFourthEnd;
    @XmlElement(defaultValue = "42")
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
     * Gets the value of the supplierIdCode property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getSupplierIdCode() {
        return supplierIdCode;
    }

    /**
     * Sets the value of the supplierIdCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setSupplierIdCode(Position value) {
        this.supplierIdCode = value;
    }

    /**
     * Gets the value of the invoiceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * Sets the value of the invoiceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setInvoiceNumber(Position value) {
        this.invoiceNumber = value;
    }

    /**
     * Gets the value of the invoiceLineRangeFirstBegin property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getInvoiceLineRangeFirstBegin() {
        return invoiceLineRangeFirstBegin;
    }

    /**
     * Sets the value of the invoiceLineRangeFirstBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setInvoiceLineRangeFirstBegin(Position value) {
        this.invoiceLineRangeFirstBegin = value;
    }

    /**
     * Gets the value of the invoiceLineRangeFirstEnd property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getInvoiceLineRangeFirstEnd() {
        return invoiceLineRangeFirstEnd;
    }

    /**
     * Sets the value of the invoiceLineRangeFirstEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setInvoiceLineRangeFirstEnd(Position value) {
        this.invoiceLineRangeFirstEnd = value;
    }

    /**
     * Gets the value of the invoiceLineRangeSecondBegin property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getInvoiceLineRangeSecondBegin() {
        return invoiceLineRangeSecondBegin;
    }

    /**
     * Sets the value of the invoiceLineRangeSecondBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setInvoiceLineRangeSecondBegin(Position value) {
        this.invoiceLineRangeSecondBegin = value;
    }

    /**
     * Gets the value of the invoiceLineRangeSecondEnd property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getInvoiceLineRangeSecondEnd() {
        return invoiceLineRangeSecondEnd;
    }

    /**
     * Sets the value of the invoiceLineRangeSecondEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setInvoiceLineRangeSecondEnd(Position value) {
        this.invoiceLineRangeSecondEnd = value;
    }

    /**
     * Gets the value of the invoiceLineRangeThirdBegin property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getInvoiceLineRangeThirdBegin() {
        return invoiceLineRangeThirdBegin;
    }

    /**
     * Sets the value of the invoiceLineRangeThirdBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setInvoiceLineRangeThirdBegin(Position value) {
        this.invoiceLineRangeThirdBegin = value;
    }

    /**
     * Gets the value of the invoiceLineRangeThirdEnd property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getInvoiceLineRangeThirdEnd() {
        return invoiceLineRangeThirdEnd;
    }

    /**
     * Sets the value of the invoiceLineRangeThirdEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setInvoiceLineRangeThirdEnd(Position value) {
        this.invoiceLineRangeThirdEnd = value;
    }

    /**
     * Gets the value of the invoiceLineRangeFourthBegin property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getInvoiceLineRangeFourthBegin() {
        return invoiceLineRangeFourthBegin;
    }

    /**
     * Sets the value of the invoiceLineRangeFourthBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setInvoiceLineRangeFourthBegin(Position value) {
        this.invoiceLineRangeFourthBegin = value;
    }

    /**
     * Gets the value of the invoiceLineRangeFourthEnd property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getInvoiceLineRangeFourthEnd() {
        return invoiceLineRangeFourthEnd;
    }

    /**
     * Sets the value of the invoiceLineRangeFourthEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setInvoiceLineRangeFourthEnd(Position value) {
        this.invoiceLineRangeFourthEnd = value;
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
