
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GMLLinearRing complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GMLLinearRing">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="coordinates" type="{http://datex2.eu/schema/2/2_0}LongString"/>
 *         &lt;element name="gmlLinearRingExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GMLLinearRing", propOrder = {
    "coordinates",
    "gmlLinearRingExtension"
})
public class GMLLinearRing {

    @XmlElement(required = true)
    protected String coordinates;
    protected ExtensionType gmlLinearRingExtension;

    /**
     * Gets the value of the coordinates property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoordinates() {
        return coordinates;
    }

    /**
     * Sets the value of the coordinates property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoordinates(String value) {
        this.coordinates = value;
    }

    /**
     * Gets the value of the gmlLinearRingExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getGmlLinearRingExtension() {
        return gmlLinearRingExtension;
    }

    /**
     * Sets the value of the gmlLinearRingExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setGmlLinearRingExtension(ExtensionType value) {
        this.gmlLinearRingExtension = value;
    }

}
