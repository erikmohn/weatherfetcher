
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Area complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Area">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}Location">
 *       &lt;sequence>
 *         &lt;element name="alertCArea" type="{http://datex2.eu/schema/2/2_0}AlertCArea" minOccurs="0"/>
 *         &lt;element name="tpegAreaLocation" type="{http://datex2.eu/schema/2/2_0}TpegAreaLocation" minOccurs="0"/>
 *         &lt;element name="areaExtension" type="{http://datex2.eu/schema/2/2_0}_AreaExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Area", propOrder = {
    "alertCArea",
    "tpegAreaLocation",
    "areaExtension"
})
public class Area
    extends Location
{

    protected AlertCArea alertCArea;
    protected TpegAreaLocation tpegAreaLocation;
    protected AreaExtensionType areaExtension;

    /**
     * Gets the value of the alertCArea property.
     * 
     * @return
     *     possible object is
     *     {@link AlertCArea }
     *     
     */
    public AlertCArea getAlertCArea() {
        return alertCArea;
    }

    /**
     * Sets the value of the alertCArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlertCArea }
     *     
     */
    public void setAlertCArea(AlertCArea value) {
        this.alertCArea = value;
    }

    /**
     * Gets the value of the tpegAreaLocation property.
     * 
     * @return
     *     possible object is
     *     {@link TpegAreaLocation }
     *     
     */
    public TpegAreaLocation getTpegAreaLocation() {
        return tpegAreaLocation;
    }

    /**
     * Sets the value of the tpegAreaLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TpegAreaLocation }
     *     
     */
    public void setTpegAreaLocation(TpegAreaLocation value) {
        this.tpegAreaLocation = value;
    }

    /**
     * Gets the value of the areaExtension property.
     * 
     * @return
     *     possible object is
     *     {@link AreaExtensionType }
     *     
     */
    public AreaExtensionType getAreaExtension() {
        return areaExtension;
    }

    /**
     * Sets the value of the areaExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link AreaExtensionType }
     *     
     */
    public void setAreaExtension(AreaExtensionType value) {
        this.areaExtension = value;
    }

}
