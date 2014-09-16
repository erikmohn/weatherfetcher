
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoadConditions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoadConditions">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}Conditions">
 *       &lt;sequence>
 *         &lt;element name="roadConditionsExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoadConditions", propOrder = {
    "roadConditionsExtension"
})
@XmlSeeAlso({
    NonWeatherRelatedRoadConditions.class,
    WeatherRelatedRoadConditions.class
})
public abstract class RoadConditions
    extends Conditions
{

    protected ExtensionType roadConditionsExtension;

    /**
     * Gets the value of the roadConditionsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getRoadConditionsExtension() {
        return roadConditionsExtension;
    }

    /**
     * Sets the value of the roadConditionsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setRoadConditionsExtension(ExtensionType value) {
        this.roadConditionsExtension = value;
    }

}
