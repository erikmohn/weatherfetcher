
package eu.datex2.schema._2._2_0;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AlertCLocationCodeTable complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AlertCLocationCodeTable">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="countryId" type="{http://datex2.eu/schema/2/2_0}Integer"/>
 *         &lt;element name="countryName" type="{http://datex2.eu/schema/2/2_0}String"/>
 *         &lt;element name="tableCode" type="{http://datex2.eu/schema/2/2_0}Integer"/>
 *         &lt;element name="versionNumber" type="{http://datex2.eu/schema/2/2_0}String"/>
 *         &lt;element name="releaseDate" type="{http://datex2.eu/schema/2/2_0}DateTime"/>
 *         &lt;element name="alertCLocationCodeRow" type="{http://datex2.eu/schema/2/2_0}AlertCLocationCodeRow" maxOccurs="unbounded"/>
 *         &lt;element name="alertCLocationCodeTableExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlertCLocationCodeTable", propOrder = {
    "countryId",
    "countryName",
    "tableCode",
    "versionNumber",
    "releaseDate",
    "alertCLocationCodeRow",
    "alertCLocationCodeTableExtension"
})
public class AlertCLocationCodeTable {

    @XmlElement(required = true)
    protected BigInteger countryId;
    @XmlElement(required = true)
    protected String countryName;
    @XmlElement(required = true)
    protected BigInteger tableCode;
    @XmlElement(required = true)
    protected String versionNumber;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar releaseDate;
    @XmlElement(required = true)
    protected List<AlertCLocationCodeRow> alertCLocationCodeRow;
    protected ExtensionType alertCLocationCodeTableExtension;

    /**
     * Gets the value of the countryId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCountryId() {
        return countryId;
    }

    /**
     * Sets the value of the countryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCountryId(BigInteger value) {
        this.countryId = value;
    }

    /**
     * Gets the value of the countryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * Sets the value of the countryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryName(String value) {
        this.countryName = value;
    }

    /**
     * Gets the value of the tableCode property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTableCode() {
        return tableCode;
    }

    /**
     * Sets the value of the tableCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTableCode(BigInteger value) {
        this.tableCode = value;
    }

    /**
     * Gets the value of the versionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersionNumber() {
        return versionNumber;
    }

    /**
     * Sets the value of the versionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersionNumber(String value) {
        this.versionNumber = value;
    }

    /**
     * Gets the value of the releaseDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReleaseDate() {
        return releaseDate;
    }

    /**
     * Sets the value of the releaseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReleaseDate(XMLGregorianCalendar value) {
        this.releaseDate = value;
    }

    /**
     * Gets the value of the alertCLocationCodeRow property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alertCLocationCodeRow property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlertCLocationCodeRow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlertCLocationCodeRow }
     * 
     * 
     */
    public List<AlertCLocationCodeRow> getAlertCLocationCodeRow() {
        if (alertCLocationCodeRow == null) {
            alertCLocationCodeRow = new ArrayList<AlertCLocationCodeRow>();
        }
        return this.alertCLocationCodeRow;
    }

    /**
     * Gets the value of the alertCLocationCodeTableExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getAlertCLocationCodeTableExtension() {
        return alertCLocationCodeTableExtension;
    }

    /**
     * Sets the value of the alertCLocationCodeTableExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setAlertCLocationCodeTableExtension(ExtensionType value) {
        this.alertCLocationCodeTableExtension = value;
    }

}
