
package eu.datex2.schema._2._2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Location complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Location">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}GroupOfLocations">
 *       &lt;sequence>
 *         &lt;element name="externalReferencing" type="{http://datex2.eu/schema/2/2_0}ExternalReferencing" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="locationForDisplay" type="{http://datex2.eu/schema/2/2_0}PointCoordinates" minOccurs="0"/>
 *         &lt;element name="locationExtension" type="{http://datex2.eu/schema/2/2_0}_LocationExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Location", propOrder = {
    "externalReferencing",
    "locationForDisplay",
    "locationExtension"
})
@XmlSeeAlso({
    LocationByReference.class,
    NetworkLocation.class,
    Area.class
})
public abstract class Location
    extends GroupOfLocations
{

    protected List<ExternalReferencing> externalReferencing;
    protected PointCoordinates locationForDisplay;
    protected LocationExtensionType locationExtension;

    /**
     * Gets the value of the externalReferencing property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the externalReferencing property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExternalReferencing().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExternalReferencing }
     * 
     * 
     */
    public List<ExternalReferencing> getExternalReferencing() {
        if (externalReferencing == null) {
            externalReferencing = new ArrayList<ExternalReferencing>();
        }
        return this.externalReferencing;
    }

    /**
     * Gets the value of the locationForDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link PointCoordinates }
     *     
     */
    public PointCoordinates getLocationForDisplay() {
        return locationForDisplay;
    }

    /**
     * Sets the value of the locationForDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointCoordinates }
     *     
     */
    public void setLocationForDisplay(PointCoordinates value) {
        this.locationForDisplay = value;
    }

    /**
     * Gets the value of the locationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link LocationExtensionType }
     *     
     */
    public LocationExtensionType getLocationExtension() {
        return locationExtension;
    }

    /**
     * Sets the value of the locationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationExtensionType }
     *     
     */
    public void setLocationExtension(LocationExtensionType value) {
        this.locationExtension = value;
    }

}
