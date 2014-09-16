
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LinearReferencingDirectionEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LinearReferencingDirectionEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="both"/>
 *     &lt;enumeration value="opposite"/>
 *     &lt;enumeration value="aligned"/>
 *     &lt;enumeration value="unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LinearReferencingDirectionEnum")
@XmlEnum
public enum LinearReferencingDirectionEnum {

    @XmlEnumValue("both")
    BOTH("both"),
    @XmlEnumValue("opposite")
    OPPOSITE("opposite"),
    @XmlEnumValue("aligned")
    ALIGNED("aligned"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    LinearReferencingDirectionEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LinearReferencingDirectionEnum fromValue(String v) {
        for (LinearReferencingDirectionEnum c: LinearReferencingDirectionEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
