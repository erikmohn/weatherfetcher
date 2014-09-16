
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OpenlrExtendedLinear complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpenlrExtendedLinear">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="openlrLineLocationReference" type="{http://datex2.eu/schema/2/2_0}OpenlrLineLocationReference"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenlrExtendedLinear", propOrder = {
    "openlrLineLocationReference"
})
public class OpenlrExtendedLinear {

    @XmlElement(required = true)
    protected OpenlrLineLocationReference openlrLineLocationReference;

    /**
     * Gets the value of the openlrLineLocationReference property.
     * 
     * @return
     *     possible object is
     *     {@link OpenlrLineLocationReference }
     *     
     */
    public OpenlrLineLocationReference getOpenlrLineLocationReference() {
        return openlrLineLocationReference;
    }

    /**
     * Sets the value of the openlrLineLocationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenlrLineLocationReference }
     *     
     */
    public void setOpenlrLineLocationReference(OpenlrLineLocationReference value) {
        this.openlrLineLocationReference = value;
    }

}
