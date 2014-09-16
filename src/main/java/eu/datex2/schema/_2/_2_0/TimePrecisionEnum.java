
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TimePrecisionEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TimePrecisionEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="tenthsOfSecond"/>
 *     &lt;enumeration value="second"/>
 *     &lt;enumeration value="minute"/>
 *     &lt;enumeration value="quarterHour"/>
 *     &lt;enumeration value="halfHour"/>
 *     &lt;enumeration value="hour"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TimePrecisionEnum")
@XmlEnum
public enum TimePrecisionEnum {

    @XmlEnumValue("tenthsOfSecond")
    TENTHS_OF_SECOND("tenthsOfSecond"),
    @XmlEnumValue("second")
    SECOND("second"),
    @XmlEnumValue("minute")
    MINUTE("minute"),
    @XmlEnumValue("quarterHour")
    QUARTER_HOUR("quarterHour"),
    @XmlEnumValue("halfHour")
    HALF_HOUR("halfHour"),
    @XmlEnumValue("hour")
    HOUR("hour");
    private final String value;

    TimePrecisionEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TimePrecisionEnum fromValue(String v) {
        for (TimePrecisionEnum c: TimePrecisionEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
