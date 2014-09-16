
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ElaboratedDataFault complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ElaboratedDataFault">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}Fault">
 *       &lt;sequence>
 *         &lt;element name="elaboratedDataFault" type="{http://datex2.eu/schema/2/2_0}ElaboratedDataFaultEnum"/>
 *         &lt;element name="elaboratedDataFaultExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElaboratedDataFault", propOrder = {
    "elaboratedDataFault",
    "elaboratedDataFaultExtension"
})
public class ElaboratedDataFault
    extends Fault
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected ElaboratedDataFaultEnum elaboratedDataFault;
    protected ExtensionType elaboratedDataFaultExtension;

    /**
     * Gets the value of the elaboratedDataFault property.
     * 
     * @return
     *     possible object is
     *     {@link ElaboratedDataFaultEnum }
     *     
     */
    public ElaboratedDataFaultEnum getElaboratedDataFault() {
        return elaboratedDataFault;
    }

    /**
     * Sets the value of the elaboratedDataFault property.
     * 
     * @param value
     *     allowed object is
     *     {@link ElaboratedDataFaultEnum }
     *     
     */
    public void setElaboratedDataFault(ElaboratedDataFaultEnum value) {
        this.elaboratedDataFault = value;
    }

    /**
     * Gets the value of the elaboratedDataFaultExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getElaboratedDataFaultExtension() {
        return elaboratedDataFaultExtension;
    }

    /**
     * Sets the value of the elaboratedDataFaultExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setElaboratedDataFaultExtension(ExtensionType value) {
        this.elaboratedDataFaultExtension = value;
    }

}
