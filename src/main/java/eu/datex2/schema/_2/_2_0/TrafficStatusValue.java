
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrafficStatusValue complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrafficStatusValue">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}DataValue">
 *       &lt;sequence>
 *         &lt;element name="trafficStatusValue" type="{http://datex2.eu/schema/2/2_0}TrafficStatusEnum"/>
 *         &lt;element name="trafficStatusValueExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrafficStatusValue", propOrder = {
    "trafficStatusValue",
    "trafficStatusValueExtension"
})
public class TrafficStatusValue
    extends DataValue
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TrafficStatusEnum trafficStatusValue;
    protected ExtensionType trafficStatusValueExtension;

    /**
     * Gets the value of the trafficStatusValue property.
     * 
     * @return
     *     possible object is
     *     {@link TrafficStatusEnum }
     *     
     */
    public TrafficStatusEnum getTrafficStatusValue() {
        return trafficStatusValue;
    }

    /**
     * Sets the value of the trafficStatusValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrafficStatusEnum }
     *     
     */
    public void setTrafficStatusValue(TrafficStatusEnum value) {
        this.trafficStatusValue = value;
    }

    /**
     * Gets the value of the trafficStatusValueExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTrafficStatusValueExtension() {
        return trafficStatusValueExtension;
    }

    /**
     * Sets the value of the trafficStatusValueExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTrafficStatusValueExtension(ExtensionType value) {
        this.trafficStatusValueExtension = value;
    }

}
