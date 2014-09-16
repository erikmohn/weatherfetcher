
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OpenlrOrientationEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OpenlrOrientationEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="noOrientationOrUnknown"/>
 *     &lt;enumeration value="withLineDirection"/>
 *     &lt;enumeration value="againstLineDirection"/>
 *     &lt;enumeration value="both"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "OpenlrOrientationEnum")
@XmlEnum
public enum OpenlrOrientationEnum {

    @XmlEnumValue("noOrientationOrUnknown")
    NO_ORIENTATION_OR_UNKNOWN("noOrientationOrUnknown"),
    @XmlEnumValue("withLineDirection")
    WITH_LINE_DIRECTION("withLineDirection"),
    @XmlEnumValue("againstLineDirection")
    AGAINST_LINE_DIRECTION("againstLineDirection"),
    @XmlEnumValue("both")
    BOTH("both");
    private final String value;

    OpenlrOrientationEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OpenlrOrientationEnum fromValue(String v) {
        for (OpenlrOrientationEnum c: OpenlrOrientationEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
