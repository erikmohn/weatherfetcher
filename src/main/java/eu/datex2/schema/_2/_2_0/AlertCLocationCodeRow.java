
package eu.datex2.schema._2._2_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlertCLocationCodeRow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlertCLocationCodeRow">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="locationCode" type="{http://datex2.eu/schema/2/2_0}Integer"/>
 *         &lt;element name="typeClass" type="{http://datex2.eu/schema/2/2_0}LocationCodeClassTypeEnum"/>
 *         &lt;element name="typeCode" type="{http://datex2.eu/schema/2/2_0}Integer"/>
 *         &lt;element name="subTypeCode" type="{http://datex2.eu/schema/2/2_0}Integer"/>
 *         &lt;element name="alertCLocationCodeRoadName" type="{http://datex2.eu/schema/2/2_0}String" minOccurs="0"/>
 *         &lt;element name="firstName" type="{http://datex2.eu/schema/2/2_0}String"/>
 *         &lt;element name="secondName" type="{http://datex2.eu/schema/2/2_0}String" minOccurs="0"/>
 *         &lt;element name="areaReference" type="{http://datex2.eu/schema/2/2_0}Integer"/>
 *         &lt;element name="linearReference" type="{http://datex2.eu/schema/2/2_0}Integer" minOccurs="0"/>
 *         &lt;element name="negativeOffset" type="{http://datex2.eu/schema/2/2_0}Integer" minOccurs="0"/>
 *         &lt;element name="positiveOffset" type="{http://datex2.eu/schema/2/2_0}Integer" minOccurs="0"/>
 *         &lt;element name="alertCLocationCodeRoadNumber" type="{http://datex2.eu/schema/2/2_0}String" minOccurs="0"/>
 *         &lt;element name="junctionNumber" type="{http://datex2.eu/schema/2/2_0}String" minOccurs="0"/>
 *         &lt;element name="remoteTargetNegativeOffset" type="{http://datex2.eu/schema/2/2_0}String" minOccurs="0"/>
 *         &lt;element name="remoteTargetPositiveOffset" type="{http://datex2.eu/schema/2/2_0}String" minOccurs="0"/>
 *         &lt;element name="type" type="{http://datex2.eu/schema/2/2_0}LocationCodeTypeEnum" minOccurs="0"/>
 *         &lt;element name="subType" type="{http://datex2.eu/schema/2/2_0}LocationCodeSubTypeEnum" minOccurs="0"/>
 *         &lt;element name="pointCoordinates" type="{http://datex2.eu/schema/2/2_0}PointCoordinates" minOccurs="0"/>
 *         &lt;element name="alertCLocationCodeRowExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlertCLocationCodeRow", propOrder = {
    "locationCode",
    "typeClass",
    "typeCode",
    "subTypeCode",
    "alertCLocationCodeRoadName",
    "firstName",
    "secondName",
    "areaReference",
    "linearReference",
    "negativeOffset",
    "positiveOffset",
    "alertCLocationCodeRoadNumber",
    "junctionNumber",
    "remoteTargetNegativeOffset",
    "remoteTargetPositiveOffset",
    "type",
    "subType",
    "pointCoordinates",
    "alertCLocationCodeRowExtension"
})
public class AlertCLocationCodeRow {

    @XmlElement(required = true)
    protected BigInteger locationCode;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected LocationCodeClassTypeEnum typeClass;
    @XmlElement(required = true)
    protected BigInteger typeCode;
    @XmlElement(required = true)
    protected BigInteger subTypeCode;
    protected String alertCLocationCodeRoadName;
    @XmlElement(required = true)
    protected String firstName;
    protected String secondName;
    @XmlElement(required = true)
    protected BigInteger areaReference;
    protected BigInteger linearReference;
    protected BigInteger negativeOffset;
    protected BigInteger positiveOffset;
    protected String alertCLocationCodeRoadNumber;
    protected String junctionNumber;
    protected String remoteTargetNegativeOffset;
    protected String remoteTargetPositiveOffset;
    @XmlSchemaType(name = "string")
    protected LocationCodeTypeEnum type;
    @XmlSchemaType(name = "string")
    protected LocationCodeSubTypeEnum subType;
    protected PointCoordinates pointCoordinates;
    protected ExtensionType alertCLocationCodeRowExtension;

    /**
     * Gets the value of the locationCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLocationCode() {
        return locationCode;
    }

    /**
     * Sets the value of the locationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLocationCode(BigInteger value) {
        this.locationCode = value;
    }

    /**
     * Gets the value of the typeClass property.
     * 
     * @return
     *     possible object is
     *     {@link LocationCodeClassTypeEnum }
     *     
     */
    public LocationCodeClassTypeEnum getTypeClass() {
        return typeClass;
    }

    /**
     * Sets the value of the typeClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationCodeClassTypeEnum }
     *     
     */
    public void setTypeClass(LocationCodeClassTypeEnum value) {
        this.typeClass = value;
    }

    /**
     * Gets the value of the typeCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTypeCode() {
        return typeCode;
    }

    /**
     * Sets the value of the typeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTypeCode(BigInteger value) {
        this.typeCode = value;
    }

    /**
     * Gets the value of the subTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSubTypeCode() {
        return subTypeCode;
    }

    /**
     * Sets the value of the subTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSubTypeCode(BigInteger value) {
        this.subTypeCode = value;
    }

    /**
     * Gets the value of the alertCLocationCodeRoadName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertCLocationCodeRoadName() {
        return alertCLocationCodeRoadName;
    }

    /**
     * Sets the value of the alertCLocationCodeRoadName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertCLocationCodeRoadName(String value) {
        this.alertCLocationCodeRoadName = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the secondName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondName() {
        return secondName;
    }

    /**
     * Sets the value of the secondName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondName(String value) {
        this.secondName = value;
    }

    /**
     * Gets the value of the areaReference property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAreaReference() {
        return areaReference;
    }

    /**
     * Sets the value of the areaReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAreaReference(BigInteger value) {
        this.areaReference = value;
    }

    /**
     * Gets the value of the linearReference property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLinearReference() {
        return linearReference;
    }

    /**
     * Sets the value of the linearReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLinearReference(BigInteger value) {
        this.linearReference = value;
    }

    /**
     * Gets the value of the negativeOffset property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNegativeOffset() {
        return negativeOffset;
    }

    /**
     * Sets the value of the negativeOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNegativeOffset(BigInteger value) {
        this.negativeOffset = value;
    }

    /**
     * Gets the value of the positiveOffset property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPositiveOffset() {
        return positiveOffset;
    }

    /**
     * Sets the value of the positiveOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPositiveOffset(BigInteger value) {
        this.positiveOffset = value;
    }

    /**
     * Gets the value of the alertCLocationCodeRoadNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertCLocationCodeRoadNumber() {
        return alertCLocationCodeRoadNumber;
    }

    /**
     * Sets the value of the alertCLocationCodeRoadNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertCLocationCodeRoadNumber(String value) {
        this.alertCLocationCodeRoadNumber = value;
    }

    /**
     * Gets the value of the junctionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJunctionNumber() {
        return junctionNumber;
    }

    /**
     * Sets the value of the junctionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJunctionNumber(String value) {
        this.junctionNumber = value;
    }

    /**
     * Gets the value of the remoteTargetNegativeOffset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteTargetNegativeOffset() {
        return remoteTargetNegativeOffset;
    }

    /**
     * Sets the value of the remoteTargetNegativeOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteTargetNegativeOffset(String value) {
        this.remoteTargetNegativeOffset = value;
    }

    /**
     * Gets the value of the remoteTargetPositiveOffset property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteTargetPositiveOffset() {
        return remoteTargetPositiveOffset;
    }

    /**
     * Sets the value of the remoteTargetPositiveOffset property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteTargetPositiveOffset(String value) {
        this.remoteTargetPositiveOffset = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link LocationCodeTypeEnum }
     *     
     */
    public LocationCodeTypeEnum getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationCodeTypeEnum }
     *     
     */
    public void setType(LocationCodeTypeEnum value) {
        this.type = value;
    }

    /**
     * Gets the value of the subType property.
     * 
     * @return
     *     possible object is
     *     {@link LocationCodeSubTypeEnum }
     *     
     */
    public LocationCodeSubTypeEnum getSubType() {
        return subType;
    }

    /**
     * Sets the value of the subType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationCodeSubTypeEnum }
     *     
     */
    public void setSubType(LocationCodeSubTypeEnum value) {
        this.subType = value;
    }

    /**
     * Gets the value of the pointCoordinates property.
     * 
     * @return
     *     possible object is
     *     {@link PointCoordinates }
     *     
     */
    public PointCoordinates getPointCoordinates() {
        return pointCoordinates;
    }

    /**
     * Sets the value of the pointCoordinates property.
     * 
     * @param value
     *     allowed object is
     *     {@link PointCoordinates }
     *     
     */
    public void setPointCoordinates(PointCoordinates value) {
        this.pointCoordinates = value;
    }

    /**
     * Gets the value of the alertCLocationCodeRowExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getAlertCLocationCodeRowExtension() {
        return alertCLocationCodeRowExtension;
    }

    /**
     * Sets the value of the alertCLocationCodeRowExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setAlertCLocationCodeRowExtension(ExtensionType value) {
        this.alertCLocationCodeRowExtension = value;
    }

}
