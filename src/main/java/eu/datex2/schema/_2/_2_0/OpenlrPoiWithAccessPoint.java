
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OpenlrPoiWithAccessPoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpenlrPoiWithAccessPoint">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}OpenlrBasePointLocation">
 *       &lt;sequence>
 *         &lt;element name="openlrCoordinate" type="{http://datex2.eu/schema/2/2_0}PointCoordinates"/>
 *         &lt;element name="openlrPoiWithAccessPointExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenlrPoiWithAccessPoint", propOrder = {
    "openlrCoordinate",
    "openlrPoiWithAccessPointExtension"
})
public class OpenlrPoiWithAccessPoint
    extends OpenlrBasePointLocation
{

    @XmlElement(required = true)
    protected PointCoordinates openlrCoordinate;
    protected ExtensionType openlrPoiWithAccessPointExtension;

    /**
     * Gets the value of the openlrCoordinate property.
     * 
     * @return
     *     possible object is
     *     {@link PointCoordinates }
     *     
     */
    public PointCoordinates getOpenlrCoordinate() {
        return openlrCoordinate;
    }

    /**
     * Sets the value of the openlrCoordinate property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointCoordinates }
     *     
     */
    public void setOpenlrCoordinate(PointCoordinates value) {
        this.openlrCoordinate = value;
    }

    /**
     * Gets the value of the openlrPoiWithAccessPointExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getOpenlrPoiWithAccessPointExtension() {
        return openlrPoiWithAccessPointExtension;
    }

    /**
     * Sets the value of the openlrPoiWithAccessPointExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setOpenlrPoiWithAccessPointExtension(ExtensionType value) {
        this.openlrPoiWithAccessPointExtension = value;
    }

}
