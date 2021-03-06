
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvolvementRolesEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InvolvementRolesEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="cyclist"/>
 *     &lt;enumeration value="pedestrian"/>
 *     &lt;enumeration value="unknown"/>
 *     &lt;enumeration value="vehicleDriver"/>
 *     &lt;enumeration value="vehicleOccupant"/>
 *     &lt;enumeration value="vehiclePassenger"/>
 *     &lt;enumeration value="witness"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "InvolvementRolesEnum")
@XmlEnum
public enum InvolvementRolesEnum {

    @XmlEnumValue("cyclist")
    CYCLIST("cyclist"),
    @XmlEnumValue("pedestrian")
    PEDESTRIAN("pedestrian"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown"),
    @XmlEnumValue("vehicleDriver")
    VEHICLE_DRIVER("vehicleDriver"),
    @XmlEnumValue("vehicleOccupant")
    VEHICLE_OCCUPANT("vehicleOccupant"),
    @XmlEnumValue("vehiclePassenger")
    VEHICLE_PASSENGER("vehiclePassenger"),
    @XmlEnumValue("witness")
    WITNESS("witness");
    private final String value;

    InvolvementRolesEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InvolvementRolesEnum fromValue(String v) {
        for (InvolvementRolesEnum c: InvolvementRolesEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
