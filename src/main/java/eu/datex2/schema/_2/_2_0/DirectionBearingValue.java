
package eu.datex2.schema._2._2_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DirectionBearingValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DirectionBearingValue">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}DataValue">
 *       &lt;sequence>
 *         &lt;element name="directionBearing" type="{http://datex2.eu/schema/2/2_0}AngleInDegrees"/>
 *         &lt;element name="directionBearingValueExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectionBearingValue", propOrder = {
    "directionBearing",
    "directionBearingValueExtension"
})
public class DirectionBearingValue
    extends DataValue
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger directionBearing;
    protected ExtensionType directionBearingValueExtension;

    /**
     * Gets the value of the directionBearing property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDirectionBearing() {
        return directionBearing;
    }

    /**
     * Sets the value of the directionBearing property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDirectionBearing(BigInteger value) {
        this.directionBearing = value;
    }

    /**
     * Gets the value of the directionBearingValueExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getDirectionBearingValueExtension() {
        return directionBearingValueExtension;
    }

    /**
     * Sets the value of the directionBearingValueExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setDirectionBearingValueExtension(ExtensionType value) {
        this.directionBearingValueExtension = value;
    }

}
