
package eu.datex2.schema._2._2_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OpenlrOffsets complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpenlrOffsets">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="openlrPositiveOffset" type="{http://datex2.eu/schema/2/2_0}MetresAsNonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="openlrNegativeOffset" type="{http://datex2.eu/schema/2/2_0}MetresAsNonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="openlrOffsetsExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenlrOffsets", propOrder = {
    "openlrPositiveOffset",
    "openlrNegativeOffset",
    "openlrOffsetsExtension"
})
public class OpenlrOffsets {

    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger openlrPositiveOffset;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger openlrNegativeOffset;
    protected ExtensionType openlrOffsetsExtension;

    /**
     * Gets the value of the openlrPositiveOffset property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOpenlrPositiveOffset() {
        return openlrPositiveOffset;
    }

    /**
     * Sets the value of the openlrPositiveOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOpenlrPositiveOffset(BigInteger value) {
        this.openlrPositiveOffset = value;
    }

    /**
     * Gets the value of the openlrNegativeOffset property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOpenlrNegativeOffset() {
        return openlrNegativeOffset;
    }

    /**
     * Sets the value of the openlrNegativeOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOpenlrNegativeOffset(BigInteger value) {
        this.openlrNegativeOffset = value;
    }

    /**
     * Gets the value of the openlrOffsetsExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getOpenlrOffsetsExtension() {
        return openlrOffsetsExtension;
    }

    /**
     * Sets the value of the openlrOffsetsExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setOpenlrOffsetsExtension(ExtensionType value) {
        this.openlrOffsetsExtension = value;
    }

}
