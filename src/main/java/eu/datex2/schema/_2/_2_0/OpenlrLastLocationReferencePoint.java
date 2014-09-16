
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OpenlrLastLocationReferencePoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpenlrLastLocationReferencePoint">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}OpenlrBaseLocationReferencePoint">
 *       &lt;sequence>
 *         &lt;element name="openlrLastLocationReferencePointExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenlrLastLocationReferencePoint", propOrder = {
    "openlrLastLocationReferencePointExtension"
})
public class OpenlrLastLocationReferencePoint
    extends OpenlrBaseLocationReferencePoint
{

    protected ExtensionType openlrLastLocationReferencePointExtension;

    /**
     * Gets the value of the openlrLastLocationReferencePointExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getOpenlrLastLocationReferencePointExtension() {
        return openlrLastLocationReferencePointExtension;
    }

    /**
     * Sets the value of the openlrLastLocationReferencePointExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setOpenlrLastLocationReferencePointExtension(ExtensionType value) {
        this.openlrLastLocationReferencePointExtension = value;
    }

}
