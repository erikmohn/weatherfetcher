
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrafficSpeed complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrafficSpeed">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}TrafficData">
 *       &lt;sequence>
 *         &lt;element name="averageVehicleSpeed" type="{http://datex2.eu/schema/2/2_0}SpeedValue" minOccurs="0"/>
 *         &lt;element name="speedPercentile" type="{http://datex2.eu/schema/2/2_0}SpeedPercentile" minOccurs="0"/>
 *         &lt;element name="trafficSpeedExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrafficSpeed", propOrder = {
    "averageVehicleSpeed",
    "speedPercentile",
    "trafficSpeedExtension"
})
public class TrafficSpeed
    extends TrafficData
{

    protected SpeedValue averageVehicleSpeed;
    protected SpeedPercentile speedPercentile;
    protected ExtensionType trafficSpeedExtension;

    /**
     * Gets the value of the averageVehicleSpeed property.
     * 
     * @return
     *     possible object is
     *     {@link SpeedValue }
     *     
     */
    public SpeedValue getAverageVehicleSpeed() {
        return averageVehicleSpeed;
    }

    /**
     * Sets the value of the averageVehicleSpeed property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpeedValue }
     *     
     */
    public void setAverageVehicleSpeed(SpeedValue value) {
        this.averageVehicleSpeed = value;
    }

    /**
     * Gets the value of the speedPercentile property.
     * 
     * @return
     *     possible object is
     *     {@link SpeedPercentile }
     *     
     */
    public SpeedPercentile getSpeedPercentile() {
        return speedPercentile;
    }

    /**
     * Sets the value of the speedPercentile property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpeedPercentile }
     *     
     */
    public void setSpeedPercentile(SpeedPercentile value) {
        this.speedPercentile = value;
    }

    /**
     * Gets the value of the trafficSpeedExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTrafficSpeedExtension() {
        return trafficSpeedExtension;
    }

    /**
     * Sets the value of the trafficSpeedExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTrafficSpeedExtension(ExtensionType value) {
        this.trafficSpeedExtension = value;
    }

}
