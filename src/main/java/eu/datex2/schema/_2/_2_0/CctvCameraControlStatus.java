
package eu.datex2.schema._2._2_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CctvCameraControlStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CctvCameraControlStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cctvCameraControlAvailability" type="{http://datex2.eu/schema/2/2_0}CctvCameraControlAvailabilityEnum" minOccurs="0"/>
 *         &lt;element name="cctvIdentityOfCurrentControllingClient" type="{http://datex2.eu/schema/2/2_0}String" minOccurs="0"/>
 *         &lt;element name="cctvPrivilegeOfCurrentControllingClient" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="cctvUserGroupOfCurrentControllingClient" type="{http://datex2.eu/schema/2/2_0}String" minOccurs="0"/>
 *         &lt;element name="cctvCurrentlySelectedPreset" type="{http://datex2.eu/schema/2/2_0}String" minOccurs="0"/>
 *         &lt;element name="cctvCameraControlStatusExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CctvCameraControlStatus", propOrder = {
    "cctvCameraControlAvailability",
    "cctvIdentityOfCurrentControllingClient",
    "cctvPrivilegeOfCurrentControllingClient",
    "cctvUserGroupOfCurrentControllingClient",
    "cctvCurrentlySelectedPreset",
    "cctvCameraControlStatusExtension"
})
public class CctvCameraControlStatus {

    @XmlSchemaType(name = "string")
    protected CctvCameraControlAvailabilityEnum cctvCameraControlAvailability;
    protected String cctvIdentityOfCurrentControllingClient;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger cctvPrivilegeOfCurrentControllingClient;
    protected String cctvUserGroupOfCurrentControllingClient;
    protected String cctvCurrentlySelectedPreset;
    protected ExtensionType cctvCameraControlStatusExtension;

    /**
     * Gets the value of the cctvCameraControlAvailability property.
     * 
     * @return
     *     possible object is
     *     {@link CctvCameraControlAvailabilityEnum }
     *     
     */
    public CctvCameraControlAvailabilityEnum getCctvCameraControlAvailability() {
        return cctvCameraControlAvailability;
    }

    /**
     * Sets the value of the cctvCameraControlAvailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link CctvCameraControlAvailabilityEnum }
     *     
     */
    public void setCctvCameraControlAvailability(CctvCameraControlAvailabilityEnum value) {
        this.cctvCameraControlAvailability = value;
    }

    /**
     * Gets the value of the cctvIdentityOfCurrentControllingClient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCctvIdentityOfCurrentControllingClient() {
        return cctvIdentityOfCurrentControllingClient;
    }

    /**
     * Sets the value of the cctvIdentityOfCurrentControllingClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCctvIdentityOfCurrentControllingClient(String value) {
        this.cctvIdentityOfCurrentControllingClient = value;
    }

    /**
     * Gets the value of the cctvPrivilegeOfCurrentControllingClient property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCctvPrivilegeOfCurrentControllingClient() {
        return cctvPrivilegeOfCurrentControllingClient;
    }

    /**
     * Sets the value of the cctvPrivilegeOfCurrentControllingClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCctvPrivilegeOfCurrentControllingClient(BigInteger value) {
        this.cctvPrivilegeOfCurrentControllingClient = value;
    }

    /**
     * Gets the value of the cctvUserGroupOfCurrentControllingClient property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCctvUserGroupOfCurrentControllingClient() {
        return cctvUserGroupOfCurrentControllingClient;
    }

    /**
     * Sets the value of the cctvUserGroupOfCurrentControllingClient property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCctvUserGroupOfCurrentControllingClient(String value) {
        this.cctvUserGroupOfCurrentControllingClient = value;
    }

    /**
     * Gets the value of the cctvCurrentlySelectedPreset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCctvCurrentlySelectedPreset() {
        return cctvCurrentlySelectedPreset;
    }

    /**
     * Sets the value of the cctvCurrentlySelectedPreset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCctvCurrentlySelectedPreset(String value) {
        this.cctvCurrentlySelectedPreset = value;
    }

    /**
     * Gets the value of the cctvCameraControlStatusExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getCctvCameraControlStatusExtension() {
        return cctvCameraControlStatusExtension;
    }

    /**
     * Sets the value of the cctvCameraControlStatusExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setCctvCameraControlStatusExtension(ExtensionType value) {
        this.cctvCameraControlStatusExtension = value;
    }

}
