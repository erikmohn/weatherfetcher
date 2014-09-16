
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TpegLinearLocation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TpegLinearLocation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tpegDirection" type="{http://datex2.eu/schema/2/2_0}DirectionEnum"/>
 *         &lt;element name="tpegLinearLocationType" type="{http://datex2.eu/schema/2/2_0}TpegLoc01LinearLocationSubtypeEnum"/>
 *         &lt;element name="to" type="{http://datex2.eu/schema/2/2_0}TpegPoint"/>
 *         &lt;element name="from" type="{http://datex2.eu/schema/2/2_0}TpegPoint"/>
 *         &lt;element name="tpegLinearLocationExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TpegLinearLocation", propOrder = {
    "tpegDirection",
    "tpegLinearLocationType",
    "to",
    "from",
    "tpegLinearLocationExtension"
})
public class TpegLinearLocation {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected DirectionEnum tpegDirection;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected TpegLoc01LinearLocationSubtypeEnum tpegLinearLocationType;
    @XmlElement(required = true)
    protected TpegPoint to;
    @XmlElement(required = true)
    protected TpegPoint from;
    protected ExtensionType tpegLinearLocationExtension;

    /**
     * Gets the value of the tpegDirection property.
     * 
     * @return
     *     possible object is
     *     {@link DirectionEnum }
     *     
     */
    public DirectionEnum getTpegDirection() {
        return tpegDirection;
    }

    /**
     * Sets the value of the tpegDirection property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectionEnum }
     *     
     */
    public void setTpegDirection(DirectionEnum value) {
        this.tpegDirection = value;
    }

    /**
     * Gets the value of the tpegLinearLocationType property.
     * 
     * @return
     *     possible object is
     *     {@link TpegLoc01LinearLocationSubtypeEnum }
     *     
     */
    public TpegLoc01LinearLocationSubtypeEnum getTpegLinearLocationType() {
        return tpegLinearLocationType;
    }

    /**
     * Sets the value of the tpegLinearLocationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TpegLoc01LinearLocationSubtypeEnum }
     *     
     */
    public void setTpegLinearLocationType(TpegLoc01LinearLocationSubtypeEnum value) {
        this.tpegLinearLocationType = value;
    }

    /**
     * Gets the value of the to property.
     * 
     * @return
     *     possible object is
     *     {@link TpegPoint }
     *     
     */
    public TpegPoint getTo() {
        return to;
    }

    /**
     * Sets the value of the to property.
     * 
     * @param value
     *     allowed object is
     *     {@link TpegPoint }
     *     
     */
    public void setTo(TpegPoint value) {
        this.to = value;
    }

    /**
     * Gets the value of the from property.
     * 
     * @return
     *     possible object is
     *     {@link TpegPoint }
     *     
     */
    public TpegPoint getFrom() {
        return from;
    }

    /**
     * Sets the value of the from property.
     * 
     * @param value
     *     allowed object is
     *     {@link TpegPoint }
     *     
     */
    public void setFrom(TpegPoint value) {
        this.from = value;
    }

    /**
     * Gets the value of the tpegLinearLocationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getTpegLinearLocationExtension() {
        return tpegLinearLocationExtension;
    }

    /**
     * Sets the value of the tpegLinearLocationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setTpegLinearLocationExtension(ExtensionType value) {
        this.tpegLinearLocationExtension = value;
    }

}
