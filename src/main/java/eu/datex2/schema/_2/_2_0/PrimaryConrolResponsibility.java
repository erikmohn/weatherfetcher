
package eu.datex2.schema._2._2_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrimaryConrolResponsibility complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrimaryConrolResponsibility">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cameraBaseStationName" type="{http://datex2.eu/schema/2/2_0}MultilingualString" minOccurs="0"/>
 *         &lt;element name="cameraBaseStationIdentification" type="{http://datex2.eu/schema/2/2_0}String" minOccurs="0"/>
 *         &lt;element name="controlCentreName" type="{http://datex2.eu/schema/2/2_0}MultilingualString" minOccurs="0"/>
 *         &lt;element name="controlCentreIdentification" type="{http://datex2.eu/schema/2/2_0}Integer" minOccurs="0"/>
 *         &lt;element name="workGroupName" type="{http://datex2.eu/schema/2/2_0}MultilingualString" minOccurs="0"/>
 *         &lt;element name="workGroupIdentification" type="{http://datex2.eu/schema/2/2_0}String" minOccurs="0"/>
 *         &lt;element name="primaryConrolResponsibilityExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrimaryConrolResponsibility", propOrder = {
    "cameraBaseStationName",
    "cameraBaseStationIdentification",
    "controlCentreName",
    "controlCentreIdentification",
    "workGroupName",
    "workGroupIdentification",
    "primaryConrolResponsibilityExtension"
})
public class PrimaryConrolResponsibility {

    protected MultilingualString cameraBaseStationName;
    protected String cameraBaseStationIdentification;
    protected MultilingualString controlCentreName;
    protected BigInteger controlCentreIdentification;
    protected MultilingualString workGroupName;
    protected String workGroupIdentification;
    protected ExtensionType primaryConrolResponsibilityExtension;

    /**
     * Gets the value of the cameraBaseStationName property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getCameraBaseStationName() {
        return cameraBaseStationName;
    }

    /**
     * Sets the value of the cameraBaseStationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setCameraBaseStationName(MultilingualString value) {
        this.cameraBaseStationName = value;
    }

    /**
     * Gets the value of the cameraBaseStationIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCameraBaseStationIdentification() {
        return cameraBaseStationIdentification;
    }

    /**
     * Sets the value of the cameraBaseStationIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCameraBaseStationIdentification(String value) {
        this.cameraBaseStationIdentification = value;
    }

    /**
     * Gets the value of the controlCentreName property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getControlCentreName() {
        return controlCentreName;
    }

    /**
     * Sets the value of the controlCentreName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setControlCentreName(MultilingualString value) {
        this.controlCentreName = value;
    }

    /**
     * Gets the value of the controlCentreIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getControlCentreIdentification() {
        return controlCentreIdentification;
    }

    /**
     * Sets the value of the controlCentreIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setControlCentreIdentification(BigInteger value) {
        this.controlCentreIdentification = value;
    }

    /**
     * Gets the value of the workGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getWorkGroupName() {
        return workGroupName;
    }

    /**
     * Sets the value of the workGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setWorkGroupName(MultilingualString value) {
        this.workGroupName = value;
    }

    /**
     * Gets the value of the workGroupIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkGroupIdentification() {
        return workGroupIdentification;
    }

    /**
     * Sets the value of the workGroupIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkGroupIdentification(String value) {
        this.workGroupIdentification = value;
    }

    /**
     * Gets the value of the primaryConrolResponsibilityExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getPrimaryConrolResponsibilityExtension() {
        return primaryConrolResponsibilityExtension;
    }

    /**
     * Sets the value of the primaryConrolResponsibilityExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setPrimaryConrolResponsibilityExtension(ExtensionType value) {
        this.primaryConrolResponsibilityExtension = value;
    }

}
