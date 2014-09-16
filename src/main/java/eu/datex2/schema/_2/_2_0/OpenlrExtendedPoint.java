
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OpenlrExtendedPoint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpenlrExtendedPoint">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="openlrPointLocationReference" type="{http://datex2.eu/schema/2/2_0}OpenlrPointLocationReference"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpenlrExtendedPoint", propOrder = {
    "openlrPointLocationReference"
})
public class OpenlrExtendedPoint {

    @XmlElement(required = true)
    protected OpenlrPointLocationReference openlrPointLocationReference;

    /**
     * Gets the value of the openlrPointLocationReference property.
     * 
     * @return
     *     possible object is
     *     {@link OpenlrPointLocationReference }
     *     
     */
    public OpenlrPointLocationReference getOpenlrPointLocationReference() {
        return openlrPointLocationReference;
    }

    /**
     * Sets the value of the openlrPointLocationReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpenlrPointLocationReference }
     *     
     */
    public void setOpenlrPointLocationReference(OpenlrPointLocationReference value) {
        this.openlrPointLocationReference = value;
    }

}
