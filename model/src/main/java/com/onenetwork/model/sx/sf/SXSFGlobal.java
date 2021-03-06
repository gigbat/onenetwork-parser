//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.22 at 07:16:43 PM EEST 
//


package com.onenetwork.model.sx.sf;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SXSFGlobal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SXSFGlobal"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SF10RecordDataElement" type="{http://www.model.onenetwork.com/sx/sf}SF10RecordDataElement"/&gt;
 *         &lt;element name="SF20RecordDataElement" type="{http://www.model.onenetwork.com/sx/sf}SF20RecordDataElement"/&gt;
 *         &lt;element name="SF25RecordDataElement" type="{http://www.model.onenetwork.com/sx/sf}SF25RecordDataElement"/&gt;
 *         &lt;element name="SF30RecordDataElement" type="{http://www.model.onenetwork.com/sx/sf}SF30RecordDataElement"/&gt;
 *         &lt;element name="SF31RecordDataElement" type="{http://www.model.onenetwork.com/sx/sf}SF31RecordDataElement"/&gt;
 *         &lt;element name="SF35RecordDataElement" type="{http://www.model.onenetwork.com/sx/sf}SF35RecordDataElement"/&gt;
 *         &lt;element name="SF36RecordDataElement" type="{http://www.model.onenetwork.com/sx/sf}SF36RecordDataElement"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SXSFGlobal", propOrder = {
    "sf10RecordDataElement",
    "sf20RecordDataElement",
    "sf25RecordDataElement",
    "sf30RecordDataElement",
    "sf31RecordDataElement",
    "sf35RecordDataElement",
    "sf36RecordDataElement"
})
public class SXSFGlobal {

    @XmlElement(name = "SF10RecordDataElement", required = true)
    protected SF10RecordDataElement sf10RecordDataElement;
    @XmlElement(name = "SF20RecordDataElement", required = true)
    protected SF20RecordDataElement sf20RecordDataElement;
    @XmlElement(name = "SF25RecordDataElement", required = true)
    protected SF25RecordDataElement sf25RecordDataElement;
    @XmlElement(name = "SF30RecordDataElement", required = true)
    protected SF30RecordDataElement sf30RecordDataElement;
    @XmlElement(name = "SF31RecordDataElement", required = true)
    protected SF31RecordDataElement sf31RecordDataElement;
    @XmlElement(name = "SF35RecordDataElement", required = true)
    protected SF35RecordDataElement sf35RecordDataElement;
    @XmlElement(name = "SF36RecordDataElement", required = true)
    protected SF36RecordDataElement sf36RecordDataElement;

    /**
     * Gets the value of the sf10RecordDataElement property.
     * 
     * @return
     *     possible object is
     *     {@link SF10RecordDataElement }
     *     
     */
    public SF10RecordDataElement getSF10RecordDataElement() {
        return sf10RecordDataElement;
    }

    /**
     * Sets the value of the sf10RecordDataElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link SF10RecordDataElement }
     *     
     */
    public void setSF10RecordDataElement(SF10RecordDataElement value) {
        this.sf10RecordDataElement = value;
    }

    /**
     * Gets the value of the sf20RecordDataElement property.
     * 
     * @return
     *     possible object is
     *     {@link SF20RecordDataElement }
     *     
     */
    public SF20RecordDataElement getSF20RecordDataElement() {
        return sf20RecordDataElement;
    }

    /**
     * Sets the value of the sf20RecordDataElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link SF20RecordDataElement }
     *     
     */
    public void setSF20RecordDataElement(SF20RecordDataElement value) {
        this.sf20RecordDataElement = value;
    }

    /**
     * Gets the value of the sf25RecordDataElement property.
     * 
     * @return
     *     possible object is
     *     {@link SF25RecordDataElement }
     *     
     */
    public SF25RecordDataElement getSF25RecordDataElement() {
        return sf25RecordDataElement;
    }

    /**
     * Sets the value of the sf25RecordDataElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link SF25RecordDataElement }
     *     
     */
    public void setSF25RecordDataElement(SF25RecordDataElement value) {
        this.sf25RecordDataElement = value;
    }

    /**
     * Gets the value of the sf30RecordDataElement property.
     * 
     * @return
     *     possible object is
     *     {@link SF30RecordDataElement }
     *     
     */
    public SF30RecordDataElement getSF30RecordDataElement() {
        return sf30RecordDataElement;
    }

    /**
     * Sets the value of the sf30RecordDataElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link SF30RecordDataElement }
     *     
     */
    public void setSF30RecordDataElement(SF30RecordDataElement value) {
        this.sf30RecordDataElement = value;
    }

    /**
     * Gets the value of the sf31RecordDataElement property.
     * 
     * @return
     *     possible object is
     *     {@link SF31RecordDataElement }
     *     
     */
    public SF31RecordDataElement getSF31RecordDataElement() {
        return sf31RecordDataElement;
    }

    /**
     * Sets the value of the sf31RecordDataElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link SF31RecordDataElement }
     *     
     */
    public void setSF31RecordDataElement(SF31RecordDataElement value) {
        this.sf31RecordDataElement = value;
    }

    /**
     * Gets the value of the sf35RecordDataElement property.
     * 
     * @return
     *     possible object is
     *     {@link SF35RecordDataElement }
     *     
     */
    public SF35RecordDataElement getSF35RecordDataElement() {
        return sf35RecordDataElement;
    }

    /**
     * Sets the value of the sf35RecordDataElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link SF35RecordDataElement }
     *     
     */
    public void setSF35RecordDataElement(SF35RecordDataElement value) {
        this.sf35RecordDataElement = value;
    }

    /**
     * Gets the value of the sf36RecordDataElement property.
     * 
     * @return
     *     possible object is
     *     {@link SF36RecordDataElement }
     *     
     */
    public SF36RecordDataElement getSF36RecordDataElement() {
        return sf36RecordDataElement;
    }

    /**
     * Sets the value of the sf36RecordDataElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link SF36RecordDataElement }
     *     
     */
    public void setSF36RecordDataElement(SF36RecordDataElement value) {
        this.sf36RecordDataElement = value;
    }

}
