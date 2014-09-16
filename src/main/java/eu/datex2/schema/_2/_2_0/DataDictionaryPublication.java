
package eu.datex2.schema._2._2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DataDictionaryPublication complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DataDictionaryPublication">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}GenericPublication">
 *       &lt;sequence>
 *         &lt;element name="dataDictionary" type="{http://datex2.eu/schema/2/2_0}DataDictionary" maxOccurs="unbounded"/>
 *         &lt;element name="dataDictionaryPublicationExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DataDictionaryPublication", propOrder = {
    "dataDictionary",
    "dataDictionaryPublicationExtension"
})
public class DataDictionaryPublication
    extends GenericPublication
{

    @XmlElement(required = true)
    protected List<DataDictionary> dataDictionary;
    protected ExtensionType dataDictionaryPublicationExtension;

    /**
     * Gets the value of the dataDictionary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dataDictionary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDataDictionary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DataDictionary }
     * 
     * 
     */
    public List<DataDictionary> getDataDictionary() {
        if (dataDictionary == null) {
            dataDictionary = new ArrayList<DataDictionary>();
        }
        return this.dataDictionary;
    }

    /**
     * Gets the value of the dataDictionaryPublicationExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getDataDictionaryPublicationExtension() {
        return dataDictionaryPublicationExtension;
    }

    /**
     * Sets the value of the dataDictionaryPublicationExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setDataDictionaryPublicationExtension(ExtensionType value) {
        this.dataDictionaryPublicationExtension = value;
    }

}
