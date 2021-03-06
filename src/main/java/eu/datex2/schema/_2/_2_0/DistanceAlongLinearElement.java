
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DistanceAlongLinearElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DistanceAlongLinearElement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="distanceAlongLinearElementExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DistanceAlongLinearElement", propOrder = {
    "distanceAlongLinearElementExtension"
})
@XmlSeeAlso({
    PercentageDistanceAlongLinearElement.class,
    DistanceFromLinearElementStart.class,
    DistanceFromLinearElementReferent.class
})
public abstract class DistanceAlongLinearElement {

    protected ExtensionType distanceAlongLinearElementExtension;

    /**
     * Gets the value of the distanceAlongLinearElementExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getDistanceAlongLinearElementExtension() {
        return distanceAlongLinearElementExtension;
    }

    /**
     * Sets the value of the distanceAlongLinearElementExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setDistanceAlongLinearElementExtension(ExtensionType value) {
        this.distanceAlongLinearElementExtension = value;
    }

}
