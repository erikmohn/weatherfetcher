
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GeneralNetworkManagement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeneralNetworkManagement">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}NetworkManagement">
 *       &lt;sequence>
 *         &lt;element name="generalNetworkManagementType" type="{http://datex2.eu/schema/2/2_0}GeneralNetworkManagementTypeEnum"/>
 *         &lt;element name="trafficManuallyDirectedBy" type="{http://datex2.eu/schema/2/2_0}PersonCategoryEnum" minOccurs="0"/>
 *         &lt;element name="generalNetworkManagementExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GeneralNetworkManagement", propOrder = {
    "generalNetworkManagementType",
    "trafficManuallyDirectedBy",
    "generalNetworkManagementExtension"
})
public class GeneralNetworkManagement
    extends NetworkManagement
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected GeneralNetworkManagementTypeEnum generalNetworkManagementType;
    @XmlSchemaType(name = "string")
    protected PersonCategoryEnum trafficManuallyDirectedBy;
    protected ExtensionType generalNetworkManagementExtension;

    /**
     * Gets the value of the generalNetworkManagementType property.
     * 
     * @return
     *     possible object is
     *     {@link GeneralNetworkManagementTypeEnum }
     *     
     */
    public GeneralNetworkManagementTypeEnum getGeneralNetworkManagementType() {
        return generalNetworkManagementType;
    }

    /**
     * Sets the value of the generalNetworkManagementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeneralNetworkManagementTypeEnum }
     *     
     */
    public void setGeneralNetworkManagementType(GeneralNetworkManagementTypeEnum value) {
        this.generalNetworkManagementType = value;
    }

    /**
     * Gets the value of the trafficManuallyDirectedBy property.
     * 
     * @return
     *     possible object is
     *     {@link PersonCategoryEnum }
     *     
     */
    public PersonCategoryEnum getTrafficManuallyDirectedBy() {
        return trafficManuallyDirectedBy;
    }

    /**
     * Sets the value of the trafficManuallyDirectedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonCategoryEnum }
     *     
     */
    public void setTrafficManuallyDirectedBy(PersonCategoryEnum value) {
        this.trafficManuallyDirectedBy = value;
    }

    /**
     * Gets the value of the generalNetworkManagementExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getGeneralNetworkManagementExtension() {
        return generalNetworkManagementExtension;
    }

    /**
     * Sets the value of the generalNetworkManagementExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setGeneralNetworkManagementExtension(ExtensionType value) {
        this.generalNetworkManagementExtension = value;
    }

}
