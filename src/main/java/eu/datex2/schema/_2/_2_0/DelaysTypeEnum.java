
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DelaysTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DelaysTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="delays"/>
 *     &lt;enumeration value="delaysOfUncertainDuration"/>
 *     &lt;enumeration value="longDelays"/>
 *     &lt;enumeration value="veryLongDelays"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DelaysTypeEnum")
@XmlEnum
public enum DelaysTypeEnum {

    @XmlEnumValue("delays")
    DELAYS("delays"),
    @XmlEnumValue("delaysOfUncertainDuration")
    DELAYS_OF_UNCERTAIN_DURATION("delaysOfUncertainDuration"),
    @XmlEnumValue("longDelays")
    LONG_DELAYS("longDelays"),
    @XmlEnumValue("veryLongDelays")
    VERY_LONG_DELAYS("veryLongDelays");
    private final String value;

    DelaysTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DelaysTypeEnum fromValue(String v) {
        for (DelaysTypeEnum c: DelaysTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
