
package eu.datex2.schema._2._2_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Obstruction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Obstruction">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}TrafficElement">
 *       &lt;sequence>
 *         &lt;element name="numberOfObstructions" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="mobilityOfObstruction" type="{http://datex2.eu/schema/2/2_0}Mobility" minOccurs="0"/>
 *         &lt;element name="obstructionExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Obstruction", propOrder = {
    "numberOfObstructions",
    "mobilityOfObstruction",
    "obstructionExtension"
})
@XmlSeeAlso({
    GeneralObstruction.class,
    VehicleObstruction.class,
    InfrastructureDamageObstruction.class,
    EnvironmentalObstruction.class,
    AnimalPresenceObstruction.class
})
public abstract class Obstruction
    extends TrafficElement
{

    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numberOfObstructions;
    protected Mobility mobilityOfObstruction;
    protected ExtensionType obstructionExtension;

    /**
     * Gets the value of the numberOfObstructions property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfObstructions() {
        return numberOfObstructions;
    }

    /**
     * Sets the value of the numberOfObstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfObstructions(BigInteger value) {
        this.numberOfObstructions = value;
    }

    /**
     * Gets the value of the mobilityOfObstruction property.
     * 
     * @return
     *     possible object is
     *     {@link Mobility }
     *     
     */
    public Mobility getMobilityOfObstruction() {
        return mobilityOfObstruction;
    }

    /**
     * Sets the value of the mobilityOfObstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link Mobility }
     *     
     */
    public void setMobilityOfObstruction(Mobility value) {
        this.mobilityOfObstruction = value;
    }

    /**
     * Gets the value of the obstructionExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getObstructionExtension() {
        return obstructionExtension;
    }

    /**
     * Sets the value of the obstructionExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setObstructionExtension(ExtensionType value) {
        this.obstructionExtension = value;
    }

}