
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for HumidityInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HumidityInformation">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}WeatherData">
 *       &lt;sequence>
 *         &lt;element name="humidity" type="{http://datex2.eu/schema/2/2_0}Humidity"/>
 *         &lt;element name="humidityInformationExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HumidityInformation", propOrder = {
    "humidity",
    "humidityInformationExtension"
})
public class HumidityInformation
    extends WeatherData
{

    @XmlElement(required = true)
    protected Humidity humidity;
    protected ExtensionType humidityInformationExtension;

    /**
     * Gets the value of the humidity property.
     * 
     * @return
     *     possible object is
     *     {@link Humidity }
     *     
     */
    public Humidity getHumidity() {
        return humidity;
    }

    /**
     * Sets the value of the humidity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Humidity }
     *     
     */
    public void setHumidity(Humidity value) {
        this.humidity = value;
    }

    /**
     * Gets the value of the humidityInformationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getHumidityInformationExtension() {
        return humidityInformationExtension;
    }

    /**
     * Sets the value of the humidityInformationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setHumidityInformationExtension(ExtensionType value) {
        this.humidityInformationExtension = value;
    }

}
