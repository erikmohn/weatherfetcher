
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for _VmsTextLineIndexVmsTextLine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="_VmsTextLineIndexVmsTextLine">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vmsTextLine" type="{http://datex2.eu/schema/2/2_0}VmsTextLine"/>
 *       &lt;/sequence>
 *       &lt;attribute name="lineIndex" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "_VmsTextLineIndexVmsTextLine", propOrder = {
    "vmsTextLine"
})
public class VmsTextLineIndexVmsTextLine {

    @XmlElement(required = true)
    protected VmsTextLine vmsTextLine;
    @XmlAttribute(name = "lineIndex", required = true)
    protected int lineIndex;

    /**
     * Gets the value of the vmsTextLine property.
     * 
     * @return
     *     possible object is
     *     {@link VmsTextLine }
     *     
     */
    public VmsTextLine getVmsTextLine() {
        return vmsTextLine;
    }

    /**
     * Sets the value of the vmsTextLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link VmsTextLine }
     *     
     */
    public void setVmsTextLine(VmsTextLine value) {
        this.vmsTextLine = value;
    }

    /**
     * Gets the value of the lineIndex property.
     * 
     */
    public int getLineIndex() {
        return lineIndex;
    }

    /**
     * Sets the value of the lineIndex property.
     * 
     */
    public void setLineIndex(int value) {
        this.lineIndex = value;
    }

}
