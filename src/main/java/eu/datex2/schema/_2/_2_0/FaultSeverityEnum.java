
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FaultSeverityEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FaultSeverityEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="low"/>
 *     &lt;enumeration value="medium"/>
 *     &lt;enumeration value="high"/>
 *     &lt;enumeration value="unknown"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FaultSeverityEnum")
@XmlEnum
public enum FaultSeverityEnum {

    @XmlEnumValue("low")
    LOW("low"),
    @XmlEnumValue("medium")
    MEDIUM("medium"),
    @XmlEnumValue("high")
    HIGH("high"),
    @XmlEnumValue("unknown")
    UNKNOWN("unknown");
    private final String value;

    FaultSeverityEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FaultSeverityEnum fromValue(String v) {
        for (FaultSeverityEnum c: FaultSeverityEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
