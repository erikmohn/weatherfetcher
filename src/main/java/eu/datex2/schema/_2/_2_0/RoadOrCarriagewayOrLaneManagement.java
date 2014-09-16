
package eu.datex2.schema._2._2_0;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoadOrCarriagewayOrLaneManagement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoadOrCarriagewayOrLaneManagement">
 *   &lt;complexContent>
 *     &lt;extension base="{http://datex2.eu/schema/2/2_0}NetworkManagement">
 *       &lt;sequence>
 *         &lt;element name="roadOrCarriagewayOrLaneManagementType" type="{http://datex2.eu/schema/2/2_0}RoadOrCarriagewayOrLaneManagementTypeEnum"/>
 *         &lt;element name="minimumCarOccupancy" type="{http://datex2.eu/schema/2/2_0}NonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="roadOrCarriagewayOrLaneManagementExtension" type="{http://datex2.eu/schema/2/2_0}_ExtensionType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoadOrCarriagewayOrLaneManagement", propOrder = {
    "roadOrCarriagewayOrLaneManagementType",
    "minimumCarOccupancy",
    "roadOrCarriagewayOrLaneManagementExtension"
})
public class RoadOrCarriagewayOrLaneManagement
    extends NetworkManagement
{

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected RoadOrCarriagewayOrLaneManagementTypeEnum roadOrCarriagewayOrLaneManagementType;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger minimumCarOccupancy;
    protected ExtensionType roadOrCarriagewayOrLaneManagementExtension;

    /**
     * Gets the value of the roadOrCarriagewayOrLaneManagementType property.
     * 
     * @return
     *     possible object is
     *     {@link RoadOrCarriagewayOrLaneManagementTypeEnum }
     *     
     */
    public RoadOrCarriagewayOrLaneManagementTypeEnum getRoadOrCarriagewayOrLaneManagementType() {
        return roadOrCarriagewayOrLaneManagementType;
    }

    /**
     * Sets the value of the roadOrCarriagewayOrLaneManagementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoadOrCarriagewayOrLaneManagementTypeEnum }
     *     
     */
    public void setRoadOrCarriagewayOrLaneManagementType(RoadOrCarriagewayOrLaneManagementTypeEnum value) {
        this.roadOrCarriagewayOrLaneManagementType = value;
    }

    /**
     * Gets the value of the minimumCarOccupancy property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinimumCarOccupancy() {
        return minimumCarOccupancy;
    }

    /**
     * Sets the value of the minimumCarOccupancy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinimumCarOccupancy(BigInteger value) {
        this.minimumCarOccupancy = value;
    }

    /**
     * Gets the value of the roadOrCarriagewayOrLaneManagementExtension property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionType }
     *     
     */
    public ExtensionType getRoadOrCarriagewayOrLaneManagementExtension() {
        return roadOrCarriagewayOrLaneManagementExtension;
    }

    /**
     * Sets the value of the roadOrCarriagewayOrLaneManagementExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionType }
     *     
     */
    public void setRoadOrCarriagewayOrLaneManagementExtension(ExtensionType value) {
        this.roadOrCarriagewayOrLaneManagementExtension = value;
    }

}
