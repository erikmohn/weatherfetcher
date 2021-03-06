
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VehicleUsageEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VehicleUsageEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="agricultural"/>
 *     &lt;enumeration value="commercial"/>
 *     &lt;enumeration value="emergencyServices"/>
 *     &lt;enumeration value="military"/>
 *     &lt;enumeration value="nonCommercial"/>
 *     &lt;enumeration value="patrol"/>
 *     &lt;enumeration value="recoveryServices"/>
 *     &lt;enumeration value="roadMaintenanceOrConstruction"/>
 *     &lt;enumeration value="roadOperator"/>
 *     &lt;enumeration value="taxi"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VehicleUsageEnum")
@XmlEnum
public enum VehicleUsageEnum {

    @XmlEnumValue("agricultural")
    AGRICULTURAL("agricultural"),
    @XmlEnumValue("commercial")
    COMMERCIAL("commercial"),
    @XmlEnumValue("emergencyServices")
    EMERGENCY_SERVICES("emergencyServices"),
    @XmlEnumValue("military")
    MILITARY("military"),
    @XmlEnumValue("nonCommercial")
    NON_COMMERCIAL("nonCommercial"),
    @XmlEnumValue("patrol")
    PATROL("patrol"),
    @XmlEnumValue("recoveryServices")
    RECOVERY_SERVICES("recoveryServices"),
    @XmlEnumValue("roadMaintenanceOrConstruction")
    ROAD_MAINTENANCE_OR_CONSTRUCTION("roadMaintenanceOrConstruction"),
    @XmlEnumValue("roadOperator")
    ROAD_OPERATOR("roadOperator"),
    @XmlEnumValue("taxi")
    TAXI("taxi");
    private final String value;

    VehicleUsageEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VehicleUsageEnum fromValue(String v) {
        for (VehicleUsageEnum c: VehicleUsageEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
