
package eu.datex2.schema._2._2_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CctvCameraTrueNorthPosition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CctvCameraTrueNorthPosition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cctvNorthPanValue" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger"/>
 *         &lt;element name="cctvNorthTiltValue" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger"/>
 *         &lt;element name="cctvNorthZoomValue" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger"/>
 *         &lt;element name="cctvCameraTrueNorthPositionExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CctvCameraTrueNorthPosition", propOrder = {
    "cctvNorthPanValue",
    "cctvNorthTiltValue",
    "cctvNorthZoomValue",
    "cctvCameraTrueNorthPositionExtension"
})
public class CctvCameraTrueNorthPosition {

    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger cctvNorthPanValue;
    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger cctvNorthTiltValue;
    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger cctvNorthZoomValue;
    protected ExtensionType cctvCameraTrueNorthPositionExtension;

    /**
     * Gets the value of the cctvNorthPanValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCctvNorthPanValue() {
        return cctvNorthPanValue;
    }

    /**
     * Sets the value of the cctvNorthPanValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCctvNorthPanValue(BigInteger value) {
        this.cctvNorthPanValue = value;
    }

    /**
     * Gets the value of the cctvNorthTiltValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCctvNorthTiltValue() {
        return cctvNorthTiltValue;
    }

    /**
     * Sets the value of the cctvNorthTiltValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCctvNorthTiltValue(BigInteger value) {
        this.cctvNorthTiltValue = value;
    }

    /**
     * Gets the value of the cctvNorthZoomValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCctvNorthZoomValue() {
        return cctvNorthZoomValue;
    }

    /**
     * Sets the value of the cctvNorthZoomValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCctvNorthZoomValue(BigInteger value) {
        this.cctvNorthZoomValue = value;
    }

    /**
     * Gets the value of the cctvCameraTrueNorthPositionExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getCctvCameraTrueNorthPositionExtension() {
        return cctvCameraTrueNorthPositionExtension;
    }

    /**
     * Sets the value of the cctvCameraTrueNorthPositionExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setCctvCameraTrueNorthPositionExtension(ExtensionType value) {
        this.cctvCameraTrueNorthPositionExtension = value;
    }

}
