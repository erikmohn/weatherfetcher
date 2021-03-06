
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for _TextPage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="_TextPage">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vmsText" type="{http://datex2.eu/schema/2/2_0}VmsText"/>
 *       &lt;/sequence>
 *       &lt;attribute name="pageNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "_TextPage", propOrder = {
    "vmsText"
})
public class TextPage {

    @XmlElement(required = true)
    protected VmsText vmsText;
    @XmlAttribute(name = "pageNumber", required = true)
    protected int pageNumber;

    /**
     * Gets the value of the vmsText property.
     * 
     * @return
     *     possible object is
     *     {@link VmsText }
     *     
     */
    public VmsText getVmsText() {
        return vmsText;
    }

    /**
     * Sets the value of the vmsText property.
     * 
     * @param value
     *     allowed object is
     *     {@link VmsText }
     *     
     */
    public void setVmsText(VmsText value) {
        this.vmsText = value;
    }

    /**
     * Gets the value of the pageNumber property.
     * 
     */
    public int getPageNumber() {
        return pageNumber;
    }

    /**
     * Sets the value of the pageNumber property.
     * 
     */
    public void setPageNumber(int value) {
        this.pageNumber = value;
    }

}
