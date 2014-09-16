
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationByReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationByReference">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}Location">
 *       &lt;sequence>
 *         &lt;element name="predefinedLocationReference" type="{http://datex2.eu/schema/2/2_0}_PredefinedLocationVersionedReference"/>
 *         &lt;element name="locationByReferenceExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationByReference", propOrder = {
    "predefinedLocationReference",
    "locationByReferenceExtension"
})
public class LocationByReference
    extends Location
{

    @XmlElement(required = true)
    protected PredefinedLocationVersionedReference predefinedLocationReference;
    protected ExtensionType locationByReferenceExtension;

    /**
     * Gets the value of the predefinedLocationReference property.
     * 
     * @return
     *     possible object is
     *     {@link PredefinedLocationVersionedReference }
     *     
     */
    public PredefinedLocationVersionedReference getPredefinedLocationReference() {
        return predefinedLocationReference;
    }

    /**
     * Sets the value of the predefinedLocationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PredefinedLocationVersionedReference }
     *     
     */
    public void setPredefinedLocationReference(PredefinedLocationVersionedReference value) {
        this.predefinedLocationReference = value;
    }

    /**
     * Gets the value of the locationByReferenceExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getLocationByReferenceExtension() {
        return locationByReferenceExtension;
    }

    /**
     * Sets the value of the locationByReferenceExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setLocationByReferenceExtension(ExtensionType value) {
        this.locationByReferenceExtension = value;
    }

}
