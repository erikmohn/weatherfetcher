
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Linear complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Linear">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}NetworkLocation">
 *       &lt;sequence>
 *         &lt;element name="tpegLinearLocation" type="{http://datex2.eu/schema/2/2_0}TpegLinearLocation" minOccurs="0"/>
 *         &lt;element name="alertCLinear" type="{http://datex2.eu/schema/2/2_0}AlertCLinear" minOccurs="0"/>
 *         &lt;element name="linearWithinLinearElement" type="{http://datex2.eu/schema/2/2_0}LinearWithinLinearElement" minOccurs="0"/>
 *         &lt;element name="linearExtension" type="{http://datex2.eu/schema/2/2_0}_LinearExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Linear", propOrder = {
    "tpegLinearLocation",
    "alertCLinear",
    "linearWithinLinearElement",
    "linearExtension"
})
public class Linear
    extends NetworkLocation
{

    protected TpegLinearLocation tpegLinearLocation;
    protected AlertCLinear alertCLinear;
    protected LinearWithinLinearElement linearWithinLinearElement;
    protected LinearExtensionType linearExtension;

    /**
     * Gets the value of the tpegLinearLocation property.
     * 
     * @return
     *     possible object is
     *     {@link TpegLinearLocation }
     *     
     */
    public TpegLinearLocation getTpegLinearLocation() {
        return tpegLinearLocation;
    }

    /**
     * Sets the value of the tpegLinearLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TpegLinearLocation }
     *     
     */
    public void setTpegLinearLocation(TpegLinearLocation value) {
        this.tpegLinearLocation = value;
    }

    /**
     * Gets the value of the alertCLinear property.
     * 
     * @return
     *     possible object is
     *     {@link AlertCLinear }
     *     
     */
    public AlertCLinear getAlertCLinear() {
        return alertCLinear;
    }

    /**
     * Sets the value of the alertCLinear property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlertCLinear }
     *     
     */
    public void setAlertCLinear(AlertCLinear value) {
        this.alertCLinear = value;
    }

    /**
     * Gets the value of the linearWithinLinearElement property.
     * 
     * @return
     *     possible object is
     *     {@link LinearWithinLinearElement }
     *     
     */
    public LinearWithinLinearElement getLinearWithinLinearElement() {
        return linearWithinLinearElement;
    }

    /**
     * Sets the value of the linearWithinLinearElement property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinearWithinLinearElement }
     *     
     */
    public void setLinearWithinLinearElement(LinearWithinLinearElement value) {
        this.linearWithinLinearElement = value;
    }

    /**
     * Gets the value of the linearExtension property.
     * 
     * @return
     *     possible object is
     *     {@link LinearExtensionType }
     *     
     */
    public LinearExtensionType getLinearExtension() {
        return linearExtension;
    }

    /**
     * Sets the value of the linearExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinearExtensionType }
     *     
     */
    public void setLinearExtension(LinearExtensionType value) {
        this.linearExtension = value;
    }

}
