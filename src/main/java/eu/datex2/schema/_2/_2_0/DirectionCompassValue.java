
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DirectionCompassValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DirectionCompassValue">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}DataValue">
 *       &lt;sequence>
 *         &lt;element name="directionCompass" type="{http://datex2.eu/schema/2/2_0}DirectionCompassEnum"/>
 *         &lt;element name="directionCompassValueExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectionCompassValue", propOrder = {
    "directionCompass",
    "directionCompassValueExtension"
})
public class DirectionCompassValue
    extends DataValue
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected DirectionCompassEnum directionCompass;
    protected ExtensionType directionCompassValueExtension;

    /**
     * Gets the value of the directionCompass property.
     * 
     * @return
     *     possible object is
     *     {@link DirectionCompassEnum }
     *     
     */
    public DirectionCompassEnum getDirectionCompass() {
        return directionCompass;
    }

    /**
     * Sets the value of the directionCompass property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionCompassEnum }
     *     
     */
    public void setDirectionCompass(DirectionCompassEnum value) {
        this.directionCompass = value;
    }

    /**
     * Gets the value of the directionCompassValueExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getDirectionCompassValueExtension() {
        return directionCompassValueExtension;
    }

    /**
     * Sets the value of the directionCompassValueExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setDirectionCompassValueExtension(ExtensionType value) {
        this.directionCompassValueExtension = value;
    }

}
