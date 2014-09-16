
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PhysicalMountingEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PhysicalMountingEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="centralReservationMounted"/>
 *     &lt;enumeration value="gantryMounted"/>
 *     &lt;enumeration value="overheadBridgeMounted"/>
 *     &lt;enumeration value="roadsideCantileverMounted"/>
 *     &lt;enumeration value="roadsideMounted"/>
 *     &lt;enumeration value="trailerMounted"/>
 *     &lt;enumeration value="tunnelEntranceMounted"/>
 *     &lt;enumeration value="vehicleMounted"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PhysicalMountingEnum")
@XmlEnum
public enum PhysicalMountingEnum {

    @XmlEnumValue("centralReservationMounted")
    CENTRAL_RESERVATION_MOUNTED("centralReservationMounted"),
    @XmlEnumValue("gantryMounted")
    GANTRY_MOUNTED("gantryMounted"),
    @XmlEnumValue("overheadBridgeMounted")
    OVERHEAD_BRIDGE_MOUNTED("overheadBridgeMounted"),
    @XmlEnumValue("roadsideCantileverMounted")
    ROADSIDE_CANTILEVER_MOUNTED("roadsideCantileverMounted"),
    @XmlEnumValue("roadsideMounted")
    ROADSIDE_MOUNTED("roadsideMounted"),
    @XmlEnumValue("trailerMounted")
    TRAILER_MOUNTED("trailerMounted"),
    @XmlEnumValue("tunnelEntranceMounted")
    TUNNEL_ENTRANCE_MOUNTED("tunnelEntranceMounted"),
    @XmlEnumValue("vehicleMounted")
    VEHICLE_MOUNTED("vehicleMounted");
    private final String value;

    PhysicalMountingEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PhysicalMountingEnum fromValue(String v) {
        for (PhysicalMountingEnum c: PhysicalMountingEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
