
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TpegJunctionPointDescriptor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TpegJunctionPointDescriptor">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}TpegPointDescriptor">
 *       &lt;sequence>
 *         &lt;element name="tpegJunctionPointDescriptorType" type="{http://datex2.eu/schema/2/2_0}TpegLoc03JunctionPointDescriptorSubtypeEnum"/>
 *         &lt;element name="tpegJunctionPointDescriptorExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TpegJunctionPointDescriptor", propOrder = {
    "tpegJunctionPointDescriptorType",
    "tpegJunctionPointDescriptorExtension"
})
public class TpegJunctionPointDescriptor
    extends TpegPointDescriptor
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TpegLoc03JunctionPointDescriptorSubtypeEnum tpegJunctionPointDescriptorType;
    protected ExtensionType tpegJunctionPointDescriptorExtension;

    /**
     * Gets the value of the tpegJunctionPointDescriptorType property.
     * 
     * @return
     *     possible object is
     *     {@link TpegLoc03JunctionPointDescriptorSubtypeEnum }
     *     
     */
    public TpegLoc03JunctionPointDescriptorSubtypeEnum getTpegJunctionPointDescriptorType() {
        return tpegJunctionPointDescriptorType;
    }

    /**
     * Sets the value of the tpegJunctionPointDescriptorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TpegLoc03JunctionPointDescriptorSubtypeEnum }
     *     
     */
    public void setTpegJunctionPointDescriptorType(TpegLoc03JunctionPointDescriptorSubtypeEnum value) {
        this.tpegJunctionPointDescriptorType = value;
    }

    /**
     * Gets the value of the tpegJunctionPointDescriptorExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTpegJunctionPointDescriptorExtension() {
        return tpegJunctionPointDescriptorExtension;
    }

    /**
     * Sets the value of the tpegJunctionPointDescriptorExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTpegJunctionPointDescriptorExtension(ExtensionType value) {
        this.tpegJunctionPointDescriptorExtension = value;
    }

}
