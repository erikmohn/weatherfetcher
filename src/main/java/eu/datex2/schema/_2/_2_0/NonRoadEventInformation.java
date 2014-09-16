
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NonRoadEventInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NonRoadEventInformation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}SituationRecord">
 *       &lt;sequence>
 *         &lt;element name="nonRoadEventInformationExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonRoadEventInformation", propOrder = {
    "nonRoadEventInformationExtension"
})
@XmlSeeAlso({
    CarParks.class,
    RoadsideServiceDisruption.class,
    TransitInformation.class,
    RoadOperatorServiceDisruption.class
})
public abstract class NonRoadEventInformation
    extends SituationRecord
{

    protected ExtensionType nonRoadEventInformationExtension;

    /**
     * Gets the value of the nonRoadEventInformationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getNonRoadEventInformationExtension() {
        return nonRoadEventInformationExtension;
    }

    /**
     * Sets the value of the nonRoadEventInformationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setNonRoadEventInformationExtension(ExtensionType value) {
        this.nonRoadEventInformationExtension = value;
    }

}
