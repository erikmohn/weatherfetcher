
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NonOrderedLocationGroupByReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NonOrderedLocationGroupByReference">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}NonOrderedLocations">
 *       &lt;sequence>
 *         &lt;element name="predefinedNonOrderedLocationGroupReference" type="{http://datex2.eu/schema/2/2_0}_PredefinedNonOrderedLocationGroupVersionedReference"/>
 *         &lt;element name="nonOrderedLocationGroupByReferenceExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonOrderedLocationGroupByReference", propOrder = {
    "predefinedNonOrderedLocationGroupReference",
    "nonOrderedLocationGroupByReferenceExtension"
})
public class NonOrderedLocationGroupByReference
    extends NonOrderedLocations
{

    @XmlElement(required = true)
    protected PredefinedNonOrderedLocationGroupVersionedReference predefinedNonOrderedLocationGroupReference;
    protected ExtensionType nonOrderedLocationGroupByReferenceExtension;

    /**
     * Gets the value of the predefinedNonOrderedLocationGroupReference property.
     * 
     * @return
     *     possible object is
     *     {@link PredefinedNonOrderedLocationGroupVersionedReference }
     *     
     */
    public PredefinedNonOrderedLocationGroupVersionedReference getPredefinedNonOrderedLocationGroupReference() {
        return predefinedNonOrderedLocationGroupReference;
    }

    /**
     * Sets the value of the predefinedNonOrderedLocationGroupReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PredefinedNonOrderedLocationGroupVersionedReference }
     *     
     */
    public void setPredefinedNonOrderedLocationGroupReference(PredefinedNonOrderedLocationGroupVersionedReference value) {
        this.predefinedNonOrderedLocationGroupReference = value;
    }

    /**
     * Gets the value of the nonOrderedLocationGroupByReferenceExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getNonOrderedLocationGroupByReferenceExtension() {
        return nonOrderedLocationGroupByReferenceExtension;
    }

    /**
     * Sets the value of the nonOrderedLocationGroupByReferenceExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setNonOrderedLocationGroupByReferenceExtension(ExtensionType value) {
        this.nonOrderedLocationGroupByReferenceExtension = value;
    }

}
