
package eu.datex2.schema._2._2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GMLMultiPolygon complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GMLMultiPolygon">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="polygonMember" type="{http://datex2.eu/schema/2/2_0}GMLPolygon" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="gmlMultiPolygonExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="srsName" use="required" type="{http://datex2.eu/schema/2/2_0}String" />
 *       &lt;attribute name="gid" type="{http://datex2.eu/schema/2/2_0}String" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GMLMultiPolygon", propOrder = {
    "polygonMember",
    "gmlMultiPolygonExtension"
})
public class GMLMultiPolygon {

    protected List<GMLPolygon> polygonMember;
    protected ExtensionType gmlMultiPolygonExtension;
    @XmlAttribute(name = "srsName", required = true)
    protected String srsName;
    @XmlAttribute(name = "gid")
    protected String gid;

    /**
     * Gets the value of the polygonMember property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the polygonMember property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPolygonMember().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GMLPolygon }
     * 
     * 
     */
    public List<GMLPolygon> getPolygonMember() {
        if (polygonMember == null) {
            polygonMember = new ArrayList<GMLPolygon>();
        }
        return this.polygonMember;
    }

    /**
     * Gets the value of the gmlMultiPolygonExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getGmlMultiPolygonExtension() {
        return gmlMultiPolygonExtension;
    }

    /**
     * Sets the value of the gmlMultiPolygonExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setGmlMultiPolygonExtension(ExtensionType value) {
        this.gmlMultiPolygonExtension = value;
    }

    /**
     * Gets the value of the srsName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSrsName() {
        return srsName;
    }

    /**
     * Sets the value of the srsName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSrsName(String value) {
        this.srsName = value;
    }

    /**
     * Gets the value of the gid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGid() {
        return gid;
    }

    /**
     * Sets the value of the gid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGid(String value) {
        this.gid = value;
    }

}
