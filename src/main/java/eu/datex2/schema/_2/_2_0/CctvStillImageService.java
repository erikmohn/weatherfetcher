
package eu.datex2.schema._2._2_0;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CctvStillImageService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CctvStillImageService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cctvStillImageServiceLevel" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger"/>
 *         &lt;element name="cctvStillImageServiceLevelName" type="{http://datex2.eu/schema/2/2_0}MultilingualString" minOccurs="0"/>
 *         &lt;element name="cctvStillImageFormat" type="{http://datex2.eu/schema/2/2_0}CctvStillImageFormatEnum"/>
 *         &lt;element name="cctvStillImageWidth" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="cctvStillImageHeight" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="cctvStillImageZoomBlankingLevel" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="stillImageUrl" type="{http://datex2.eu/schema/2/2_0}UrlLink"/>
 *         &lt;element name="orientationImageUrl" type="{http://datex2.eu/schema/2/2_0}UrlLink" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="cctvStillImageServiceExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CctvStillImageService", propOrder = {
    "cctvStillImageServiceLevel",
    "cctvStillImageServiceLevelName",
    "cctvStillImageFormat",
    "cctvStillImageWidth",
    "cctvStillImageHeight",
    "cctvStillImageZoomBlankingLevel",
    "stillImageUrl",
    "orientationImageUrl",
    "cctvStillImageServiceExtension"
})
public class CctvStillImageService {

    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger cctvStillImageServiceLevel;
    protected MultilingualString cctvStillImageServiceLevelName;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected CctvStillImageFormatEnum cctvStillImageFormat;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger cctvStillImageWidth;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger cctvStillImageHeight;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger cctvStillImageZoomBlankingLevel;
    @XmlElement(required = true)
    protected UrlLink stillImageUrl;
    protected List<UrlLink> orientationImageUrl;
    protected ExtensionType cctvStillImageServiceExtension;

    /**
     * Gets the value of the cctvStillImageServiceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCctvStillImageServiceLevel() {
        return cctvStillImageServiceLevel;
    }

    /**
     * Sets the value of the cctvStillImageServiceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCctvStillImageServiceLevel(BigInteger value) {
        this.cctvStillImageServiceLevel = value;
    }

    /**
     * Gets the value of the cctvStillImageServiceLevelName property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getCctvStillImageServiceLevelName() {
        return cctvStillImageServiceLevelName;
    }

    /**
     * Sets the value of the cctvStillImageServiceLevelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setCctvStillImageServiceLevelName(MultilingualString value) {
        this.cctvStillImageServiceLevelName = value;
    }

    /**
     * Gets the value of the cctvStillImageFormat property.
     * 
     * @return
     *     possible object is
     *     {@link CctvStillImageFormatEnum }
     *     
     */
    public CctvStillImageFormatEnum getCctvStillImageFormat() {
        return cctvStillImageFormat;
    }

    /**
     * Sets the value of the cctvStillImageFormat property.
     * 
     * @param value
     *     allowed object is
     *     {@link CctvStillImageFormatEnum }
     *     
     */
    public void setCctvStillImageFormat(CctvStillImageFormatEnum value) {
        this.cctvStillImageFormat = value;
    }

    /**
     * Gets the value of the cctvStillImageWidth property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCctvStillImageWidth() {
        return cctvStillImageWidth;
    }

    /**
     * Sets the value of the cctvStillImageWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCctvStillImageWidth(BigInteger value) {
        this.cctvStillImageWidth = value;
    }

    /**
     * Gets the value of the cctvStillImageHeight property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCctvStillImageHeight() {
        return cctvStillImageHeight;
    }

    /**
     * Sets the value of the cctvStillImageHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCctvStillImageHeight(BigInteger value) {
        this.cctvStillImageHeight = value;
    }

    /**
     * Gets the value of the cctvStillImageZoomBlankingLevel property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCctvStillImageZoomBlankingLevel() {
        return cctvStillImageZoomBlankingLevel;
    }

    /**
     * Sets the value of the cctvStillImageZoomBlankingLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCctvStillImageZoomBlankingLevel(BigInteger value) {
        this.cctvStillImageZoomBlankingLevel = value;
    }

    /**
     * Gets the value of the stillImageUrl property.
     * 
     * @return
     *     possible object is
     *     {@link UrlLink }
     *     
     */
    public UrlLink getStillImageUrl() {
        return stillImageUrl;
    }

    /**
     * Sets the value of the stillImageUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link UrlLink }
     *     
     */
    public void setStillImageUrl(UrlLink value) {
        this.stillImageUrl = value;
    }

    /**
     * Gets the value of the orientationImageUrl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orientationImageUrl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrientationImageUrl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UrlLink }
     * 
     * 
     */
    public List<UrlLink> getOrientationImageUrl() {
        if (orientationImageUrl == null) {
            orientationImageUrl = new ArrayList<UrlLink>();
        }
        return this.orientationImageUrl;
    }

    /**
     * Gets the value of the cctvStillImageServiceExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getCctvStillImageServiceExtension() {
        return cctvStillImageServiceExtension;
    }

    /**
     * Sets the value of the cctvStillImageServiceExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setCctvStillImageServiceExtension(ExtensionType value) {
        this.cctvStillImageServiceExtension = value;
    }

}
