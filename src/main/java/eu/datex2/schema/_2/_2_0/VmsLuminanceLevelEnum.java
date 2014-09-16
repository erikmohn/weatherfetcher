
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VmsLuminanceLevelEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="VmsLuminanceLevelEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="switchedOff"/>
 *     &lt;enumeration value="testing"/>
 *     &lt;enumeration value="night"/>
 *     &lt;enumeration value="overcast"/>
 *     &lt;enumeration value="broadDaylight"/>
 *     &lt;enumeration value="sunInEyes"/>
 *     &lt;enumeration value="sunOnBack"/>
 *     &lt;enumeration value="foggyDay"/>
 *     &lt;enumeration value="foggyNight"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "VmsLuminanceLevelEnum")
@XmlEnum
public enum VmsLuminanceLevelEnum {

    @XmlEnumValue("switchedOff")
    SWITCHED_OFF("switchedOff"),
    @XmlEnumValue("testing")
    TESTING("testing"),
    @XmlEnumValue("night")
    NIGHT("night"),
    @XmlEnumValue("overcast")
    OVERCAST("overcast"),
    @XmlEnumValue("broadDaylight")
    BROAD_DAYLIGHT("broadDaylight"),
    @XmlEnumValue("sunInEyes")
    SUN_IN_EYES("sunInEyes"),
    @XmlEnumValue("sunOnBack")
    SUN_ON_BACK("sunOnBack"),
    @XmlEnumValue("foggyDay")
    FOGGY_DAY("foggyDay"),
    @XmlEnumValue("foggyNight")
    FOGGY_NIGHT("foggyNight");
    private final String value;

    VmsLuminanceLevelEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static VmsLuminanceLevelEnum fromValue(String v) {
        for (VmsLuminanceLevelEnum c: VmsLuminanceLevelEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
