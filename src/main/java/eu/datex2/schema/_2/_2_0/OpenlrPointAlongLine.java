
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OpenlrPointAlongLine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpenlrPointAlongLine">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}OpenlrBasePointLocation">
 *       &lt;sequence>
 *         &lt;element name="openlrPointAlongLineExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenlrPointAlongLine", propOrder = {
    "openlrPointAlongLineExtension"
})
public class OpenlrPointAlongLine
    extends OpenlrBasePointLocation
{

    protected ExtensionType openlrPointAlongLineExtension;

    /**
     * Gets the value of the openlrPointAlongLineExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getOpenlrPointAlongLineExtension() {
        return openlrPointAlongLineExtension;
    }

    /**
     * Sets the value of the openlrPointAlongLineExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setOpenlrPointAlongLineExtension(ExtensionType value) {
        this.openlrPointAlongLineExtension = value;
    }

}
