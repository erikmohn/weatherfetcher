
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GenericSituationRecord complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GenericSituationRecord">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}SituationRecord">
 *       &lt;sequence>
 *         &lt;element name="genericSituationRecordName" type="{http://datex2.eu/schema/2/2_0}String"/>
 *         &lt;element name="genericSituationRecordExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericSituationRecord", propOrder = {
    "genericSituationRecordName",
    "genericSituationRecordExtension"
})
public abstract class GenericSituationRecord
    extends SituationRecord
{

    @XmlElement(required = true)
    protected String genericSituationRecordName;
    protected ExtensionType genericSituationRecordExtension;

    /**
     * Gets the value of the genericSituationRecordName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenericSituationRecordName() {
        return genericSituationRecordName;
    }

    /**
     * Sets the value of the genericSituationRecordName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenericSituationRecordName(String value) {
        this.genericSituationRecordName = value;
    }

    /**
     * Gets the value of the genericSituationRecordExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getGenericSituationRecordExtension() {
        return genericSituationRecordExtension;
    }

    /**
     * Sets the value of the genericSituationRecordExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setGenericSituationRecordExtension(ExtensionType value) {
        this.genericSituationRecordExtension = value;
    }

}
