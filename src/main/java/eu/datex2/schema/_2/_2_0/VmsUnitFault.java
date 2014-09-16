
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VmsUnitFault complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VmsUnitFault">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}Fault">
 *       &lt;sequence>
 *         &lt;element name="vmsUnitFault" type="{http://datex2.eu/schema/2/2_0}VmsFaultEnum"/>
 *         &lt;element name="vmsUnitFaultExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmsUnitFault", propOrder = {
    "vmsUnitFault",
    "vmsUnitFaultExtension"
})
public class VmsUnitFault
    extends Fault
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected VmsFaultEnum vmsUnitFault;
    protected ExtensionType vmsUnitFaultExtension;

    /**
     * Gets the value of the vmsUnitFault property.
     * 
     * @return
     *     possible object is
     *     {@link VmsFaultEnum }
     *     
     */
    public VmsFaultEnum getVmsUnitFault() {
        return vmsUnitFault;
    }

    /**
     * Sets the value of the vmsUnitFault property.
     * 
     * @param value
     *     allowed object is
     *     {@link VmsFaultEnum }
     *     
     */
    public void setVmsUnitFault(VmsFaultEnum value) {
        this.vmsUnitFault = value;
    }

    /**
     * Gets the value of the vmsUnitFaultExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getVmsUnitFaultExtension() {
        return vmsUnitFaultExtension;
    }

    /**
     * Sets the value of the vmsUnitFaultExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setVmsUnitFaultExtension(ExtensionType value) {
        this.vmsUnitFaultExtension = value;
    }

}
