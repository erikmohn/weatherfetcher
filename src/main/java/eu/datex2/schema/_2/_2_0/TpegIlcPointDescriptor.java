
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TpegIlcPointDescriptor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TpegIlcPointDescriptor">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}TpegPointDescriptor">
 *       &lt;sequence>
 *         &lt;element name="tpegIlcPointDescriptorType" type="{http://datex2.eu/schema/2/2_0}TpegLoc03IlcPointDescriptorSubtypeEnum"/>
 *         &lt;element name="tpegIlcPointDescriptorExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TpegIlcPointDescriptor", propOrder = {
    "tpegIlcPointDescriptorType",
    "tpegIlcPointDescriptorExtension"
})
public class TpegIlcPointDescriptor
    extends TpegPointDescriptor
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TpegLoc03IlcPointDescriptorSubtypeEnum tpegIlcPointDescriptorType;
    protected ExtensionType tpegIlcPointDescriptorExtension;

    /**
     * Gets the value of the tpegIlcPointDescriptorType property.
     * 
     * @return
     *     possible object is
     *     {@link TpegLoc03IlcPointDescriptorSubtypeEnum }
     *     
     */
    public TpegLoc03IlcPointDescriptorSubtypeEnum getTpegIlcPointDescriptorType() {
        return tpegIlcPointDescriptorType;
    }

    /**
     * Sets the value of the tpegIlcPointDescriptorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TpegLoc03IlcPointDescriptorSubtypeEnum }
     *     
     */
    public void setTpegIlcPointDescriptorType(TpegLoc03IlcPointDescriptorSubtypeEnum value) {
        this.tpegIlcPointDescriptorType = value;
    }

    /**
     * Gets the value of the tpegIlcPointDescriptorExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTpegIlcPointDescriptorExtension() {
        return tpegIlcPointDescriptorExtension;
    }

    /**
     * Sets the value of the tpegIlcPointDescriptorExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTpegIlcPointDescriptorExtension(ExtensionType value) {
        this.tpegIlcPointDescriptorExtension = value;
    }

}
