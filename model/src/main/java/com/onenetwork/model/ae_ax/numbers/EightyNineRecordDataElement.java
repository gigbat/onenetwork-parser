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
 * <p>Java class for EightyNineRecordDataElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EightyNineRecordDataElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="controlIdentifier" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="accountingClassCodeFirst" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="totalFeeAmountFirst" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="accountingClassCodeSecond" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="totalFeeAmountSecond" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="accountingClassCodeThird" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="totalFeeAmountThird" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="accountingClassCodeFourth" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="totalFeeAmountFourth" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="accountingClassCodeFifth" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="totalFeeAmountFifth" type="{http://www.model.onenetwork.com/position}Position"/&gt;
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
@XmlType(name = "EightyNineRecordDataElement", propOrder = {
    "controlIdentifier",
    "accountingClassCodeFirst",
    "totalFeeAmountFirst",
    "accountingClassCodeSecond",
    "totalFeeAmountSecond",
    "accountingClassCodeThird",
    "totalFeeAmountThird",
    "accountingClassCodeFourth",
    "totalFeeAmountFourth",
    "accountingClassCodeFifth",
    "totalFeeAmountFifth",
    "defaultControlIdentifier",
    "messageType",
    "endPositionOfControlIdentifier"
})
public class EightyNineRecordDataElement {

    @XmlElement(required = true)
    protected Position controlIdentifier;
    @XmlElement(required = true)
    protected Position accountingClassCodeFirst;
    @XmlElement(required = true)
    protected Position totalFeeAmountFirst;
    @XmlElement(required = true)
    protected Position accountingClassCodeSecond;
    @XmlElement(required = true)
    protected Position totalFeeAmountSecond;
    @XmlElement(required = true)
    protected Position accountingClassCodeThird;
    @XmlElement(required = true)
    protected Position totalFeeAmountThird;
    @XmlElement(required = true)
    protected Position accountingClassCodeFourth;
    @XmlElement(required = true)
    protected Position totalFeeAmountFourth;
    @XmlElement(required = true)
    protected Position accountingClassCodeFifth;
    @XmlElement(required = true)
    protected Position totalFeeAmountFifth;
    @XmlElement(defaultValue = "89")
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
     * Gets the value of the accountingClassCodeFirst property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getAccountingClassCodeFirst() {
        return accountingClassCodeFirst;
    }

    /**
     * Sets the value of the accountingClassCodeFirst property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setAccountingClassCodeFirst(Position value) {
        this.accountingClassCodeFirst = value;
    }

    /**
     * Gets the value of the totalFeeAmountFirst property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getTotalFeeAmountFirst() {
        return totalFeeAmountFirst;
    }

    /**
     * Sets the value of the totalFeeAmountFirst property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setTotalFeeAmountFirst(Position value) {
        this.totalFeeAmountFirst = value;
    }

    /**
     * Gets the value of the accountingClassCodeSecond property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getAccountingClassCodeSecond() {
        return accountingClassCodeSecond;
    }

    /**
     * Sets the value of the accountingClassCodeSecond property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setAccountingClassCodeSecond(Position value) {
        this.accountingClassCodeSecond = value;
    }

    /**
     * Gets the value of the totalFeeAmountSecond property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getTotalFeeAmountSecond() {
        return totalFeeAmountSecond;
    }

    /**
     * Sets the value of the totalFeeAmountSecond property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setTotalFeeAmountSecond(Position value) {
        this.totalFeeAmountSecond = value;
    }

    /**
     * Gets the value of the accountingClassCodeThird property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getAccountingClassCodeThird() {
        return accountingClassCodeThird;
    }

    /**
     * Sets the value of the accountingClassCodeThird property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setAccountingClassCodeThird(Position value) {
        this.accountingClassCodeThird = value;
    }

    /**
     * Gets the value of the totalFeeAmountThird property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getTotalFeeAmountThird() {
        return totalFeeAmountThird;
    }

    /**
     * Sets the value of the totalFeeAmountThird property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setTotalFeeAmountThird(Position value) {
        this.totalFeeAmountThird = value;
    }

    /**
     * Gets the value of the accountingClassCodeFourth property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getAccountingClassCodeFourth() {
        return accountingClassCodeFourth;
    }

    /**
     * Sets the value of the accountingClassCodeFourth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setAccountingClassCodeFourth(Position value) {
        this.accountingClassCodeFourth = value;
    }

    /**
     * Gets the value of the totalFeeAmountFourth property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getTotalFeeAmountFourth() {
        return totalFeeAmountFourth;
    }

    /**
     * Sets the value of the totalFeeAmountFourth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setTotalFeeAmountFourth(Position value) {
        this.totalFeeAmountFourth = value;
    }

    /**
     * Gets the value of the accountingClassCodeFifth property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getAccountingClassCodeFifth() {
        return accountingClassCodeFifth;
    }

    /**
     * Sets the value of the accountingClassCodeFifth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setAccountingClassCodeFifth(Position value) {
        this.accountingClassCodeFifth = value;
    }

    /**
     * Gets the value of the totalFeeAmountFifth property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getTotalFeeAmountFifth() {
        return totalFeeAmountFifth;
    }

    /**
     * Sets the value of the totalFeeAmountFifth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setTotalFeeAmountFifth(Position value) {
        this.totalFeeAmountFifth = value;
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
