
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CctvCameraPresets complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CctvCameraPresets">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cctvCameraPresetIdentification" type="{http://datex2.eu/schema/2/2_0}String"/>
 *         &lt;element name="cctvCameraPresetName" type="{http://datex2.eu/schema/2/2_0}String" minOccurs="0"/>
 *         &lt;element name="cctvCameraPresetsExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CctvCameraPresets", propOrder = {
    "cctvCameraPresetIdentification",
    "cctvCameraPresetName",
    "cctvCameraPresetsExtension"
})
public class CctvCameraPresets {

    @XmlElement(required = true)
    protected String cctvCameraPresetIdentification;
    protected String cctvCameraPresetName;
    protected ExtensionType cctvCameraPresetsExtension;

    /**
     * Gets the value of the cctvCameraPresetIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCctvCameraPresetIdentification() {
        return cctvCameraPresetIdentification;
    }

    /**
     * Sets the value of the cctvCameraPresetIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCctvCameraPresetIdentification(String value) {
        this.cctvCameraPresetIdentification = value;
    }

    /**
     * Gets the value of the cctvCameraPresetName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCctvCameraPresetName() {
        return cctvCameraPresetName;
    }

    /**
     * Sets the value of the cctvCameraPresetName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCctvCameraPresetName(String value) {
        this.cctvCameraPresetName = value;
    }

    /**
     * Gets the value of the cctvCameraPresetsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getCctvCameraPresetsExtension() {
        return cctvCameraPresetsExtension;
    }

    /**
     * Sets the value of the cctvCameraPresetsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setCctvCameraPresetsExtension(ExtensionType value) {
        this.cctvCameraPresetsExtension = value;
    }

}
