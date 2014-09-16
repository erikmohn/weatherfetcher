
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrafficTrendTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TrafficTrendTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="trafficBuildingUp"/>
 *     &lt;enumeration value="trafficEasing"/>
 *     &lt;enumeration value="trafficStable"/>
 *     &lt;enumeration value="unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TrafficTrendTypeEnum")
@XmlEnum
public enum TrafficTrendTypeEnum {

    @XmlEnumValue("trafficBuildingUp")
    TRAFFIC_BUILDING_UP("trafficBuildingUp"),
    @XmlEnumValue("trafficEasing")
    TRAFFIC_EASING("trafficEasing"),
    @XmlEnumValue("trafficStable")
    TRAFFIC_STABLE("trafficStable"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    TrafficTrendTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TrafficTrendTypeEnum fromValue(String v) {
        for (TrafficTrendTypeEnum c: TrafficTrendTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
