
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for _VmsUnitVmsIndexVms complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="_VmsUnitVmsIndexVms">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vms" type="{http://datex2.eu/schema/2/2_0}Vms"/>
 *       &lt;/sequence>
 *       &lt;attribute name="vmsIndex" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "_VmsUnitVmsIndexVms", propOrder = {
    "vms"
})
public class VmsUnitVmsIndexVms {

    @XmlElement(required = true)
    protected Vms vms;
    @XmlAttribute(name = "vmsIndex", required = true)
    protected int vmsIndex;

    /**
     * Gets the value of the vms property.
     * 
     * @return
     *     possible object is
     *     {@link Vms }
     *     
     */
    public Vms getVms() {
        return vms;
    }

    /**
     * Sets the value of the vms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vms }
     *     
     */
    public void setVms(Vms value) {
        this.vms = value;
    }

    /**
     * Gets the value of the vmsIndex property.
     * 
     */
    public int getVmsIndex() {
        return vmsIndex;
    }

    /**
     * Sets the value of the vmsIndex property.
     * 
     */
    public void setVmsIndex(int value) {
        this.vmsIndex = value;
    }

}
