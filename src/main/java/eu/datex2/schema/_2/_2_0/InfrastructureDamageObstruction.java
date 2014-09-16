
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InfrastructureDamageObstruction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InfrastructureDamageObstruction">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}Obstruction">
 *       &lt;sequence>
 *         &lt;element name="infrastructureDamageType" type="{http://datex2.eu/schema/2/2_0}InfrastructureDamageTypeEnum"/>
 *         &lt;element name="infrastructureDamageObstructionExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InfrastructureDamageObstruction", propOrder = {
    "infrastructureDamageType",
    "infrastructureDamageObstructionExtension"
})
public class InfrastructureDamageObstruction
    extends Obstruction
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected InfrastructureDamageTypeEnum infrastructureDamageType;
    protected ExtensionType infrastructureDamageObstructionExtension;

    /**
     * Gets the value of the infrastructureDamageType property.
     * 
     * @return
     *     possible object is
     *     {@link InfrastructureDamageTypeEnum }
     *     
     */
    public InfrastructureDamageTypeEnum getInfrastructureDamageType() {
        return infrastructureDamageType;
    }

    /**
     * Sets the value of the infrastructureDamageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfrastructureDamageTypeEnum }
     *     
     */
    public void setInfrastructureDamageType(InfrastructureDamageTypeEnum value) {
        this.infrastructureDamageType = value;
    }

    /**
     * Gets the value of the infrastructureDamageObstructionExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getInfrastructureDamageObstructionExtension() {
        return infrastructureDamageObstructionExtension;
    }

    /**
     * Sets the value of the infrastructureDamageObstructionExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setInfrastructureDamageObstructionExtension(ExtensionType value) {
        this.infrastructureDamageObstructionExtension = value;
    }

}
