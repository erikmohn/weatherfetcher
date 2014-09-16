
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Visibility complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Visibility">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="minimumVisibilityDistance" type="{http://datex2.eu/schema/2/2_0}IntegerMetreDistanceValue"/>
 *         &lt;element name="visibilityExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Visibility", propOrder = {
    "minimumVisibilityDistance",
    "visibilityExtension"
})
public class Visibility {

    @XmlElement(required = true)
    protected IntegerMetreDistanceValue minimumVisibilityDistance;
    protected ExtensionType visibilityExtension;

    /**
     * Gets the value of the minimumVisibilityDistance property.
     * 
     * @return
     *     possible object is
     *     {@link IntegerMetreDistanceValue }
     *     
     */
    public IntegerMetreDistanceValue getMinimumVisibilityDistance() {
        return minimumVisibilityDistance;
    }

    /**
     * Sets the value of the minimumVisibilityDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegerMetreDistanceValue }
     *     
     */
    public void setMinimumVisibilityDistance(IntegerMetreDistanceValue value) {
        this.minimumVisibilityDistance = value;
    }

    /**
     * Gets the value of the visibilityExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getVisibilityExtension() {
        return visibilityExtension;
    }

    /**
     * Sets the value of the visibilityExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setVisibilityExtension(ExtensionType value) {
        this.visibilityExtension = value;
    }

}
