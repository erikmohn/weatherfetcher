
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Pollution complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Pollution">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pollutantType" type="{http://datex2.eu/schema/2/2_0}PollutantTypeEnum"/>
 *         &lt;element name="pollutantConcentration" type="{http://datex2.eu/schema/2/2_0}MicrogramsConcentrationValue" minOccurs="0"/>
 *         &lt;element name="pollutionExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Pollution", propOrder = {
    "pollutantType",
    "pollutantConcentration",
    "pollutionExtension"
})
public class Pollution {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected PollutantTypeEnum pollutantType;
    protected MicrogramsConcentrationValue pollutantConcentration;
    protected ExtensionType pollutionExtension;

    /**
     * Gets the value of the pollutantType property.
     * 
     * @return
     *     possible object is
     *     {@link PollutantTypeEnum }
     *     
     */
    public PollutantTypeEnum getPollutantType() {
        return pollutantType;
    }

    /**
     * Sets the value of the pollutantType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PollutantTypeEnum }
     *     
     */
    public void setPollutantType(PollutantTypeEnum value) {
        this.pollutantType = value;
    }

    /**
     * Gets the value of the pollutantConcentration property.
     * 
     * @return
     *     possible object is
     *     {@link MicrogramsConcentrationValue }
     *     
     */
    public MicrogramsConcentrationValue getPollutantConcentration() {
        return pollutantConcentration;
    }

    /**
     * Sets the value of the pollutantConcentration property.
     * 
     * @param value
     *     allowed object is
     *     {@link MicrogramsConcentrationValue }
     *     
     */
    public void setPollutantConcentration(MicrogramsConcentrationValue value) {
        this.pollutantConcentration = value;
    }

    /**
     * Gets the value of the pollutionExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getPollutionExtension() {
        return pollutionExtension;
    }

    /**
     * Sets the value of the pollutionExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setPollutionExtension(ExtensionType value) {
        this.pollutionExtension = value;
    }

}
