
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FrictionExtension complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FrictionExtension">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="friction" type="{http://datex2.eu/schema/2/2_0}FrictionValue"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FrictionExtension", propOrder = {
    "friction"
})
public class FrictionExtension {

    @XmlElement(required = true)
    protected FrictionValue friction;

    /**
     * Gets the value of the friction property.
     * 
     * @return
     *     possible object is
     *     {@link FrictionValue }
     *     
     */
    public FrictionValue getFriction() {
        return friction;
    }

    /**
     * Sets the value of the friction property.
     * 
     * @param value
     *     allowed object is
     *     {@link FrictionValue }
     *     
     */
    public void setFriction(FrictionValue value) {
        this.friction = value;
    }

}
