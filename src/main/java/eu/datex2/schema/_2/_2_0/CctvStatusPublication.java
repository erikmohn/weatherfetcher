
package eu.datex2.schema._2._2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CctvStatusPublication complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CctvStatusPublication">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cctvCameraListReference" type="{http://datex2.eu/schema/2/2_0}_CctvCameraListVersionedReference"/>
 *         &lt;element name="headerInformation" type="{http://datex2.eu/schema/2/2_0}HeaderInformation"/>
 *         &lt;element name="cctvCameraStatus" type="{http://datex2.eu/schema/2/2_0}CctvCameraStatus" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CctvStatusPublication", propOrder = {
    "cctvCameraListReference",
    "headerInformation",
    "cctvCameraStatus"
})
public class CctvStatusPublication {

    @XmlElement(required = true)
    protected CctvCameraListVersionedReference cctvCameraListReference;
    @XmlElement(required = true)
    protected HeaderInformation headerInformation;
    @XmlElement(required = true)
    protected List<CctvCameraStatus> cctvCameraStatus;

    /**
     * Gets the value of the cctvCameraListReference property.
     * 
     * @return
     *     possible object is
     *     {@link CctvCameraListVersionedReference }
     *     
     */
    public CctvCameraListVersionedReference getCctvCameraListReference() {
        return cctvCameraListReference;
    }

    /**
     * Sets the value of the cctvCameraListReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link CctvCameraListVersionedReference }
     *     
     */
    public void setCctvCameraListReference(CctvCameraListVersionedReference value) {
        this.cctvCameraListReference = value;
    }

    /**
     * Gets the value of the headerInformation property.
     * 
     * @return
     *     possible object is
     *     {@link HeaderInformation }
     *     
     */
    public HeaderInformation getHeaderInformation() {
        return headerInformation;
    }

    /**
     * Sets the value of the headerInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderInformation }
     *     
     */
    public void setHeaderInformation(HeaderInformation value) {
        this.headerInformation = value;
    }

    /**
     * Gets the value of the cctvCameraStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cctvCameraStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCctvCameraStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CctvCameraStatus }
     * 
     * 
     */
    public List<CctvCameraStatus> getCctvCameraStatus() {
        if (cctvCameraStatus == null) {
            cctvCameraStatus = new ArrayList<CctvCameraStatus>();
        }
        return this.cctvCameraStatus;
    }

}
