
package eu.datex2.schema._2._2_0;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CctvCameraStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CctvCameraStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cctvCameraReference" type="{http://datex2.eu/schema/2/2_0}_CctvCameraMetadataRecordVersionedReference"/>
 *         &lt;element name="cctvCameraStatusTime" type="{http://datex2.eu/schema/2/2_0}DateTime"/>
 *         &lt;element name="cctvCameraOrientationBearing" type="{http://datex2.eu/schema/2/2_0}AngleInDegrees" minOccurs="0"/>
 *         &lt;element name="cctvCameraOrientationCompass" type="{http://datex2.eu/schema/2/2_0}DirectionCompassEnum" minOccurs="0"/>
 *         &lt;element name="source" type="{http://datex2.eu/schema/2/2_0}Source" minOccurs="0"/>
 *         &lt;element name="cctvCurrentlyMonitoredLocation" type="{http://datex2.eu/schema/2/2_0}Location" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="cctvStillImageServiceStatus" type="{http://datex2.eu/schema/2/2_0}CctvStillImageServiceStatus" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="cctvVideoServiceStatus" type="{http://datex2.eu/schema/2/2_0}CctvVideoServiceStatus" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="cctvCameraControlStatus" type="{http://datex2.eu/schema/2/2_0}CctvCameraControlStatus" minOccurs="0"/>
 *         &lt;element name="cctvCameraStatusExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CctvCameraStatus", propOrder = {
    "cctvCameraReference",
    "cctvCameraStatusTime",
    "cctvCameraOrientationBearing",
    "cctvCameraOrientationCompass",
    "source",
    "cctvCurrentlyMonitoredLocation",
    "cctvStillImageServiceStatus",
    "cctvVideoServiceStatus",
    "cctvCameraControlStatus",
    "cctvCameraStatusExtension"
})
public class CctvCameraStatus {

    @XmlElement(required = true)
    protected CctvCameraMetadataRecordVersionedReference cctvCameraReference;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cctvCameraStatusTime;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger cctvCameraOrientationBearing;
    @XmlSchemaType(name = "string")
    protected DirectionCompassEnum cctvCameraOrientationCompass;
    protected Source source;
    protected List<Location> cctvCurrentlyMonitoredLocation;
    protected List<CctvStillImageServiceStatus> cctvStillImageServiceStatus;
    protected List<CctvVideoServiceStatus> cctvVideoServiceStatus;
    protected CctvCameraControlStatus cctvCameraControlStatus;
    protected ExtensionType cctvCameraStatusExtension;

    /**
     * Gets the value of the cctvCameraReference property.
     * 
     * @return
     *     possible object is
     *     {@link CctvCameraMetadataRecordVersionedReference }
     *     
     */
    public CctvCameraMetadataRecordVersionedReference getCctvCameraReference() {
        return cctvCameraReference;
    }

    /**
     * Sets the value of the cctvCameraReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CctvCameraMetadataRecordVersionedReference }
     *     
     */
    public void setCctvCameraReference(CctvCameraMetadataRecordVersionedReference value) {
        this.cctvCameraReference = value;
    }

    /**
     * Gets the value of the cctvCameraStatusTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCctvCameraStatusTime() {
        return cctvCameraStatusTime;
    }

    /**
     * Sets the value of the cctvCameraStatusTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCctvCameraStatusTime(XMLGregorianCalendar value) {
        this.cctvCameraStatusTime = value;
    }

    /**
     * Gets the value of the cctvCameraOrientationBearing property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCctvCameraOrientationBearing() {
        return cctvCameraOrientationBearing;
    }

    /**
     * Sets the value of the cctvCameraOrientationBearing property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCctvCameraOrientationBearing(BigInteger value) {
        this.cctvCameraOrientationBearing = value;
    }

    /**
     * Gets the value of the cctvCameraOrientationCompass property.
     * 
     * @return
     *     possible object is
     *     {@link DirectionCompassEnum }
     *     
     */
    public DirectionCompassEnum getCctvCameraOrientationCompass() {
        return cctvCameraOrientationCompass;
    }

    /**
     * Sets the value of the cctvCameraOrientationCompass property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionCompassEnum }
     *     
     */
    public void setCctvCameraOrientationCompass(DirectionCompassEnum value) {
        this.cctvCameraOrientationCompass = value;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link Source }
     *     
     */
    public Source getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link Source }
     *     
     */
    public void setSource(Source value) {
        this.source = value;
    }

    /**
     * Gets the value of the cctvCurrentlyMonitoredLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cctvCurrentlyMonitoredLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCctvCurrentlyMonitoredLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Location }
     * 
     * 
     */
    public List<Location> getCctvCurrentlyMonitoredLocation() {
        if (cctvCurrentlyMonitoredLocation == null) {
            cctvCurrentlyMonitoredLocation = new ArrayList<Location>();
        }
        return this.cctvCurrentlyMonitoredLocation;
    }

    /**
     * Gets the value of the cctvStillImageServiceStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cctvStillImageServiceStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCctvStillImageServiceStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CctvStillImageServiceStatus }
     * 
     * 
     */
    public List<CctvStillImageServiceStatus> getCctvStillImageServiceStatus() {
        if (cctvStillImageServiceStatus == null) {
            cctvStillImageServiceStatus = new ArrayList<CctvStillImageServiceStatus>();
        }
        return this.cctvStillImageServiceStatus;
    }

    /**
     * Gets the value of the cctvVideoServiceStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cctvVideoServiceStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCctvVideoServiceStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CctvVideoServiceStatus }
     * 
     * 
     */
    public List<CctvVideoServiceStatus> getCctvVideoServiceStatus() {
        if (cctvVideoServiceStatus == null) {
            cctvVideoServiceStatus = new ArrayList<CctvVideoServiceStatus>();
        }
        return this.cctvVideoServiceStatus;
    }

    /**
     * Gets the value of the cctvCameraControlStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CctvCameraControlStatus }
     *     
     */
    public CctvCameraControlStatus getCctvCameraControlStatus() {
        return cctvCameraControlStatus;
    }

    /**
     * Sets the value of the cctvCameraControlStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CctvCameraControlStatus }
     *     
     */
    public void setCctvCameraControlStatus(CctvCameraControlStatus value) {
        this.cctvCameraControlStatus = value;
    }

    /**
     * Gets the value of the cctvCameraStatusExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getCctvCameraStatusExtension() {
        return cctvCameraStatusExtension;
    }

    /**
     * Sets the value of the cctvCameraStatusExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setCctvCameraStatusExtension(ExtensionType value) {
        this.cctvCameraStatusExtension = value;
    }

}
