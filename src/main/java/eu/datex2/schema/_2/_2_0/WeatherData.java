
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WeatherData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WeatherData">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}BasicData">
 *       &lt;sequence>
 *         &lt;element name="weatherDataExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WeatherData", propOrder = {
    "weatherDataExtension"
})
@XmlSeeAlso({
    PrecipitationInformation.class,
    HumidityInformation.class,
    PollutionInformation.class,
    RoadSurfaceConditionInformation.class,
    VisibilityInformation.class,
    WindInformation.class,
    TemperatureInformation.class
})
public abstract class WeatherData
    extends BasicData
{

    protected ExtensionType weatherDataExtension;

    /**
     * Gets the value of the weatherDataExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getWeatherDataExtension() {
        return weatherDataExtension;
    }

    /**
     * Sets the value of the weatherDataExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setWeatherDataExtension(ExtensionType value) {
        this.weatherDataExtension = value;
    }

}
