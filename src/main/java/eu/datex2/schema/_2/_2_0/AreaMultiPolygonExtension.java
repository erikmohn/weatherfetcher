
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AreaMultiPolygonExtension complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AreaMultiPolygonExtension">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="gmlMultiPolygon" type="{http://datex2.eu/schema/2/2_0}GMLMultiPolygon"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AreaMultiPolygonExtension", propOrder = {
    "gmlMultiPolygon"
})
public class AreaMultiPolygonExtension {

    @XmlElement(required = true)
    protected GMLMultiPolygon gmlMultiPolygon;

    /**
     * Gets the value of the gmlMultiPolygon property.
     * 
     * @return
     *     possible object is
     *     {@link GMLMultiPolygon }
     *     
     */
    public GMLMultiPolygon getGmlMultiPolygon() {
        return gmlMultiPolygon;
    }

    /**
     * Sets the value of the gmlMultiPolygon property.
     * 
     * @param value
     *     allowed object is
     *     {@link GMLMultiPolygon }
     *     
     */
    public void setGmlMultiPolygon(GMLMultiPolygon value) {
        this.gmlMultiPolygon = value;
    }

}
