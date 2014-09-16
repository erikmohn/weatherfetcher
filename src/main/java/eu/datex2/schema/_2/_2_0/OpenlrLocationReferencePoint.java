
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OpenlrLocationReferencePoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpenlrLocationReferencePoint">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}OpenlrBaseLocationReferencePoint">
 *       &lt;sequence>
 *         &lt;element name="openlrPathAttributes" type="{http://datex2.eu/schema/2/2_0}OpenlrPathAttributes"/>
 *         &lt;element name="openlrLocationReferencePointExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenlrLocationReferencePoint", propOrder = {
    "openlrPathAttributes",
    "openlrLocationReferencePointExtension"
})
public class OpenlrLocationReferencePoint
    extends OpenlrBaseLocationReferencePoint
{

    @XmlElement(required = true)
    protected OpenlrPathAttributes openlrPathAttributes;
    protected ExtensionType openlrLocationReferencePointExtension;

    /**
     * Gets the value of the openlrPathAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link OpenlrPathAttributes }
     *     
     */
    public OpenlrPathAttributes getOpenlrPathAttributes() {
        return openlrPathAttributes;
    }

    /**
     * Sets the value of the openlrPathAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenlrPathAttributes }
     *     
     */
    public void setOpenlrPathAttributes(OpenlrPathAttributes value) {
        this.openlrPathAttributes = value;
    }

    /**
     * Gets the value of the openlrLocationReferencePointExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getOpenlrLocationReferencePointExtension() {
        return openlrLocationReferencePointExtension;
    }

    /**
     * Sets the value of the openlrLocationReferencePointExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setOpenlrLocationReferencePointExtension(ExtensionType value) {
        this.openlrLocationReferencePointExtension = value;
    }

}
