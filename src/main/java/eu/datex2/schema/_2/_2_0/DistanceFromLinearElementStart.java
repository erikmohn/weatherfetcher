
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DistanceFromLinearElementStart complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DistanceFromLinearElementStart">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}DistanceAlongLinearElement">
 *       &lt;sequence>
 *         &lt;element name="distanceAlong" type="{http://datex2.eu/schema/2/2_0}MetresAsFloat"/>
 *         &lt;element name="distanceFromLinearElementStartExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistanceFromLinearElementStart", propOrder = {
    "distanceAlong",
    "distanceFromLinearElementStartExtension"
})
public class DistanceFromLinearElementStart
    extends DistanceAlongLinearElement
{

    protected float distanceAlong;
    protected ExtensionType distanceFromLinearElementStartExtension;

    /**
     * Gets the value of the distanceAlong property.
     * 
     */
    public float getDistanceAlong() {
        return distanceAlong;
    }

    /**
     * Sets the value of the distanceAlong property.
     * 
     */
    public void setDistanceAlong(float value) {
        this.distanceAlong = value;
    }

    /**
     * Gets the value of the distanceFromLinearElementStartExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getDistanceFromLinearElementStartExtension() {
        return distanceFromLinearElementStartExtension;
    }

    /**
     * Sets the value of the distanceFromLinearElementStartExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setDistanceFromLinearElementStartExtension(ExtensionType value) {
        this.distanceFromLinearElementStartExtension = value;
    }

}
