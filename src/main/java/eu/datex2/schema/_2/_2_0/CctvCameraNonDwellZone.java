
package eu.datex2.schema._2._2_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CctvCameraNonDwellZone complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CctvCameraNonDwellZone">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cctvNonDwellTopLeftPanValue" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger"/>
 *         &lt;element name="cctvNonDwellTopLeftTiltValue" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger"/>
 *         &lt;element name="cctvNonDwellBottomRightPanValue" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger"/>
 *         &lt;element name="cctvNonDwellBottomRightTiltValue" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger"/>
 *         &lt;element name="cctvCameraNonDwellZoneExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CctvCameraNonDwellZone", propOrder = {
    "cctvNonDwellTopLeftPanValue",
    "cctvNonDwellTopLeftTiltValue",
    "cctvNonDwellBottomRightPanValue",
    "cctvNonDwellBottomRightTiltValue",
    "cctvCameraNonDwellZoneExtension"
})
public class CctvCameraNonDwellZone {

    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger cctvNonDwellTopLeftPanValue;
    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger cctvNonDwellTopLeftTiltValue;
    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger cctvNonDwellBottomRightPanValue;
    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger cctvNonDwellBottomRightTiltValue;
    protected ExtensionType cctvCameraNonDwellZoneExtension;

    /**
     * Gets the value of the cctvNonDwellTopLeftPanValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCctvNonDwellTopLeftPanValue() {
        return cctvNonDwellTopLeftPanValue;
    }

    /**
     * Sets the value of the cctvNonDwellTopLeftPanValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCctvNonDwellTopLeftPanValue(BigInteger value) {
        this.cctvNonDwellTopLeftPanValue = value;
    }

    /**
     * Gets the value of the cctvNonDwellTopLeftTiltValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCctvNonDwellTopLeftTiltValue() {
        return cctvNonDwellTopLeftTiltValue;
    }

    /**
     * Sets the value of the cctvNonDwellTopLeftTiltValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCctvNonDwellTopLeftTiltValue(BigInteger value) {
        this.cctvNonDwellTopLeftTiltValue = value;
    }

    /**
     * Gets the value of the cctvNonDwellBottomRightPanValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCctvNonDwellBottomRightPanValue() {
        return cctvNonDwellBottomRightPanValue;
    }

    /**
     * Sets the value of the cctvNonDwellBottomRightPanValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCctvNonDwellBottomRightPanValue(BigInteger value) {
        this.cctvNonDwellBottomRightPanValue = value;
    }

    /**
     * Gets the value of the cctvNonDwellBottomRightTiltValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCctvNonDwellBottomRightTiltValue() {
        return cctvNonDwellBottomRightTiltValue;
    }

    /**
     * Sets the value of the cctvNonDwellBottomRightTiltValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCctvNonDwellBottomRightTiltValue(BigInteger value) {
        this.cctvNonDwellBottomRightTiltValue = value;
    }

    /**
     * Gets the value of the cctvCameraNonDwellZoneExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getCctvCameraNonDwellZoneExtension() {
        return cctvCameraNonDwellZoneExtension;
    }

    /**
     * Sets the value of the cctvCameraNonDwellZoneExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setCctvCameraNonDwellZoneExtension(ExtensionType value) {
        this.cctvCameraNonDwellZoneExtension = value;
    }

}
