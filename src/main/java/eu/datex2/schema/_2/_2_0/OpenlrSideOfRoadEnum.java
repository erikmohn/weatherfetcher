
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OpenlrSideOfRoadEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OpenlrSideOfRoadEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="onRoadOrUnknown"/>
 *     &lt;enumeration value="right"/>
 *     &lt;enumeration value="left"/>
 *     &lt;enumeration value="both"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OpenlrSideOfRoadEnum")
@XmlEnum
public enum OpenlrSideOfRoadEnum {

    @XmlEnumValue("onRoadOrUnknown")
    ON_ROAD_OR_UNKNOWN("onRoadOrUnknown"),
    @XmlEnumValue("right")
    RIGHT("right"),
    @XmlEnumValue("left")
    LEFT("left"),
    @XmlEnumValue("both")
    BOTH("both");
    private final String value;

    OpenlrSideOfRoadEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OpenlrSideOfRoadEnum fromValue(String v) {
        for (OpenlrSideOfRoadEnum c: OpenlrSideOfRoadEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
