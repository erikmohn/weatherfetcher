
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LinearElementByCode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LinearElementByCode">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}LinearElement">
 *       &lt;sequence>
 *         &lt;element name="linearElementIdentifier" type="{http://datex2.eu/schema/2/2_0}String"/>
 *         &lt;element name="linearElementByCodeExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LinearElementByCode", propOrder = {
    "linearElementIdentifier",
    "linearElementByCodeExtension"
})
public class LinearElementByCode
    extends LinearElement
{

    @XmlElement(required = true)
    protected String linearElementIdentifier;
    protected ExtensionType linearElementByCodeExtension;

    /**
     * Gets the value of the linearElementIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinearElementIdentifier() {
        return linearElementIdentifier;
    }

    /**
     * Sets the value of the linearElementIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinearElementIdentifier(String value) {
        this.linearElementIdentifier = value;
    }

    /**
     * Gets the value of the linearElementByCodeExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getLinearElementByCodeExtension() {
        return linearElementByCodeExtension;
    }

    /**
     * Sets the value of the linearElementByCodeExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setLinearElementByCodeExtension(ExtensionType value) {
        this.linearElementByCodeExtension = value;
    }

}
