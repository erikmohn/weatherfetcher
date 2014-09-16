
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VmsSupplementaryPanel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VmsSupplementaryPanel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="supplementaryMessageDescription" type="{http://datex2.eu/schema/2/2_0}MultilingualString" minOccurs="0"/>
 *         &lt;element name="vmsSupplementaryPictogram" type="{http://datex2.eu/schema/2/2_0}VmsSupplementaryPictogram" minOccurs="0"/>
 *         &lt;element name="vmsSupplementaryText" type="{http://datex2.eu/schema/2/2_0}VmsTextLine" minOccurs="0"/>
 *         &lt;element name="vmsSupplementaryPanelExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmsSupplementaryPanel", propOrder = {
    "supplementaryMessageDescription",
    "vmsSupplementaryPictogram",
    "vmsSupplementaryText",
    "vmsSupplementaryPanelExtension"
})
public class VmsSupplementaryPanel {

    protected MultilingualString supplementaryMessageDescription;
    protected VmsSupplementaryPictogram vmsSupplementaryPictogram;
    protected VmsTextLine vmsSupplementaryText;
    protected ExtensionType vmsSupplementaryPanelExtension;

    /**
     * Gets the value of the supplementaryMessageDescription property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getSupplementaryMessageDescription() {
        return supplementaryMessageDescription;
    }

    /**
     * Sets the value of the supplementaryMessageDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setSupplementaryMessageDescription(MultilingualString value) {
        this.supplementaryMessageDescription = value;
    }

    /**
     * Gets the value of the vmsSupplementaryPictogram property.
     * 
     * @return
     *     possible object is
     *     {@link VmsSupplementaryPictogram }
     *     
     */
    public VmsSupplementaryPictogram getVmsSupplementaryPictogram() {
        return vmsSupplementaryPictogram;
    }

    /**
     * Sets the value of the vmsSupplementaryPictogram property.
     * 
     * @param value
     *     allowed object is
     *     {@link VmsSupplementaryPictogram }
     *     
     */
    public void setVmsSupplementaryPictogram(VmsSupplementaryPictogram value) {
        this.vmsSupplementaryPictogram = value;
    }

    /**
     * Gets the value of the vmsSupplementaryText property.
     * 
     * @return
     *     possible object is
     *     {@link VmsTextLine }
     *     
     */
    public VmsTextLine getVmsSupplementaryText() {
        return vmsSupplementaryText;
    }

    /**
     * Sets the value of the vmsSupplementaryText property.
     * 
     * @param value
     *     allowed object is
     *     {@link VmsTextLine }
     *     
     */
    public void setVmsSupplementaryText(VmsTextLine value) {
        this.vmsSupplementaryText = value;
    }

    /**
     * Gets the value of the vmsSupplementaryPanelExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getVmsSupplementaryPanelExtension() {
        return vmsSupplementaryPanelExtension;
    }

    /**
     * Sets the value of the vmsSupplementaryPanelExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setVmsSupplementaryPanelExtension(ExtensionType value) {
        this.vmsSupplementaryPanelExtension = value;
    }

}
