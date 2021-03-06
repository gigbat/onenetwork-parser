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
 * <p>Java class for FortyRecordDataElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FortyRecordDataElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="controlIdentifier" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="lineItemIdentifier" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="articleSetIndicator" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="countryOfOriginCode" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="countryOfExportCode" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="dateOfExportation" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="dateOfExportationTextiles" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="tradeAgreementOrSpecialProgramClaimCode" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="chargesAmount" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="foreignPortOfLadingCode" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="grossShippingWeight" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="categoryCodeTextiles" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="productClaimCode" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="relatedPartyIndicator" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="naftaNetCostIndicator" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="feeExemptionCode" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="adCaseNonReimbursementStatement" type="{http://www.model.onenetwork.com/position}Position"/&gt;
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
@XmlType(name = "FortyRecordDataElement", propOrder = {
    "controlIdentifier",
    "lineItemIdentifier",
    "articleSetIndicator",
    "countryOfOriginCode",
    "countryOfExportCode",
    "dateOfExportation",
    "dateOfExportationTextiles",
    "tradeAgreementOrSpecialProgramClaimCode",
    "chargesAmount",
    "foreignPortOfLadingCode",
    "grossShippingWeight",
    "categoryCodeTextiles",
    "productClaimCode",
    "relatedPartyIndicator",
    "naftaNetCostIndicator",
    "feeExemptionCode",
    "adCaseNonReimbursementStatement",
    "defaultControlIdentifier",
    "messageType",
    "endPositionOfControlIdentifier"
})
public class FortyRecordDataElement {

    @XmlElement(required = true)
    protected Position controlIdentifier;
    @XmlElement(required = true)
    protected Position lineItemIdentifier;
    @XmlElement(required = true)
    protected Position articleSetIndicator;
    @XmlElement(required = true)
    protected Position countryOfOriginCode;
    @XmlElement(required = true)
    protected Position countryOfExportCode;
    @XmlElement(required = true)
    protected Position dateOfExportation;
    @XmlElement(required = true)
    protected Position dateOfExportationTextiles;
    @XmlElement(required = true)
    protected Position tradeAgreementOrSpecialProgramClaimCode;
    @XmlElement(required = true)
    protected Position chargesAmount;
    @XmlElement(required = true)
    protected Position foreignPortOfLadingCode;
    @XmlElement(required = true)
    protected Position grossShippingWeight;
    @XmlElement(required = true)
    protected Position categoryCodeTextiles;
    @XmlElement(required = true)
    protected Position productClaimCode;
    @XmlElement(required = true)
    protected Position relatedPartyIndicator;
    @XmlElement(required = true)
    protected Position naftaNetCostIndicator;
    @XmlElement(required = true)
    protected Position feeExemptionCode;
    @XmlElement(required = true)
    protected Position adCaseNonReimbursementStatement;
    @XmlElement(defaultValue = "40")
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
     * Gets the value of the lineItemIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getLineItemIdentifier() {
        return lineItemIdentifier;
    }

    /**
     * Sets the value of the lineItemIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setLineItemIdentifier(Position value) {
        this.lineItemIdentifier = value;
    }

    /**
     * Gets the value of the articleSetIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getArticleSetIndicator() {
        return articleSetIndicator;
    }

    /**
     * Sets the value of the articleSetIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setArticleSetIndicator(Position value) {
        this.articleSetIndicator = value;
    }

    /**
     * Gets the value of the countryOfOriginCode property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getCountryOfOriginCode() {
        return countryOfOriginCode;
    }

    /**
     * Sets the value of the countryOfOriginCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setCountryOfOriginCode(Position value) {
        this.countryOfOriginCode = value;
    }

    /**
     * Gets the value of the countryOfExportCode property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getCountryOfExportCode() {
        return countryOfExportCode;
    }

    /**
     * Sets the value of the countryOfExportCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setCountryOfExportCode(Position value) {
        this.countryOfExportCode = value;
    }

    /**
     * Gets the value of the dateOfExportation property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getDateOfExportation() {
        return dateOfExportation;
    }

    /**
     * Sets the value of the dateOfExportation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setDateOfExportation(Position value) {
        this.dateOfExportation = value;
    }

    /**
     * Gets the value of the dateOfExportationTextiles property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getDateOfExportationTextiles() {
        return dateOfExportationTextiles;
    }

    /**
     * Sets the value of the dateOfExportationTextiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setDateOfExportationTextiles(Position value) {
        this.dateOfExportationTextiles = value;
    }

    /**
     * Gets the value of the tradeAgreementOrSpecialProgramClaimCode property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getTradeAgreementOrSpecialProgramClaimCode() {
        return tradeAgreementOrSpecialProgramClaimCode;
    }

    /**
     * Sets the value of the tradeAgreementOrSpecialProgramClaimCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setTradeAgreementOrSpecialProgramClaimCode(Position value) {
        this.tradeAgreementOrSpecialProgramClaimCode = value;
    }

    /**
     * Gets the value of the chargesAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getChargesAmount() {
        return chargesAmount;
    }

    /**
     * Sets the value of the chargesAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setChargesAmount(Position value) {
        this.chargesAmount = value;
    }

    /**
     * Gets the value of the foreignPortOfLadingCode property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getForeignPortOfLadingCode() {
        return foreignPortOfLadingCode;
    }

    /**
     * Sets the value of the foreignPortOfLadingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setForeignPortOfLadingCode(Position value) {
        this.foreignPortOfLadingCode = value;
    }

    /**
     * Gets the value of the grossShippingWeight property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getGrossShippingWeight() {
        return grossShippingWeight;
    }

    /**
     * Sets the value of the grossShippingWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setGrossShippingWeight(Position value) {
        this.grossShippingWeight = value;
    }

    /**
     * Gets the value of the categoryCodeTextiles property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getCategoryCodeTextiles() {
        return categoryCodeTextiles;
    }

    /**
     * Sets the value of the categoryCodeTextiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setCategoryCodeTextiles(Position value) {
        this.categoryCodeTextiles = value;
    }

    /**
     * Gets the value of the productClaimCode property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getProductClaimCode() {
        return productClaimCode;
    }

    /**
     * Sets the value of the productClaimCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setProductClaimCode(Position value) {
        this.productClaimCode = value;
    }

    /**
     * Gets the value of the relatedPartyIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getRelatedPartyIndicator() {
        return relatedPartyIndicator;
    }

    /**
     * Sets the value of the relatedPartyIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setRelatedPartyIndicator(Position value) {
        this.relatedPartyIndicator = value;
    }

    /**
     * Gets the value of the naftaNetCostIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getNaftaNetCostIndicator() {
        return naftaNetCostIndicator;
    }

    /**
     * Sets the value of the naftaNetCostIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setNaftaNetCostIndicator(Position value) {
        this.naftaNetCostIndicator = value;
    }

    /**
     * Gets the value of the feeExemptionCode property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getFeeExemptionCode() {
        return feeExemptionCode;
    }

    /**
     * Sets the value of the feeExemptionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setFeeExemptionCode(Position value) {
        this.feeExemptionCode = value;
    }

    /**
     * Gets the value of the adCaseNonReimbursementStatement property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getAdCaseNonReimbursementStatement() {
        return adCaseNonReimbursementStatement;
    }

    /**
     * Sets the value of the adCaseNonReimbursementStatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setAdCaseNonReimbursementStatement(Position value) {
        this.adCaseNonReimbursementStatement = value;
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
