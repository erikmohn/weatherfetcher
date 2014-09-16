
package eu.datex2.schema._2._2_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConcentrationOfVehiclesValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConcentrationOfVehiclesValue">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}DataValue">
 *       &lt;sequence>
 *         &lt;element name="concentrationOfVehicles" type="{http://datex2.eu/schema/2/2_0}ConcentrationVehiclesPerKilometre"/>
 *         &lt;element name="concentrationOfVehiclesValueExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConcentrationOfVehiclesValue", propOrder = {
    "concentrationOfVehicles",
    "concentrationOfVehiclesValueExtension"
})
public class ConcentrationOfVehiclesValue
    extends DataValue
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger concentrationOfVehicles;
    protected ExtensionType concentrationOfVehiclesValueExtension;

    /**
     * Gets the value of the concentrationOfVehicles property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getConcentrationOfVehicles() {
        return concentrationOfVehicles;
    }

    /**
     * Sets the value of the concentrationOfVehicles property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setConcentrationOfVehicles(BigInteger value) {
        this.concentrationOfVehicles = value;
    }

    /**
     * Gets the value of the concentrationOfVehiclesValueExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getConcentrationOfVehiclesValueExtension() {
        return concentrationOfVehiclesValueExtension;
    }

    /**
     * Sets the value of the concentrationOfVehiclesValueExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setConcentrationOfVehiclesValueExtension(ExtensionType value) {
        this.concentrationOfVehiclesValueExtension = value;
    }

}
