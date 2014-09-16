
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FloatingPointMetreDistanceValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FloatingPointMetreDistanceValue">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}DataValue">
 *       &lt;sequence>
 *         &lt;element name="floatingPointMetreDistance" type="{http://datex2.eu/schema/2/2_0}MetresAsFloat"/>
 *         &lt;element name="floatingPointMetreDistanceValueExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FloatingPointMetreDistanceValue", propOrder = {
    "floatingPointMetreDistance",
    "floatingPointMetreDistanceValueExtension"
})
public class FloatingPointMetreDistanceValue
    extends DataValue
{

    protected float floatingPointMetreDistance;
    protected ExtensionType floatingPointMetreDistanceValueExtension;

    /**
     * Gets the value of the floatingPointMetreDistance property.
     * 
     */
    public float getFloatingPointMetreDistance() {
        return floatingPointMetreDistance;
    }

    /**
     * Sets the value of the floatingPointMetreDistance property.
     * 
     */
    public void setFloatingPointMetreDistance(float value) {
        this.floatingPointMetreDistance = value;
    }

    /**
     * Gets the value of the floatingPointMetreDistanceValueExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getFloatingPointMetreDistanceValueExtension() {
        return floatingPointMetreDistanceValueExtension;
    }

    /**
     * Sets the value of the floatingPointMetreDistanceValueExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setFloatingPointMetreDistanceValueExtension(ExtensionType value) {
        this.floatingPointMetreDistanceValueExtension = value;
    }

}
