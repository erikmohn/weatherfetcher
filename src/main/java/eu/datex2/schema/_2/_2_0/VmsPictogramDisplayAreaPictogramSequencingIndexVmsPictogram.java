
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for _VmsPictogramDisplayAreaPictogramSequencingIndexVmsPictogram complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="_VmsPictogramDisplayAreaPictogramSequencingIndexVmsPictogram">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vmsPictogram" type="{http://datex2.eu/schema/2/2_0}VmsPictogram"/>
 *       &lt;/sequence>
 *       &lt;attribute name="pictogramSequencingIndex" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "_VmsPictogramDisplayAreaPictogramSequencingIndexVmsPictogram", propOrder = {
    "vmsPictogram"
})
public class VmsPictogramDisplayAreaPictogramSequencingIndexVmsPictogram {

    @XmlElement(required = true)
    protected VmsPictogram vmsPictogram;
    @XmlAttribute(name = "pictogramSequencingIndex", required = true)
    protected int pictogramSequencingIndex;

    /**
     * Gets the value of the vmsPictogram property.
     * 
     * @return
     *     possible object is
     *     {@link VmsPictogram }
     *     
     */
    public VmsPictogram getVmsPictogram() {
        return vmsPictogram;
    }

    /**
     * Sets the value of the vmsPictogram property.
     * 
     * @param value
     *     allowed object is
     *     {@link VmsPictogram }
     *     
     */
    public void setVmsPictogram(VmsPictogram value) {
        this.vmsPictogram = value;
    }

    /**
     * Gets the value of the pictogramSequencingIndex property.
     * 
     */
    public int getPictogramSequencingIndex() {
        return pictogramSequencingIndex;
    }

    /**
     * Sets the value of the pictogramSequencingIndex property.
     * 
     */
    public void setPictogramSequencingIndex(int value) {
        this.pictogramSequencingIndex = value;
    }

}
