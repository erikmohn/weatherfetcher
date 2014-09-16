
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProbabilityOfOccurrenceEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProbabilityOfOccurrenceEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="certain"/>
 *     &lt;enumeration value="probable"/>
 *     &lt;enumeration value="riskOf"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProbabilityOfOccurrenceEnum")
@XmlEnum
public enum ProbabilityOfOccurrenceEnum {

    @XmlEnumValue("certain")
    CERTAIN("certain"),
    @XmlEnumValue("probable")
    PROBABLE("probable"),
    @XmlEnumValue("riskOf")
    RISK_OF("riskOf");
    private final String value;

    ProbabilityOfOccurrenceEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProbabilityOfOccurrenceEnum fromValue(String v) {
        for (ProbabilityOfOccurrenceEnum c: ProbabilityOfOccurrenceEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
