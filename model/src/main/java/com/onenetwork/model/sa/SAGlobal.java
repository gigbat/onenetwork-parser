//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.21 at 11:00:31 PM EEST 
//


package com.onenetwork.model.sa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SA10RecordDataElement" type="{http://www.model.onenetwork.com/sa}SA10RecordDataElement"/&gt;
 *         &lt;element name="SA20RecordDataElement" type="{http://www.model.onenetwork.com/sa}SA20RecordDataElement"/&gt;
 *         &lt;element name="SA30RecordDataElement" type="{http://www.model.onenetwork.com/sa}SA30RecordDataElement"/&gt;
 *         &lt;element name="SA50RecordDataElement" type="{http://www.model.onenetwork.com/sa}SA50RecordDataElement"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sa10RecordDataElement",
    "sa20RecordDataElement",
    "sa30RecordDataElement",
    "sa50RecordDataElement"
})
@XmlRootElement(name = "SAGlobal")
public class SAGlobal {

    @XmlElement(name = "SA10RecordDataElement", required = true)
    protected SA10RecordDataElement sa10RecordDataElement;
    @XmlElement(name = "SA20RecordDataElement", required = true)
    protected SA20RecordDataElement sa20RecordDataElement;
    @XmlElement(name = "SA30RecordDataElement", required = true)
    protected SA30RecordDataElement sa30RecordDataElement;
    @XmlElement(name = "SA50RecordDataElement", required = true)
    protected SA50RecordDataElement sa50RecordDataElement;

    /**
     * Gets the value of the sa10RecordDataElement property.
     * 
     * @return
     *     possible object is
     *     {@link SA10RecordDataElement }
     *     
     */
    public SA10RecordDataElement getSA10RecordDataElement() {
        return sa10RecordDataElement;
    }

    /**
     * Sets the value of the sa10RecordDataElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link SA10RecordDataElement }
     *     
     */
    public void setSA10RecordDataElement(SA10RecordDataElement value) {
        this.sa10RecordDataElement = value;
    }

    /**
     * Gets the value of the sa20RecordDataElement property.
     * 
     * @return
     *     possible object is
     *     {@link SA20RecordDataElement }
     *     
     */
    public SA20RecordDataElement getSA20RecordDataElement() {
        return sa20RecordDataElement;
    }

    /**
     * Sets the value of the sa20RecordDataElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link SA20RecordDataElement }
     *     
     */
    public void setSA20RecordDataElement(SA20RecordDataElement value) {
        this.sa20RecordDataElement = value;
    }

    /**
     * Gets the value of the sa30RecordDataElement property.
     * 
     * @return
     *     possible object is
     *     {@link SA30RecordDataElement }
     *     
     */
    public SA30RecordDataElement getSA30RecordDataElement() {
        return sa30RecordDataElement;
    }

    /**
     * Sets the value of the sa30RecordDataElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link SA30RecordDataElement }
     *     
     */
    public void setSA30RecordDataElement(SA30RecordDataElement value) {
        this.sa30RecordDataElement = value;
    }

    /**
     * Gets the value of the sa50RecordDataElement property.
     * 
     * @return
     *     possible object is
     *     {@link SA50RecordDataElement }
     *     
     */
    public SA50RecordDataElement getSA50RecordDataElement() {
        return sa50RecordDataElement;
    }

    /**
     * Sets the value of the sa50RecordDataElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link SA50RecordDataElement }
     *     
     */
    public void setSA50RecordDataElement(SA50RecordDataElement value) {
        this.sa50RecordDataElement = value;
    }

}
