
package eu.datex2.schema._2._2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NonOrderedLocationGroupByList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NonOrderedLocationGroupByList">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}NonOrderedLocations">
 *       &lt;sequence>
 *         &lt;element name="locationContainedInGroup" type="{http://datex2.eu/schema/2/2_0}Location" maxOccurs="unbounded" minOccurs="2"/>
 *         &lt;element name="nonOrderedLocationGroupByListExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonOrderedLocationGroupByList", propOrder = {
    "locationContainedInGroup",
    "nonOrderedLocationGroupByListExtension"
})
public class NonOrderedLocationGroupByList
    extends NonOrderedLocations
{

    @XmlElement(required = true)
    protected List<Location> locationContainedInGroup;
    protected ExtensionType nonOrderedLocationGroupByListExtension;

    /**
     * Gets the value of the locationContainedInGroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationContainedInGroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationContainedInGroup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Location }
     * 
     * 
     */
    public List<Location> getLocationContainedInGroup() {
        if (locationContainedInGroup == null) {
            locationContainedInGroup = new ArrayList<Location>();
        }
        return this.locationContainedInGroup;
    }

    /**
     * Gets the value of the nonOrderedLocationGroupByListExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getNonOrderedLocationGroupByListExtension() {
        return nonOrderedLocationGroupByListExtension;
    }

    /**
     * Sets the value of the nonOrderedLocationGroupByListExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setNonOrderedLocationGroupByListExtension(ExtensionType value) {
        this.nonOrderedLocationGroupByListExtension = value;
    }

}
