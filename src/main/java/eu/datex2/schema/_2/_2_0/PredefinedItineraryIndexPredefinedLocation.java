
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for _PredefinedItineraryIndexPredefinedLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="_PredefinedItineraryIndexPredefinedLocation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="predefinedLocation" type="{http://datex2.eu/schema/2/2_0}PredefinedLocation"/>
 *       &lt;/sequence>
 *       &lt;attribute name="index" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "_PredefinedItineraryIndexPredefinedLocation", propOrder = {
    "predefinedLocation"
})
public class PredefinedItineraryIndexPredefinedLocation {

    @XmlElement(required = true)
    protected PredefinedLocation predefinedLocation;
    @XmlAttribute(name = "index", required = true)
    protected int index;

    /**
     * Gets the value of the predefinedLocation property.
     * 
     * @return
     *     possible object is
     *     {@link PredefinedLocation }
     *     
     */
    public PredefinedLocation getPredefinedLocation() {
        return predefinedLocation;
    }

    /**
     * Sets the value of the predefinedLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PredefinedLocation }
     *     
     */
    public void setPredefinedLocation(PredefinedLocation value) {
        this.predefinedLocation = value;
    }

    /**
     * Gets the value of the index property.
     * 
     */
    public int getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     */
    public void setIndex(int value) {
        this.index = value;
    }

}
