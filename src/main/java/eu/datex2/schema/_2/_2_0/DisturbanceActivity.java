
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DisturbanceActivity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DisturbanceActivity">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}Activity">
 *       &lt;sequence>
 *         &lt;element name="disturbanceActivityType" type="{http://datex2.eu/schema/2/2_0}DisturbanceActivityTypeEnum"/>
 *         &lt;element name="disturbanceActivityExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisturbanceActivity", propOrder = {
    "disturbanceActivityType",
    "disturbanceActivityExtension"
})
public class DisturbanceActivity
    extends Activity
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected DisturbanceActivityTypeEnum disturbanceActivityType;
    protected ExtensionType disturbanceActivityExtension;

    /**
     * Gets the value of the disturbanceActivityType property.
     * 
     * @return
     *     possible object is
     *     {@link DisturbanceActivityTypeEnum }
     *     
     */
    public DisturbanceActivityTypeEnum getDisturbanceActivityType() {
        return disturbanceActivityType;
    }

    /**
     * Sets the value of the disturbanceActivityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisturbanceActivityTypeEnum }
     *     
     */
    public void setDisturbanceActivityType(DisturbanceActivityTypeEnum value) {
        this.disturbanceActivityType = value;
    }

    /**
     * Gets the value of the disturbanceActivityExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getDisturbanceActivityExtension() {
        return disturbanceActivityExtension;
    }

    /**
     * Sets the value of the disturbanceActivityExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setDisturbanceActivityExtension(ExtensionType value) {
        this.disturbanceActivityExtension = value;
    }

}
