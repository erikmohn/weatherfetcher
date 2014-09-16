
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
 * <p>Java class for CctvVideoService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CctvVideoService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cctvVideoServiceLevel" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger"/>
 *         &lt;element name="cctvVideoServiceLevelName" type="{http://datex2.eu/schema/2/2_0}MultilingualString" minOccurs="0"/>
 *         &lt;element name="cctvVideoEncodingStandard" type="{http://datex2.eu/schema/2/2_0}String"/>
 *         &lt;element name="cctvVideoResolution" type="{http://datex2.eu/schema/2/2_0}String" minOccurs="0"/>
 *         &lt;element name="cctvVideoFrameRate" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="cctvVideoBitRate" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="cctvVideoZoomBlankingLevel" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="videoUrl" type="{http://datex2.eu/schema/2/2_0}UrlLink"/>
 *         &lt;element name="orientationImageUrl" type="{http://datex2.eu/schema/2/2_0}UrlLink" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="cctvVideoServiceExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CctvVideoService", propOrder = {
    "cctvVideoServiceLevel",
    "cctvVideoServiceLevelName",
    "cctvVideoEncodingStandard",
    "cctvVideoResolution",
    "cctvVideoFrameRate",
    "cctvVideoBitRate",
    "cctvVideoZoomBlankingLevel",
    "videoUrl",
    "orientationImageUrl",
    "cctvVideoServiceExtension"
})
public class CctvVideoService {

    @XmlElement(required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger cctvVideoServiceLevel;
    protected MultilingualString cctvVideoServiceLevelName;
    @XmlElement(required = true)
    protected String cctvVideoEncodingStandard;
    protected String cctvVideoResolution;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger cctvVideoFrameRate;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger cctvVideoBitRate;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger cctvVideoZoomBlankingLevel;
    @XmlElement(required = true)
    protected UrlLink videoUrl;
    protected List<UrlLink> orientationImageUrl;
    protected ExtensionType cctvVideoServiceExtension;

    /**
     * Gets the value of the cctvVideoServiceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCctvVideoServiceLevel() {
        return cctvVideoServiceLevel;
    }

    /**
     * Sets the value of the cctvVideoServiceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCctvVideoServiceLevel(BigInteger value) {
        this.cctvVideoServiceLevel = value;
    }

    /**
     * Gets the value of the cctvVideoServiceLevelName property.
     * 
     * @return
     *     possible object is
     *     {@link MultilingualString }
     *     
     */
    public MultilingualString getCctvVideoServiceLevelName() {
        return cctvVideoServiceLevelName;
    }

    /**
     * Sets the value of the cctvVideoServiceLevelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultilingualString }
     *     
     */
    public void setCctvVideoServiceLevelName(MultilingualString value) {
        this.cctvVideoServiceLevelName = value;
    }

    /**
     * Gets the value of the cctvVideoEncodingStandard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCctvVideoEncodingStandard() {
        return cctvVideoEncodingStandard;
    }

    /**
     * Sets the value of the cctvVideoEncodingStandard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCctvVideoEncodingStandard(String value) {
        this.cctvVideoEncodingStandard = value;
    }

    /**
     * Gets the value of the cctvVideoResolution property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCctvVideoResolution() {
        return cctvVideoResolution;
    }

    /**
     * Sets the value of the cctvVideoResolution property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCctvVideoResolution(String value) {
        this.cctvVideoResolution = value;
    }

    /**
     * Gets the value of the cctvVideoFrameRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCctvVideoFrameRate() {
        return cctvVideoFrameRate;
    }

    /**
     * Sets the value of the cctvVideoFrameRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCctvVideoFrameRate(BigInteger value) {
        this.cctvVideoFrameRate = value;
    }

    /**
     * Gets the value of the cctvVideoBitRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCctvVideoBitRate() {
        return cctvVideoBitRate;
    }

    /**
     * Sets the value of the cctvVideoBitRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCctvVideoBitRate(BigInteger value) {
        this.cctvVideoBitRate = value;
    }

    /**
     * Gets the value of the cctvVideoZoomBlankingLevel property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCctvVideoZoomBlankingLevel() {
        return cctvVideoZoomBlankingLevel;
    }

    /**
     * Sets the value of the cctvVideoZoomBlankingLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCctvVideoZoomBlankingLevel(BigInteger value) {
        this.cctvVideoZoomBlankingLevel = value;
    }

    /**
     * Gets the value of the videoUrl property.
     * 
     * @return
     *     possible object is
     *     {@link UrlLink }
     *     
     */
    public UrlLink getVideoUrl() {
        return videoUrl;
    }

    /**
     * Sets the value of the videoUrl property.
     * 
     * @param value
     *     allowed object is
     *     {@link UrlLink }
     *     
     */
    public void setVideoUrl(UrlLink value) {
        this.videoUrl = value;
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
     * Gets the value of the cctvVideoServiceExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getCctvVideoServiceExtension() {
        return cctvVideoServiceExtension;
    }

    /**
     * Sets the value of the cctvVideoServiceExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setCctvVideoServiceExtension(ExtensionType value) {
        this.cctvVideoServiceExtension = value;
    }

}
