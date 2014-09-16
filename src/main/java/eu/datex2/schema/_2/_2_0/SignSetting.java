
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SignSetting complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SignSetting">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}OperatorAction">
 *       &lt;sequence>
 *         &lt;element name="vmsSetting" type="{http://datex2.eu/schema/2/2_0}VmsSetting"/>
 *         &lt;element name="signSettingExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignSetting", propOrder = {
    "vmsSetting",
    "signSettingExtension"
})
public class SignSetting
    extends OperatorAction
{

    @XmlElement(required = true)
    protected VmsSetting vmsSetting;
    protected ExtensionType signSettingExtension;

    /**
     * Gets the value of the vmsSetting property.
     * 
     * @return
     *     possible object is
     *     {@link VmsSetting }
     *     
     */
    public VmsSetting getVmsSetting() {
        return vmsSetting;
    }

    /**
     * Sets the value of the vmsSetting property.
     * 
     * @param value
     *     allowed object is
     *     {@link VmsSetting }
     *     
     */
    public void setVmsSetting(VmsSetting value) {
        this.vmsSetting = value;
    }

    /**
     * Gets the value of the signSettingExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getSignSettingExtension() {
        return signSettingExtension;
    }

    /**
     * Sets the value of the signSettingExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setSignSettingExtension(ExtensionType value) {
        this.signSettingExtension = value;
    }

}
