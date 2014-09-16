
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ItineraryByReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ItineraryByReference">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}Itinerary">
 *       &lt;sequence>
 *         &lt;element name="predefinedItineraryReference" type="{http://datex2.eu/schema/2/2_0}_PredefinedItineraryVersionedReference"/>
 *         &lt;element name="itineraryByReferenceExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItineraryByReference", propOrder = {
    "predefinedItineraryReference",
    "itineraryByReferenceExtension"
})
public class ItineraryByReference
    extends Itinerary
{

    @XmlElement(required = true)
    protected PredefinedItineraryVersionedReference predefinedItineraryReference;
    protected ExtensionType itineraryByReferenceExtension;

    /**
     * Gets the value of the predefinedItineraryReference property.
     * 
     * @return
     *     possible object is
     *     {@link PredefinedItineraryVersionedReference }
     *     
     */
    public PredefinedItineraryVersionedReference getPredefinedItineraryReference() {
        return predefinedItineraryReference;
    }

    /**
     * Sets the value of the predefinedItineraryReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PredefinedItineraryVersionedReference }
     *     
     */
    public void setPredefinedItineraryReference(PredefinedItineraryVersionedReference value) {
        this.predefinedItineraryReference = value;
    }

    /**
     * Gets the value of the itineraryByReferenceExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getItineraryByReferenceExtension() {
        return itineraryByReferenceExtension;
    }

    /**
     * Sets the value of the itineraryByReferenceExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setItineraryByReferenceExtension(ExtensionType value) {
        this.itineraryByReferenceExtension = value;
    }

}
