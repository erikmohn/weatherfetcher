
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MicrogramsConcentrationValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MicrogramsConcentrationValue">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}DataValue">
 *       &lt;sequence>
 *         &lt;element name="microgramsConcentration" type="{http://datex2.eu/schema/2/2_0}ConcentrationMicrogramsPerCubicMetre"/>
 *         &lt;element name="microgramsConcentrationValueExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MicrogramsConcentrationValue", propOrder = {
    "microgramsConcentration",
    "microgramsConcentrationValueExtension"
})
public class MicrogramsConcentrationValue
    extends DataValue
{

    protected float microgramsConcentration;
    protected ExtensionType microgramsConcentrationValueExtension;

    /**
     * Gets the value of the microgramsConcentration property.
     * 
     */
    public float getMicrogramsConcentration() {
        return microgramsConcentration;
    }

    /**
     * Sets the value of the microgramsConcentration property.
     * 
     */
    public void setMicrogramsConcentration(float value) {
        this.microgramsConcentration = value;
    }

    /**
     * Gets the value of the microgramsConcentrationValueExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getMicrogramsConcentrationValueExtension() {
        return microgramsConcentrationValueExtension;
    }

    /**
     * Sets the value of the microgramsConcentrationValueExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setMicrogramsConcentrationValueExtension(ExtensionType value) {
        this.microgramsConcentrationValueExtension = value;
    }

}
