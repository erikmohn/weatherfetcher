
package eu.datex2.schema._2._2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AffectedCarriagewayAndLanes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AffectedCarriagewayAndLanes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="carriageway" type="{http://datex2.eu/schema/2/2_0}CarriagewayEnum"/>
 *         &lt;element name="lane" type="{http://datex2.eu/schema/2/2_0}LaneEnum" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="footpath" type="{http://datex2.eu/schema/2/2_0}Boolean" minOccurs="0"/>
 *         &lt;element name="lengthAffected" type="{http://datex2.eu/schema/2/2_0}MetresAsFloat" minOccurs="0"/>
 *         &lt;element name="affectedCarriagewayAndLanesExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AffectedCarriagewayAndLanes", propOrder = {
    "carriageway",
    "lane",
    "footpath",
    "lengthAffected",
    "affectedCarriagewayAndLanesExtension"
})
public class AffectedCarriagewayAndLanes {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected CarriagewayEnum carriageway;
    @XmlSchemaType(name = "string")
    protected List<LaneEnum> lane;
    protected Boolean footpath;
    protected Float lengthAffected;
    protected ExtensionType affectedCarriagewayAndLanesExtension;

    /**
     * Gets the value of the carriageway property.
     * 
     * @return
     *     possible object is
     *     {@link CarriagewayEnum }
     *     
     */
    public CarriagewayEnum getCarriageway() {
        return carriageway;
    }

    /**
     * Sets the value of the carriageway property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarriagewayEnum }
     *     
     */
    public void setCarriageway(CarriagewayEnum value) {
        this.carriageway = value;
    }

    /**
     * Gets the value of the lane property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lane property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLane().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LaneEnum }
     * 
     * 
     */
    public List<LaneEnum> getLane() {
        if (lane == null) {
            lane = new ArrayList<LaneEnum>();
        }
        return this.lane;
    }

    /**
     * Gets the value of the footpath property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFootpath() {
        return footpath;
    }

    /**
     * Sets the value of the footpath property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFootpath(Boolean value) {
        this.footpath = value;
    }

    /**
     * Gets the value of the lengthAffected property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getLengthAffected() {
        return lengthAffected;
    }

    /**
     * Sets the value of the lengthAffected property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setLengthAffected(Float value) {
        this.lengthAffected = value;
    }

    /**
     * Gets the value of the affectedCarriagewayAndLanesExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getAffectedCarriagewayAndLanesExtension() {
        return affectedCarriagewayAndLanesExtension;
    }

    /**
     * Sets the value of the affectedCarriagewayAndLanesExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setAffectedCarriagewayAndLanesExtension(ExtensionType value) {
        this.affectedCarriagewayAndLanesExtension = value;
    }

}
