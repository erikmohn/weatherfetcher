
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LinearElementNatureEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LinearElementNatureEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="road"/>
 *     &lt;enumeration value="roadSection"/>
 *     &lt;enumeration value="slipRoad"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LinearElementNatureEnum")
@XmlEnum
public enum LinearElementNatureEnum {

    @XmlEnumValue("road")
    ROAD("road"),
    @XmlEnumValue("roadSection")
    ROAD_SECTION("roadSection"),
    @XmlEnumValue("slipRoad")
    SLIP_ROAD("slipRoad"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    LinearElementNatureEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LinearElementNatureEnum fromValue(String v) {
        for (LinearElementNatureEnum c: LinearElementNatureEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
