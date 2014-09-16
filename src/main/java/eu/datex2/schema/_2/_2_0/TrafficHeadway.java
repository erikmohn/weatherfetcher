
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrafficHeadway complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrafficHeadway">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}TrafficData">
 *       &lt;sequence>
 *         &lt;element name="averageDistanceHeadway" type="{http://datex2.eu/schema/2/2_0}FloatingPointMetreDistanceValue" minOccurs="0"/>
 *         &lt;element name="averageTimeHeadway" type="{http://datex2.eu/schema/2/2_0}DurationValue" minOccurs="0"/>
 *         &lt;element name="trafficHeadwayExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrafficHeadway", propOrder = {
    "averageDistanceHeadway",
    "averageTimeHeadway",
    "trafficHeadwayExtension"
})
public class TrafficHeadway
    extends TrafficData
{

    protected FloatingPointMetreDistanceValue averageDistanceHeadway;
    protected DurationValue averageTimeHeadway;
    protected ExtensionType trafficHeadwayExtension;

    /**
     * Gets the value of the averageDistanceHeadway property.
     * 
     * @return
     *     possible object is
     *     {@link FloatingPointMetreDistanceValue }
     *     
     */
    public FloatingPointMetreDistanceValue getAverageDistanceHeadway() {
        return averageDistanceHeadway;
    }

    /**
     * Sets the value of the averageDistanceHeadway property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatingPointMetreDistanceValue }
     *     
     */
    public void setAverageDistanceHeadway(FloatingPointMetreDistanceValue value) {
        this.averageDistanceHeadway = value;
    }

    /**
     * Gets the value of the averageTimeHeadway property.
     * 
     * @return
     *     possible object is
     *     {@link DurationValue }
     *     
     */
    public DurationValue getAverageTimeHeadway() {
        return averageTimeHeadway;
    }

    /**
     * Sets the value of the averageTimeHeadway property.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationValue }
     *     
     */
    public void setAverageTimeHeadway(DurationValue value) {
        this.averageTimeHeadway = value;
    }

    /**
     * Gets the value of the trafficHeadwayExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTrafficHeadwayExtension() {
        return trafficHeadwayExtension;
    }

    /**
     * Sets the value of the trafficHeadwayExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTrafficHeadwayExtension(ExtensionType value) {
        this.trafficHeadwayExtension = value;
    }

}
