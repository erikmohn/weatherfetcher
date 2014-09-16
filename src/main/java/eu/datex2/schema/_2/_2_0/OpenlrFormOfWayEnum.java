
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OpenlrFormOfWayEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OpenlrFormOfWayEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="undefined"/>
 *     &lt;enumeration value="motorway"/>
 *     &lt;enumeration value="multipleCarriageway"/>
 *     &lt;enumeration value="singleCarriageway"/>
 *     &lt;enumeration value="roundabout"/>
 *     &lt;enumeration value="slipRoad"/>
 *     &lt;enumeration value="trafficSquare"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OpenlrFormOfWayEnum")
@XmlEnum
public enum OpenlrFormOfWayEnum {

    @XmlEnumValue("undefined")
    UNDEFINED("undefined"),
    @XmlEnumValue("motorway")
    MOTORWAY("motorway"),
    @XmlEnumValue("multipleCarriageway")
    MULTIPLE_CARRIAGEWAY("multipleCarriageway"),
    @XmlEnumValue("singleCarriageway")
    SINGLE_CARRIAGEWAY("singleCarriageway"),
    @XmlEnumValue("roundabout")
    ROUNDABOUT("roundabout"),
    @XmlEnumValue("slipRoad")
    SLIP_ROAD("slipRoad"),
    @XmlEnumValue("trafficSquare")
    TRAFFIC_SQUARE("trafficSquare"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    OpenlrFormOfWayEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OpenlrFormOfWayEnum fromValue(String v) {
        for (OpenlrFormOfWayEnum c: OpenlrFormOfWayEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
