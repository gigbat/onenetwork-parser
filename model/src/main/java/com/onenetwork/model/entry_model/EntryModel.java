//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.21 at 03:53:23 PM EEST 
//


package com.onenetwork.model.entry_model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EntryModel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntryModel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="symbol" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="symbolDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="messageDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntryModel", propOrder = {
    "symbol",
    "symbolDescription",
    "messageDescription"
})
public class EntryModel {

    protected String symbol;
    protected String symbolDescription;
    protected String messageDescription;

    /**
     * Gets the value of the symbol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * Sets the value of the symbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSymbol(String value) {
        this.symbol = value;
    }

    /**
     * Gets the value of the symbolDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSymbolDescription() {
        return symbolDescription;
    }

    /**
     * Sets the value of the symbolDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSymbolDescription(String value) {
        this.symbolDescription = value;
    }

    /**
     * Gets the value of the messageDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageDescription() {
        return messageDescription;
    }

    /**
     * Sets the value of the messageDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageDescription(String value) {
        this.messageDescription = value;
    }

}