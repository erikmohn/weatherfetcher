
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ManagedCause complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManagedCause">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}Cause">
 *       &lt;sequence>
 *         &lt;element name="managedCause" type="{http://datex2.eu/schema/2/2_0}_SituationRecordVersionedReference" minOccurs="0"/>
 *         &lt;element name="managedCauseExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ManagedCause", propOrder = {
    "managedCause",
    "managedCauseExtension"
})
public class ManagedCause
    extends Cause
{

    protected SituationRecordVersionedReference managedCause;
    protected ExtensionType managedCauseExtension;

    /**
     * Gets the value of the managedCause property.
     * 
     * @return
     *     possible object is
     *     {@link SituationRecordVersionedReference }
     *     
     */
    public SituationRecordVersionedReference getManagedCause() {
        return managedCause;
    }

    /**
     * Sets the value of the managedCause property.
     * 
     * @param value
     *     allowed object is
     *     {@link SituationRecordVersionedReference }
     *     
     */
    public void setManagedCause(SituationRecordVersionedReference value) {
        this.managedCause = value;
    }

    /**
     * Gets the value of the managedCauseExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getManagedCauseExtension() {
        return managedCauseExtension;
    }

    /**
     * Sets the value of the managedCauseExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setManagedCauseExtension(ExtensionType value) {
        this.managedCauseExtension = value;
    }

}
