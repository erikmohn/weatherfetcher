
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PercentageValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PercentageValue">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}DataValue">
 *       &lt;sequence>
 *         &lt;element name="percentage" type="{http://datex2.eu/schema/2/2_0}Percentage"/>
 *         &lt;element name="percentageValueExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PercentageValue", propOrder = {
    "percentage",
    "percentageValueExtension"
})
public class PercentageValue
    extends DataValue
{

    protected float percentage;
    protected ExtensionType percentageValueExtension;

    /**
     * Gets the value of the percentage property.
     * 
     */
    public float getPercentage() {
        return percentage;
    }

    /**
     * Sets the value of the percentage property.
     * 
     */
    public void setPercentage(float value) {
        this.percentage = value;
    }

    /**
     * Gets the value of the percentageValueExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getPercentageValueExtension() {
        return percentageValueExtension;
    }

    /**
     * Sets the value of the percentageValueExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setPercentageValueExtension(ExtensionType value) {
        this.percentageValueExtension = value;
    }

}
