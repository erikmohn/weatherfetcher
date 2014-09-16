
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VmsPictogramImageExtension complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VmsPictogramImageExtension">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pictogramImage" type="{http://datex2.eu/schema/2/2_0}Base64Binary"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmsPictogramImageExtension", propOrder = {
    "pictogramImage"
})
public class VmsPictogramImageExtension {

    @XmlElement(required = true)
    protected byte[] pictogramImage;

    /**
     * Gets the value of the pictogramImage property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPictogramImage() {
        return pictogramImage;
    }

    /**
     * Sets the value of the pictogramImage property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPictogramImage(byte[] value) {
        this.pictogramImage = value;
    }

}
