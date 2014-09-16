
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Enumeration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Enumeration">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="enumerationName" type="{http://datex2.eu/schema/2/2_0}String"/>
 *         &lt;element name="definition" type="{http://datex2.eu/schema/2/2_0}String"/>
 *         &lt;element name="translation" type="{http://datex2.eu/schema/2/2_0}MultilingualString" minOccurs="0"/>
 *         &lt;element name="translationDefinition" type="{http://datex2.eu/schema/2/2_0}MultilingualString" minOccurs="0"/>
 *         &lt;element name="enumerationExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Enumeration", propOrder = {
    "enumerationName",
    "definition",
    "translation",
    "translationDefinition",
    "enumerationExtension"
})
public class Enumeration {

    @XmlElement(required = true)
    protected String enumerationName;
    @XmlElement(required = true)
    protected String definition;
    protected MultilingualString translation;
    protected MultilingualString translationDefinition;
    protected ExtensionType enumerationExtension;

    /**
     * Gets the value of the enumerationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnumerationName() {
        return enumerationName;
    }

    /**
     * Sets the value of the enumerationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnumerationName(String value) {
        this.enumerationName = value;
    }

    /**
     * Gets the value of the definition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefinition() {
        return definition;
    }

    /**
     * Sets the value of the definition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefinition(String value) {
        this.definition = value;
    }

    /**
     * Gets the value of the translation property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getTranslation() {
        return translation;
    }

    /**
     * Sets the value of the translation property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setTranslation(MultilingualString value) {
        this.translation = value;
    }

    /**
     * Gets the value of the translationDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getTranslationDefinition() {
        return translationDefinition;
    }

    /**
     * Sets the value of the translationDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setTranslationDefinition(MultilingualString value) {
        this.translationDefinition = value;
    }

    /**
     * Gets the value of the enumerationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getEnumerationExtension() {
        return enumerationExtension;
    }

    /**
     * Sets the value of the enumerationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setEnumerationExtension(ExtensionType value) {
        this.enumerationExtension = value;
    }

}
