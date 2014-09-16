
package eu.datex2.schema._2._2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlType;
import org.w3c.dom.Element;


/**
 * <p>Java class for _RoadSurfaceConditionMeasurementsExtensionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="_RoadSurfaceConditionMeasurementsExtensionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="frictionExtension" type="{http://datex2.eu/schema/2/2_0}FrictionExtension" minOccurs="0"/>
 *         &lt;any processContents='lax' namespace='##other' maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "_RoadSurfaceConditionMeasurementsExtensionType", propOrder = {
    "frictionExtension",
    "any"
})
public class RoadSurfaceConditionMeasurementsExtensionType {

    protected FrictionExtension frictionExtension;
    @XmlAnyElement(lax = true)
    protected List<Object> any;

    /**
     * Gets the value of the frictionExtension property.
     * 
     * @return
     *     possible object is
     *     {@link FrictionExtension }
     *     
     */
    public FrictionExtension getFrictionExtension() {
        return frictionExtension;
    }

    /**
     * Sets the value of the frictionExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrictionExtension }
     *     
     */
    public void setFrictionExtension(FrictionExtension value) {
        this.frictionExtension = value;
    }

    /**
     * Gets the value of the any property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the any property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAny().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * {@link Element }
     * 
     * 
     */
    public List<Object> getAny() {
        if (any == null) {
            any = new ArrayList<Object>();
        }
        return this.any;
    }

}
