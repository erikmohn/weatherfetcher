
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NonOrderedLocations complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NonOrderedLocations">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}GroupOfLocations">
 *       &lt;sequence>
 *         &lt;element name="nonOrderedLocationsExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonOrderedLocations", propOrder = {
    "nonOrderedLocationsExtension"
})
@XmlSeeAlso({
    NonOrderedLocationGroupByList.class,
    NonOrderedLocationGroupByReference.class
})
public abstract class NonOrderedLocations
    extends GroupOfLocations
{

    protected ExtensionType nonOrderedLocationsExtension;

    /**
     * Gets the value of the nonOrderedLocationsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getNonOrderedLocationsExtension() {
        return nonOrderedLocationsExtension;
    }

    /**
     * Sets the value of the nonOrderedLocationsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setNonOrderedLocationsExtension(ExtensionType value) {
        this.nonOrderedLocationsExtension = value;
    }

}
