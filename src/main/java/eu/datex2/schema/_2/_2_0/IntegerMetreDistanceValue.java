
package eu.datex2.schema._2._2_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IntegerMetreDistanceValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntegerMetreDistanceValue">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}DataValue">
 *       &lt;sequence>
 *         &lt;element name="integerMetreDistance" type="{http://datex2.eu/schema/2/2_0}MetresAsNonNegativeInteger"/>
 *         &lt;element name="integerMetreDistanceValueExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntegerMetreDistanceValue", propOrder = {
    "integerMetreDistance",
    "integerMetreDistanceValueExtension"
})
public class IntegerMetreDistanceValue
    extends DataValue
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger integerMetreDistance;
    protected ExtensionType integerMetreDistanceValueExtension;

    /**
     * Gets the value of the integerMetreDistance property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIntegerMetreDistance() {
        return integerMetreDistance;
    }

    /**
     * Sets the value of the integerMetreDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIntegerMetreDistance(BigInteger value) {
        this.integerMetreDistance = value;
    }

    /**
     * Gets the value of the integerMetreDistanceValueExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getIntegerMetreDistanceValueExtension() {
        return integerMetreDistanceValueExtension;
    }

    /**
     * Sets the value of the integerMetreDistanceValueExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setIntegerMetreDistanceValueExtension(ExtensionType value) {
        this.integerMetreDistanceValueExtension = value;
    }

}
