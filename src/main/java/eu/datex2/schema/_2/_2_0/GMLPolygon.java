
package eu.datex2.schema._2._2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GMLPolygon complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GMLPolygon">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="outerBoundaryIs" type="{http://datex2.eu/schema/2/2_0}GMLLinearRing"/>
 *         &lt;element name="innerBoundaryIs" type="{http://datex2.eu/schema/2/2_0}GMLLinearRing" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="gmlPolygonExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GMLPolygon", propOrder = {
    "outerBoundaryIs",
    "innerBoundaryIs",
    "gmlPolygonExtension"
})
public class GMLPolygon {

    @XmlElement(required = true)
    protected GMLLinearRing outerBoundaryIs;
    protected List<GMLLinearRing> innerBoundaryIs;
    protected ExtensionType gmlPolygonExtension;

    /**
     * Gets the value of the outerBoundaryIs property.
     * 
     * @return
     *     possible object is
     *     {@link GMLLinearRing }
     *     
     */
    public GMLLinearRing getOuterBoundaryIs() {
        return outerBoundaryIs;
    }

    /**
     * Sets the value of the outerBoundaryIs property.
     * 
     * @param value
     *     allowed object is
     *     {@link GMLLinearRing }
     *     
     */
    public void setOuterBoundaryIs(GMLLinearRing value) {
        this.outerBoundaryIs = value;
    }

    /**
     * Gets the value of the innerBoundaryIs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the innerBoundaryIs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInnerBoundaryIs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GMLLinearRing }
     * 
     * 
     */
    public List<GMLLinearRing> getInnerBoundaryIs() {
        if (innerBoundaryIs == null) {
            innerBoundaryIs = new ArrayList<GMLLinearRing>();
        }
        return this.innerBoundaryIs;
    }

    /**
     * Gets the value of the gmlPolygonExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getGmlPolygonExtension() {
        return gmlPolygonExtension;
    }

    /**
     * Sets the value of the gmlPolygonExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setGmlPolygonExtension(ExtensionType value) {
        this.gmlPolygonExtension = value;
    }

}
