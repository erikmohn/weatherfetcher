
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KilogramsConcentrationValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KilogramsConcentrationValue">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}DataValue">
 *       &lt;sequence>
 *         &lt;element name="kilogramsConcentration" type="{http://datex2.eu/schema/2/2_0}ConcentrationKilogramsPerCubicMetre"/>
 *         &lt;element name="kilogramsConcentrationValueExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KilogramsConcentrationValue", propOrder = {
    "kilogramsConcentration",
    "kilogramsConcentrationValueExtension"
})
public class KilogramsConcentrationValue
    extends DataValue
{

    protected float kilogramsConcentration;
    protected ExtensionType kilogramsConcentrationValueExtension;

    /**
     * Gets the value of the kilogramsConcentration property.
     * 
     */
    public float getKilogramsConcentration() {
        return kilogramsConcentration;
    }

    /**
     * Sets the value of the kilogramsConcentration property.
     * 
     */
    public void setKilogramsConcentration(float value) {
        this.kilogramsConcentration = value;
    }

    /**
     * Gets the value of the kilogramsConcentrationValueExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getKilogramsConcentrationValueExtension() {
        return kilogramsConcentrationValueExtension;
    }

    /**
     * Sets the value of the kilogramsConcentrationValueExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setKilogramsConcentrationValueExtension(ExtensionType value) {
        this.kilogramsConcentrationValueExtension = value;
    }

}