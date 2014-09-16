
package eu.datex2.schema._2._2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CctvCameraControlData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CctvCameraControlData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cctvCameraTrueNorthPosition" type="{http://datex2.eu/schema/2/2_0}CctvCameraTrueNorthPosition" minOccurs="0"/>
 *         &lt;element name="availablePresetsForCctvCamera" type="{http://datex2.eu/schema/2/2_0}CctvCameraPresets" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="cctvCameraControlLimits" type="{http://datex2.eu/schema/2/2_0}CctvCameraControlLimits" minOccurs="0"/>
 *         &lt;element name="cctvCameraControlDataExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CctvCameraControlData", propOrder = {
    "cctvCameraTrueNorthPosition",
    "availablePresetsForCctvCamera",
    "cctvCameraControlLimits",
    "cctvCameraControlDataExtension"
})
public class CctvCameraControlData {

    protected CctvCameraTrueNorthPosition cctvCameraTrueNorthPosition;
    protected List<CctvCameraPresets> availablePresetsForCctvCamera;
    protected CctvCameraControlLimits cctvCameraControlLimits;
    protected ExtensionType cctvCameraControlDataExtension;

    /**
     * Gets the value of the cctvCameraTrueNorthPosition property.
     * 
     * @return
     *     possible object is
     *     {@link CctvCameraTrueNorthPosition }
     *     
     */
    public CctvCameraTrueNorthPosition getCctvCameraTrueNorthPosition() {
        return cctvCameraTrueNorthPosition;
    }

    /**
     * Sets the value of the cctvCameraTrueNorthPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link CctvCameraTrueNorthPosition }
     *     
     */
    public void setCctvCameraTrueNorthPosition(CctvCameraTrueNorthPosition value) {
        this.cctvCameraTrueNorthPosition = value;
    }

    /**
     * Gets the value of the availablePresetsForCctvCamera property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the availablePresetsForCctvCamera property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvailablePresetsForCctvCamera().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CctvCameraPresets }
     * 
     * 
     */
    public List<CctvCameraPresets> getAvailablePresetsForCctvCamera() {
        if (availablePresetsForCctvCamera == null) {
            availablePresetsForCctvCamera = new ArrayList<CctvCameraPresets>();
        }
        return this.availablePresetsForCctvCamera;
    }

    /**
     * Gets the value of the cctvCameraControlLimits property.
     * 
     * @return
     *     possible object is
     *     {@link CctvCameraControlLimits }
     *     
     */
    public CctvCameraControlLimits getCctvCameraControlLimits() {
        return cctvCameraControlLimits;
    }

    /**
     * Sets the value of the cctvCameraControlLimits property.
     * 
     * @param value
     *     allowed object is
     *     {@link CctvCameraControlLimits }
     *     
     */
    public void setCctvCameraControlLimits(CctvCameraControlLimits value) {
        this.cctvCameraControlLimits = value;
    }

    /**
     * Gets the value of the cctvCameraControlDataExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getCctvCameraControlDataExtension() {
        return cctvCameraControlDataExtension;
    }

    /**
     * Sets the value of the cctvCameraControlDataExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setCctvCameraControlDataExtension(ExtensionType value) {
        this.cctvCameraControlDataExtension = value;
    }

}
