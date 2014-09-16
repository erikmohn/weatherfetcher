
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpeedValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpeedValue">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}DataValue">
 *       &lt;sequence>
 *         &lt;element name="speed" type="{http://datex2.eu/schema/2/2_0}KilometresPerHour"/>
 *         &lt;element name="speedValueExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpeedValue", propOrder = {
    "speed",
    "speedValueExtension"
})
public class SpeedValue
    extends DataValue
{

    protected float speed;
    protected ExtensionType speedValueExtension;

    /**
     * Gets the value of the speed property.
     * 
     */
    public float getSpeed() {
        return speed;
    }

    /**
     * Sets the value of the speed property.
     * 
     */
    public void setSpeed(float value) {
        this.speed = value;
    }

    /**
     * Gets the value of the speedValueExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getSpeedValueExtension() {
        return speedValueExtension;
    }

    /**
     * Sets the value of the speedValueExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setSpeedValueExtension(ExtensionType value) {
        this.speedValueExtension = value;
    }

}
