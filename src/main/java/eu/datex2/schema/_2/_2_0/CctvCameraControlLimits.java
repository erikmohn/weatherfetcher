
package eu.datex2.schema._2._2_0;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CctvCameraControlLimits complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CctvCameraControlLimits">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cctvEndStopMinPanValue" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="cctvEndStopMaxPanValue" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="cctvEndStopMinTiltValue" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="cctvEndStopMaxTiltValue" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="cctvMaxZoomValue" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="cctvCameraNonDwellZone" type="{http://datex2.eu/schema/2/2_0}CctvCameraNonDwellZone" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="cctvCameraControlLimitsExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CctvCameraControlLimits", propOrder = {
    "cctvEndStopMinPanValue",
    "cctvEndStopMaxPanValue",
    "cctvEndStopMinTiltValue",
    "cctvEndStopMaxTiltValue",
    "cctvMaxZoomValue",
    "cctvCameraNonDwellZone",
    "cctvCameraControlLimitsExtension"
})
public class CctvCameraControlLimits {

    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger cctvEndStopMinPanValue;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger cctvEndStopMaxPanValue;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger cctvEndStopMinTiltValue;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger cctvEndStopMaxTiltValue;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger cctvMaxZoomValue;
    protected List<CctvCameraNonDwellZone> cctvCameraNonDwellZone;
    protected ExtensionType cctvCameraControlLimitsExtension;

    /**
     * Gets the value of the cctvEndStopMinPanValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCctvEndStopMinPanValue() {
        return cctvEndStopMinPanValue;
    }

    /**
     * Sets the value of the cctvEndStopMinPanValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCctvEndStopMinPanValue(BigInteger value) {
        this.cctvEndStopMinPanValue = value;
    }

    /**
     * Gets the value of the cctvEndStopMaxPanValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCctvEndStopMaxPanValue() {
        return cctvEndStopMaxPanValue;
    }

    /**
     * Sets the value of the cctvEndStopMaxPanValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCctvEndStopMaxPanValue(BigInteger value) {
        this.cctvEndStopMaxPanValue = value;
    }

    /**
     * Gets the value of the cctvEndStopMinTiltValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCctvEndStopMinTiltValue() {
        return cctvEndStopMinTiltValue;
    }

    /**
     * Sets the value of the cctvEndStopMinTiltValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCctvEndStopMinTiltValue(BigInteger value) {
        this.cctvEndStopMinTiltValue = value;
    }

    /**
     * Gets the value of the cctvEndStopMaxTiltValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCctvEndStopMaxTiltValue() {
        return cctvEndStopMaxTiltValue;
    }

    /**
     * Sets the value of the cctvEndStopMaxTiltValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCctvEndStopMaxTiltValue(BigInteger value) {
        this.cctvEndStopMaxTiltValue = value;
    }

    /**
     * Gets the value of the cctvMaxZoomValue property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCctvMaxZoomValue() {
        return cctvMaxZoomValue;
    }

    /**
     * Sets the value of the cctvMaxZoomValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCctvMaxZoomValue(BigInteger value) {
        this.cctvMaxZoomValue = value;
    }

    /**
     * Gets the value of the cctvCameraNonDwellZone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cctvCameraNonDwellZone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCctvCameraNonDwellZone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CctvCameraNonDwellZone }
     * 
     * 
     */
    public List<CctvCameraNonDwellZone> getCctvCameraNonDwellZone() {
        if (cctvCameraNonDwellZone == null) {
            cctvCameraNonDwellZone = new ArrayList<CctvCameraNonDwellZone>();
        }
        return this.cctvCameraNonDwellZone;
    }

    /**
     * Gets the value of the cctvCameraControlLimitsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getCctvCameraControlLimitsExtension() {
        return cctvCameraControlLimitsExtension;
    }

    /**
     * Sets the value of the cctvCameraControlLimitsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setCctvCameraControlLimitsExtension(ExtensionType value) {
        this.cctvCameraControlLimitsExtension = value;
    }

}
