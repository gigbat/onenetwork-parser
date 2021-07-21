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
 * <p>Java class for TenRecordDataElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TenRecordDataElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="controlIdentifier" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="summaryFilingActionRequestCode" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="entryFilerCode" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="entryNumber" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="districtOrPortOfEntry" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="brokerReferenceNumber" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="entryTypeCode" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="modeOfTransportationCode" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="bondWaiverIndicator" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="electronicSignature" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="cargoReleaseCertificationRequestIndicator" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="electronicInvoiceIndicator" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="consolidatedSummaryIndicator" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="shipmentUsageTypeCode" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="liveEntryIndicator" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="deferredTaxPaymentCode" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="tradeAgreementReconciliationIndicator" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="reconciliationIssueCode" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="paymentTypeCode" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="preliminaryStatementPrintDate" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="periodicStatementMonth" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="statementClientBranchIdentifier" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="bondWaiverReasonCode" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="postSummaryCorrectionIndicator" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="acceleratedLiquidationRequestIndicator" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="knownImporterIndicator" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="pgaDataIncludedIndicator" type="{http://www.model.onenetwork.com/position}Position"/&gt;
 *         &lt;element name="tibDeclarationIndicator" type="{http://www.model.onenetwork.com/position}Position"/&gt;
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
@XmlType(name = "TenRecordDataElement", propOrder = {
    "controlIdentifier",
    "summaryFilingActionRequestCode",
    "entryFilerCode",
    "entryNumber",
    "districtOrPortOfEntry",
    "brokerReferenceNumber",
    "entryTypeCode",
    "modeOfTransportationCode",
    "bondWaiverIndicator",
    "electronicSignature",
    "cargoReleaseCertificationRequestIndicator",
    "electronicInvoiceIndicator",
    "consolidatedSummaryIndicator",
    "shipmentUsageTypeCode",
    "liveEntryIndicator",
    "deferredTaxPaymentCode",
    "tradeAgreementReconciliationIndicator",
    "reconciliationIssueCode",
    "paymentTypeCode",
    "preliminaryStatementPrintDate",
    "periodicStatementMonth",
    "statementClientBranchIdentifier",
    "bondWaiverReasonCode",
    "postSummaryCorrectionIndicator",
    "acceleratedLiquidationRequestIndicator",
    "knownImporterIndicator",
    "pgaDataIncludedIndicator",
    "tibDeclarationIndicator",
    "defaultControlIdentifier",
    "messageType"
})
public class TenRecordDataElement {

    @XmlElement(required = true)
    protected Position controlIdentifier;
    @XmlElement(required = true)
    protected Position summaryFilingActionRequestCode;
    @XmlElement(required = true)
    protected Position entryFilerCode;
    @XmlElement(required = true)
    protected Position entryNumber;
    @XmlElement(required = true)
    protected Position districtOrPortOfEntry;
    @XmlElement(required = true)
    protected Position brokerReferenceNumber;
    @XmlElement(required = true)
    protected Position entryTypeCode;
    @XmlElement(required = true)
    protected Position modeOfTransportationCode;
    @XmlElement(required = true)
    protected Position bondWaiverIndicator;
    @XmlElement(required = true)
    protected Position electronicSignature;
    @XmlElement(required = true)
    protected Position cargoReleaseCertificationRequestIndicator;
    @XmlElement(required = true)
    protected Position electronicInvoiceIndicator;
    @XmlElement(required = true)
    protected Position consolidatedSummaryIndicator;
    @XmlElement(required = true)
    protected Position shipmentUsageTypeCode;
    @XmlElement(required = true)
    protected Position liveEntryIndicator;
    @XmlElement(required = true)
    protected Position deferredTaxPaymentCode;
    @XmlElement(required = true)
    protected Position tradeAgreementReconciliationIndicator;
    @XmlElement(required = true)
    protected Position reconciliationIssueCode;
    @XmlElement(required = true)
    protected Position paymentTypeCode;
    @XmlElement(required = true)
    protected Position preliminaryStatementPrintDate;
    @XmlElement(required = true)
    protected Position periodicStatementMonth;
    @XmlElement(required = true)
    protected Position statementClientBranchIdentifier;
    @XmlElement(required = true)
    protected Position bondWaiverReasonCode;
    @XmlElement(required = true)
    protected Position postSummaryCorrectionIndicator;
    @XmlElement(required = true)
    protected Position acceleratedLiquidationRequestIndicator;
    @XmlElement(required = true)
    protected Position knownImporterIndicator;
    @XmlElement(required = true)
    protected Position pgaDataIncludedIndicator;
    @XmlElement(required = true)
    protected Position tibDeclarationIndicator;
    @XmlElement(defaultValue = "10")
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
     * Gets the value of the summaryFilingActionRequestCode property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getSummaryFilingActionRequestCode() {
        return summaryFilingActionRequestCode;
    }

    /**
     * Sets the value of the summaryFilingActionRequestCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setSummaryFilingActionRequestCode(Position value) {
        this.summaryFilingActionRequestCode = value;
    }

    /**
     * Gets the value of the entryFilerCode property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getEntryFilerCode() {
        return entryFilerCode;
    }

    /**
     * Sets the value of the entryFilerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setEntryFilerCode(Position value) {
        this.entryFilerCode = value;
    }

    /**
     * Gets the value of the entryNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getEntryNumber() {
        return entryNumber;
    }

    /**
     * Sets the value of the entryNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setEntryNumber(Position value) {
        this.entryNumber = value;
    }

    /**
     * Gets the value of the districtOrPortOfEntry property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getDistrictOrPortOfEntry() {
        return districtOrPortOfEntry;
    }

    /**
     * Sets the value of the districtOrPortOfEntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setDistrictOrPortOfEntry(Position value) {
        this.districtOrPortOfEntry = value;
    }

    /**
     * Gets the value of the brokerReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getBrokerReferenceNumber() {
        return brokerReferenceNumber;
    }

    /**
     * Sets the value of the brokerReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setBrokerReferenceNumber(Position value) {
        this.brokerReferenceNumber = value;
    }

    /**
     * Gets the value of the entryTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getEntryTypeCode() {
        return entryTypeCode;
    }

    /**
     * Sets the value of the entryTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setEntryTypeCode(Position value) {
        this.entryTypeCode = value;
    }

    /**
     * Gets the value of the modeOfTransportationCode property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getModeOfTransportationCode() {
        return modeOfTransportationCode;
    }

    /**
     * Sets the value of the modeOfTransportationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setModeOfTransportationCode(Position value) {
        this.modeOfTransportationCode = value;
    }

    /**
     * Gets the value of the bondWaiverIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getBondWaiverIndicator() {
        return bondWaiverIndicator;
    }

    /**
     * Sets the value of the bondWaiverIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setBondWaiverIndicator(Position value) {
        this.bondWaiverIndicator = value;
    }

    /**
     * Gets the value of the electronicSignature property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getElectronicSignature() {
        return electronicSignature;
    }

    /**
     * Sets the value of the electronicSignature property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setElectronicSignature(Position value) {
        this.electronicSignature = value;
    }

    /**
     * Gets the value of the cargoReleaseCertificationRequestIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getCargoReleaseCertificationRequestIndicator() {
        return cargoReleaseCertificationRequestIndicator;
    }

    /**
     * Sets the value of the cargoReleaseCertificationRequestIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setCargoReleaseCertificationRequestIndicator(Position value) {
        this.cargoReleaseCertificationRequestIndicator = value;
    }

    /**
     * Gets the value of the electronicInvoiceIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getElectronicInvoiceIndicator() {
        return electronicInvoiceIndicator;
    }

    /**
     * Sets the value of the electronicInvoiceIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setElectronicInvoiceIndicator(Position value) {
        this.electronicInvoiceIndicator = value;
    }

    /**
     * Gets the value of the consolidatedSummaryIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getConsolidatedSummaryIndicator() {
        return consolidatedSummaryIndicator;
    }

    /**
     * Sets the value of the consolidatedSummaryIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setConsolidatedSummaryIndicator(Position value) {
        this.consolidatedSummaryIndicator = value;
    }

    /**
     * Gets the value of the shipmentUsageTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getShipmentUsageTypeCode() {
        return shipmentUsageTypeCode;
    }

    /**
     * Sets the value of the shipmentUsageTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setShipmentUsageTypeCode(Position value) {
        this.shipmentUsageTypeCode = value;
    }

    /**
     * Gets the value of the liveEntryIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getLiveEntryIndicator() {
        return liveEntryIndicator;
    }

    /**
     * Sets the value of the liveEntryIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setLiveEntryIndicator(Position value) {
        this.liveEntryIndicator = value;
    }

    /**
     * Gets the value of the deferredTaxPaymentCode property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getDeferredTaxPaymentCode() {
        return deferredTaxPaymentCode;
    }

    /**
     * Sets the value of the deferredTaxPaymentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setDeferredTaxPaymentCode(Position value) {
        this.deferredTaxPaymentCode = value;
    }

    /**
     * Gets the value of the tradeAgreementReconciliationIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getTradeAgreementReconciliationIndicator() {
        return tradeAgreementReconciliationIndicator;
    }

    /**
     * Sets the value of the tradeAgreementReconciliationIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setTradeAgreementReconciliationIndicator(Position value) {
        this.tradeAgreementReconciliationIndicator = value;
    }

    /**
     * Gets the value of the reconciliationIssueCode property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getReconciliationIssueCode() {
        return reconciliationIssueCode;
    }

    /**
     * Sets the value of the reconciliationIssueCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setReconciliationIssueCode(Position value) {
        this.reconciliationIssueCode = value;
    }

    /**
     * Gets the value of the paymentTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getPaymentTypeCode() {
        return paymentTypeCode;
    }

    /**
     * Sets the value of the paymentTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setPaymentTypeCode(Position value) {
        this.paymentTypeCode = value;
    }

    /**
     * Gets the value of the preliminaryStatementPrintDate property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getPreliminaryStatementPrintDate() {
        return preliminaryStatementPrintDate;
    }

    /**
     * Sets the value of the preliminaryStatementPrintDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setPreliminaryStatementPrintDate(Position value) {
        this.preliminaryStatementPrintDate = value;
    }

    /**
     * Gets the value of the periodicStatementMonth property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getPeriodicStatementMonth() {
        return periodicStatementMonth;
    }

    /**
     * Sets the value of the periodicStatementMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setPeriodicStatementMonth(Position value) {
        this.periodicStatementMonth = value;
    }

    /**
     * Gets the value of the statementClientBranchIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getStatementClientBranchIdentifier() {
        return statementClientBranchIdentifier;
    }

    /**
     * Sets the value of the statementClientBranchIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setStatementClientBranchIdentifier(Position value) {
        this.statementClientBranchIdentifier = value;
    }

    /**
     * Gets the value of the bondWaiverReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getBondWaiverReasonCode() {
        return bondWaiverReasonCode;
    }

    /**
     * Sets the value of the bondWaiverReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setBondWaiverReasonCode(Position value) {
        this.bondWaiverReasonCode = value;
    }

    /**
     * Gets the value of the postSummaryCorrectionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getPostSummaryCorrectionIndicator() {
        return postSummaryCorrectionIndicator;
    }

    /**
     * Sets the value of the postSummaryCorrectionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setPostSummaryCorrectionIndicator(Position value) {
        this.postSummaryCorrectionIndicator = value;
    }

    /**
     * Gets the value of the acceleratedLiquidationRequestIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getAcceleratedLiquidationRequestIndicator() {
        return acceleratedLiquidationRequestIndicator;
    }

    /**
     * Sets the value of the acceleratedLiquidationRequestIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setAcceleratedLiquidationRequestIndicator(Position value) {
        this.acceleratedLiquidationRequestIndicator = value;
    }

    /**
     * Gets the value of the knownImporterIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getKnownImporterIndicator() {
        return knownImporterIndicator;
    }

    /**
     * Sets the value of the knownImporterIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setKnownImporterIndicator(Position value) {
        this.knownImporterIndicator = value;
    }

    /**
     * Gets the value of the pgaDataIncludedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getPgaDataIncludedIndicator() {
        return pgaDataIncludedIndicator;
    }

    /**
     * Sets the value of the pgaDataIncludedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setPgaDataIncludedIndicator(Position value) {
        this.pgaDataIncludedIndicator = value;
    }

    /**
     * Gets the value of the tibDeclarationIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Position }
     *     
     */
    public Position getTibDeclarationIndicator() {
        return tibDeclarationIndicator;
    }

    /**
     * Sets the value of the tibDeclarationIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Position }
     *     
     */
    public void setTibDeclarationIndicator(Position value) {
        this.tibDeclarationIndicator = value;
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
