
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CctvCameraControlAvailabilityEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CctvCameraControlAvailabilityEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="controlAvailable"/>
 *     &lt;enumeration value="controlBlocked"/>
 *     &lt;enumeration value="controlCurrentlyAssigned"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CctvCameraControlAvailabilityEnum")
@XmlEnum
public enum CctvCameraControlAvailabilityEnum {

    @XmlEnumValue("controlAvailable")
    CONTROL_AVAILABLE("controlAvailable"),
    @XmlEnumValue("controlBlocked")
    CONTROL_BLOCKED("controlBlocked"),
    @XmlEnumValue("controlCurrentlyAssigned")
    CONTROL_CURRENTLY_ASSIGNED("controlCurrentlyAssigned");
    private final String value;

    CctvCameraControlAvailabilityEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CctvCameraControlAvailabilityEnum fromValue(String v) {
        for (CctvCameraControlAvailabilityEnum c: CctvCameraControlAvailabilityEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
