
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AlertCDirectionEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AlertCDirectionEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="both"/>
 *     &lt;enumeration value="negative"/>
 *     &lt;enumeration value="positive"/>
 *     &lt;enumeration value="unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AlertCDirectionEnum")
@XmlEnum
public enum AlertCDirectionEnum {

    @XmlEnumValue("both")
    BOTH("both"),
    @XmlEnumValue("negative")
    NEGATIVE("negative"),
    @XmlEnumValue("positive")
    POSITIVE("positive"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    AlertCDirectionEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AlertCDirectionEnum fromValue(String v) {
        for (AlertCDirectionEnum c: AlertCDirectionEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
