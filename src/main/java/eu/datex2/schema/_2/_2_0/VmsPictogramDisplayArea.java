
package eu.datex2.schema._2._2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VmsPictogramDisplayArea complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VmsPictogramDisplayArea">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="synchronizedSequencingWithTextPages" type="{http://datex2.eu/schema/2/2_0}Boolean" minOccurs="0"/>
 *         &lt;element name="vmsPictogram" type="{http://datex2.eu/schema/2/2_0}_VmsPictogramDisplayAreaPictogramSequencingIndexVmsPictogram" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="vmsPictogramDisplayAreaExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmsPictogramDisplayArea", propOrder = {
    "synchronizedSequencingWithTextPages",
    "vmsPictogram",
    "vmsPictogramDisplayAreaExtension"
})
public class VmsPictogramDisplayArea {

    protected Boolean synchronizedSequencingWithTextPages;
    protected List<VmsPictogramDisplayAreaPictogramSequencingIndexVmsPictogram> vmsPictogram;
    protected ExtensionType vmsPictogramDisplayAreaExtension;

    /**
     * Gets the value of the synchronizedSequencingWithTextPages property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSynchronizedSequencingWithTextPages() {
        return synchronizedSequencingWithTextPages;
    }

    /**
     * Sets the value of the synchronizedSequencingWithTextPages property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSynchronizedSequencingWithTextPages(Boolean value) {
        this.synchronizedSequencingWithTextPages = value;
    }

    /**
     * Gets the value of the vmsPictogram property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vmsPictogram property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVmsPictogram().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VmsPictogramDisplayAreaPictogramSequencingIndexVmsPictogram }
     * 
     * 
     */
    public List<VmsPictogramDisplayAreaPictogramSequencingIndexVmsPictogram> getVmsPictogram() {
        if (vmsPictogram == null) {
            vmsPictogram = new ArrayList<VmsPictogramDisplayAreaPictogramSequencingIndexVmsPictogram>();
        }
        return this.vmsPictogram;
    }

    /**
     * Gets the value of the vmsPictogramDisplayAreaExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getVmsPictogramDisplayAreaExtension() {
        return vmsPictogramDisplayAreaExtension;
    }

    /**
     * Sets the value of the vmsPictogramDisplayAreaExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setVmsPictogramDisplayAreaExtension(ExtensionType value) {
        this.vmsPictogramDisplayAreaExtension = value;
    }

}
