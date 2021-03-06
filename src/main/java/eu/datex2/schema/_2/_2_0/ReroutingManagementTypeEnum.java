
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReroutingManagementTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReroutingManagementTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="doNotFollowDiversionSigns"/>
 *     &lt;enumeration value="doNotUseEntry"/>
 *     &lt;enumeration value="doNotUseExit"/>
 *     &lt;enumeration value="doNotUseIntersectionOrJunction"/>
 *     &lt;enumeration value="followDiversionSigns"/>
 *     &lt;enumeration value="followLocalDiversion"/>
 *     &lt;enumeration value="followSpecialMarkers"/>
 *     &lt;enumeration value="useEntry"/>
 *     &lt;enumeration value="useExit"/>
 *     &lt;enumeration value="useIntersectionOrJunction"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReroutingManagementTypeEnum")
@XmlEnum
public enum ReroutingManagementTypeEnum {

    @XmlEnumValue("doNotFollowDiversionSigns")
    DO_NOT_FOLLOW_DIVERSION_SIGNS("doNotFollowDiversionSigns"),
    @XmlEnumValue("doNotUseEntry")
    DO_NOT_USE_ENTRY("doNotUseEntry"),
    @XmlEnumValue("doNotUseExit")
    DO_NOT_USE_EXIT("doNotUseExit"),
    @XmlEnumValue("doNotUseIntersectionOrJunction")
    DO_NOT_USE_INTERSECTION_OR_JUNCTION("doNotUseIntersectionOrJunction"),
    @XmlEnumValue("followDiversionSigns")
    FOLLOW_DIVERSION_SIGNS("followDiversionSigns"),
    @XmlEnumValue("followLocalDiversion")
    FOLLOW_LOCAL_DIVERSION("followLocalDiversion"),
    @XmlEnumValue("followSpecialMarkers")
    FOLLOW_SPECIAL_MARKERS("followSpecialMarkers"),
    @XmlEnumValue("useEntry")
    USE_ENTRY("useEntry"),
    @XmlEnumValue("useExit")
    USE_EXIT("useExit"),
    @XmlEnumValue("useIntersectionOrJunction")
    USE_INTERSECTION_OR_JUNCTION("useIntersectionOrJunction");
    private final String value;

    ReroutingManagementTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ReroutingManagementTypeEnum fromValue(String v) {
        for (ReroutingManagementTypeEnum c: ReroutingManagementTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
