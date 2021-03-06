
package eu.datex2.schema._2._2_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OffsetDistance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OffsetDistance">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="offsetDistance" type="{http://datex2.eu/schema/2/2_0}MetresAsNonNegativeInteger"/>
 *         &lt;element name="offsetDistanceExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OffsetDistance", propOrder = {
    "offsetDistance",
    "offsetDistanceExtension"
})
public class OffsetDistance {

    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger offsetDistance;
    protected ExtensionType offsetDistanceExtension;

    /**
     * Gets the value of the offsetDistance property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOffsetDistance() {
        return offsetDistance;
    }

    /**
     * Sets the value of the offsetDistance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOffsetDistance(BigInteger value) {
        this.offsetDistance = value;
    }

    /**
     * Gets the value of the offsetDistanceExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getOffsetDistanceExtension() {
        return offsetDistanceExtension;
    }

    /**
     * Sets the value of the offsetDistanceExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setOffsetDistanceExtension(ExtensionType value) {
        this.offsetDistanceExtension = value;
    }

}
