//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.21 at 03:53:23 PM EEST 
//


package com.onenetwork.model.nr;

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
 *         &lt;element name="N1RecordDataElement" type="{http://www.model.onenetwork.com/nr}N1RecordDataElement"/&gt;
 *         &lt;element name="N2RecordDataElement" type="{http://www.model.onenetwork.com/nr}N2RecordDataElement"/&gt;
 *         &lt;element name="N3RecordDataElement" type="{http://www.model.onenetwork.com/nr}N3RecordDataElement"/&gt;
 *         &lt;element name="N4RecordDataElement" type="{http://www.model.onenetwork.com/nr}N4RecordDataElement"/&gt;
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
    "n1RecordDataElement",
    "n2RecordDataElement",
    "n3RecordDataElement",
    "n4RecordDataElement"
})
@XmlRootElement(name = "NRGlobal")
public class NRGlobal {

    @XmlElement(name = "N1RecordDataElement", required = true)
    protected N1RecordDataElement n1RecordDataElement;
    @XmlElement(name = "N2RecordDataElement", required = true)
    protected N2RecordDataElement n2RecordDataElement;
    @XmlElement(name = "N3RecordDataElement", required = true)
    protected N3RecordDataElement n3RecordDataElement;
    @XmlElement(name = "N4RecordDataElement", required = true)
    protected N4RecordDataElement n4RecordDataElement;

    /**
     * Gets the value of the n1RecordDataElement property.
     * 
     * @return
     *     possible object is
     *     {@link N1RecordDataElement }
     *     
     */
    public N1RecordDataElement getN1RecordDataElement() {
        return n1RecordDataElement;
    }

    /**
     * Sets the value of the n1RecordDataElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link N1RecordDataElement }
     *     
     */
    public void setN1RecordDataElement(N1RecordDataElement value) {
        this.n1RecordDataElement = value;
    }

    /**
     * Gets the value of the n2RecordDataElement property.
     * 
     * @return
     *     possible object is
     *     {@link N2RecordDataElement }
     *     
     */
    public N2RecordDataElement getN2RecordDataElement() {
        return n2RecordDataElement;
    }

    /**
     * Sets the value of the n2RecordDataElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link N2RecordDataElement }
     *     
     */
    public void setN2RecordDataElement(N2RecordDataElement value) {
        this.n2RecordDataElement = value;
    }

    /**
     * Gets the value of the n3RecordDataElement property.
     * 
     * @return
     *     possible object is
     *     {@link N3RecordDataElement }
     *     
     */
    public N3RecordDataElement getN3RecordDataElement() {
        return n3RecordDataElement;
    }

    /**
     * Sets the value of the n3RecordDataElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link N3RecordDataElement }
     *     
     */
    public void setN3RecordDataElement(N3RecordDataElement value) {
        this.n3RecordDataElement = value;
    }

    /**
     * Gets the value of the n4RecordDataElement property.
     * 
     * @return
     *     possible object is
     *     {@link N4RecordDataElement }
     *     
     */
    public N4RecordDataElement getN4RecordDataElement() {
        return n4RecordDataElement;
    }

    /**
     * Sets the value of the n4RecordDataElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link N4RecordDataElement }
     *     
     */
    public void setN4RecordDataElement(N4RecordDataElement value) {
        this.n4RecordDataElement = value;
    }

}
