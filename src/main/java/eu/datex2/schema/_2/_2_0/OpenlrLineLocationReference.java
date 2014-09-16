
package eu.datex2.schema._2._2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OpenlrLineLocationReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpenlrLineLocationReference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="openlrLocationReferencePoint" type="{http://datex2.eu/schema/2/2_0}OpenlrLocationReferencePoint" maxOccurs="unbounded"/>
 *         &lt;element name="openlrLastLocationReferencePoint" type="{http://datex2.eu/schema/2/2_0}OpenlrLastLocationReferencePoint"/>
 *         &lt;element name="openlrOffsets" type="{http://datex2.eu/schema/2/2_0}OpenlrOffsets" minOccurs="0"/>
 *         &lt;element name="openlrLineLocationReferenceExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenlrLineLocationReference", propOrder = {
    "openlrLocationReferencePoint",
    "openlrLastLocationReferencePoint",
    "openlrOffsets",
    "openlrLineLocationReferenceExtension"
})
public class OpenlrLineLocationReference {

    @XmlElement(required = true)
    protected List<OpenlrLocationReferencePoint> openlrLocationReferencePoint;
    @XmlElement(required = true)
    protected OpenlrLastLocationReferencePoint openlrLastLocationReferencePoint;
    protected OpenlrOffsets openlrOffsets;
    protected ExtensionType openlrLineLocationReferenceExtension;

    /**
     * Gets the value of the openlrLocationReferencePoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the openlrLocationReferencePoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOpenlrLocationReferencePoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpenlrLocationReferencePoint }
     * 
     * 
     */
    public List<OpenlrLocationReferencePoint> getOpenlrLocationReferencePoint() {
        if (openlrLocationReferencePoint == null) {
            openlrLocationReferencePoint = new ArrayList<OpenlrLocationReferencePoint>();
        }
        return this.openlrLocationReferencePoint;
    }

    /**
     * Gets the value of the openlrLastLocationReferencePoint property.
     * 
     * @return
     *     possible object is
     *     {@link OpenlrLastLocationReferencePoint }
     *     
     */
    public OpenlrLastLocationReferencePoint getOpenlrLastLocationReferencePoint() {
        return openlrLastLocationReferencePoint;
    }

    /**
     * Sets the value of the openlrLastLocationReferencePoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenlrLastLocationReferencePoint }
     *     
     */
    public void setOpenlrLastLocationReferencePoint(OpenlrLastLocationReferencePoint value) {
        this.openlrLastLocationReferencePoint = value;
    }

    /**
     * Gets the value of the openlrOffsets property.
     * 
     * @return
     *     possible object is
     *     {@link OpenlrOffsets }
     *     
     */
    public OpenlrOffsets getOpenlrOffsets() {
        return openlrOffsets;
    }

    /**
     * Sets the value of the openlrOffsets property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenlrOffsets }
     *     
     */
    public void setOpenlrOffsets(OpenlrOffsets value) {
        this.openlrOffsets = value;
    }

    /**
     * Gets the value of the openlrLineLocationReferenceExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getOpenlrLineLocationReferenceExtension() {
        return openlrLineLocationReferenceExtension;
    }

    /**
     * Sets the value of the openlrLineLocationReferenceExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setOpenlrLineLocationReferenceExtension(ExtensionType value) {
        this.openlrLineLocationReferenceExtension = value;
    }

}
