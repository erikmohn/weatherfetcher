
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GenericPublication complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GenericPublication">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}PayloadPublication">
 *       &lt;sequence>
 *         &lt;element name="genericPublicationName" type="{http://datex2.eu/schema/2/2_0}String"/>
 *         &lt;element name="genericPublicationExtension" type="{http://datex2.eu/schema/2/2_0}_GenericPublicationExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericPublication", propOrder = {
    "genericPublicationName",
    "genericPublicationExtension"
})
@XmlSeeAlso({
    DataDictionaryPublication.class
})
public class GenericPublication
    extends PayloadPublication
{

    @XmlElement(required = true)
    protected String genericPublicationName;
    protected GenericPublicationExtensionType genericPublicationExtension;

    /**
     * Gets the value of the genericPublicationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenericPublicationName() {
        return genericPublicationName;
    }

    /**
     * Sets the value of the genericPublicationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenericPublicationName(String value) {
        this.genericPublicationName = value;
    }

    /**
     * Gets the value of the genericPublicationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link GenericPublicationExtensionType }
     *     
     */
    public GenericPublicationExtensionType getGenericPublicationExtension() {
        return genericPublicationExtension;
    }

    /**
     * Sets the value of the genericPublicationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericPublicationExtensionType }
     *     
     */
    public void setGenericPublicationExtension(GenericPublicationExtensionType value) {
        this.genericPublicationExtension = value;
    }

}
