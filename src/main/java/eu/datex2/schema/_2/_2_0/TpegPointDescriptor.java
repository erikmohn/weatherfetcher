
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TpegPointDescriptor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TpegPointDescriptor">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}TpegDescriptor">
 *       &lt;sequence>
 *         &lt;element name="tpegPointDescriptorExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TpegPointDescriptor", propOrder = {
    "tpegPointDescriptorExtension"
})
@XmlSeeAlso({
    TpegIlcPointDescriptor.class,
    TpegJunctionPointDescriptor.class,
    TpegOtherPointDescriptor.class
})
public abstract class TpegPointDescriptor
    extends TpegDescriptor
{

    protected ExtensionType tpegPointDescriptorExtension;

    /**
     * Gets the value of the tpegPointDescriptorExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTpegPointDescriptorExtension() {
        return tpegPointDescriptorExtension;
    }

    /**
     * Sets the value of the tpegPointDescriptorExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTpegPointDescriptorExtension(ExtensionType value) {
        this.tpegPointDescriptorExtension = value;
    }

}
