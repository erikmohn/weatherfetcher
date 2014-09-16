
package eu.datex2.schema._2._2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NetworkManagementExtension complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NetworkManagementExtension">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="exceptForVehiclesWithCharacteristicsOf" type="{http://datex2.eu/schema/2/2_0}VehicleCharacteristics" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetworkManagementExtension", propOrder = {
    "exceptForVehiclesWithCharacteristicsOf"
})
public class NetworkManagementExtension {

    protected List<VehicleCharacteristics> exceptForVehiclesWithCharacteristicsOf;

    /**
     * Gets the value of the exceptForVehiclesWithCharacteristicsOf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exceptForVehiclesWithCharacteristicsOf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExceptForVehiclesWithCharacteristicsOf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleCharacteristics }
     * 
     * 
     */
    public List<VehicleCharacteristics> getExceptForVehiclesWithCharacteristicsOf() {
        if (exceptForVehiclesWithCharacteristicsOf == null) {
            exceptForVehiclesWithCharacteristicsOf = new ArrayList<VehicleCharacteristics>();
        }
        return this.exceptForVehiclesWithCharacteristicsOf;
    }

}
