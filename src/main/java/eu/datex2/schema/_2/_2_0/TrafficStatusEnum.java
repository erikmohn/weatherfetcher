
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrafficStatusEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TrafficStatusEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="impossible"/>
 *     &lt;enumeration value="congested"/>
 *     &lt;enumeration value="heavy"/>
 *     &lt;enumeration value="freeFlow"/>
 *     &lt;enumeration value="unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TrafficStatusEnum")
@XmlEnum
public enum TrafficStatusEnum {

    @XmlEnumValue("impossible")
    IMPOSSIBLE("impossible"),
    @XmlEnumValue("congested")
    CONGESTED("congested"),
    @XmlEnumValue("heavy")
    HEAVY("heavy"),
    @XmlEnumValue("freeFlow")
    FREE_FLOW("freeFlow"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    TrafficStatusEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TrafficStatusEnum fromValue(String v) {
        for (TrafficStatusEnum c: TrafficStatusEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
