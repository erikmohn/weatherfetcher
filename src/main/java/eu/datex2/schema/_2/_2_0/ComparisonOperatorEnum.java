
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ComparisonOperatorEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ComparisonOperatorEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="equalTo"/>
 *     &lt;enumeration value="greaterThan"/>
 *     &lt;enumeration value="greaterThanOrEqualTo"/>
 *     &lt;enumeration value="lessThan"/>
 *     &lt;enumeration value="lessThanOrEqualTo"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ComparisonOperatorEnum")
@XmlEnum
public enum ComparisonOperatorEnum {

    @XmlEnumValue("equalTo")
    EQUAL_TO("equalTo"),
    @XmlEnumValue("greaterThan")
    GREATER_THAN("greaterThan"),
    @XmlEnumValue("greaterThanOrEqualTo")
    GREATER_THAN_OR_EQUAL_TO("greaterThanOrEqualTo"),
    @XmlEnumValue("lessThan")
    LESS_THAN("lessThan"),
    @XmlEnumValue("lessThanOrEqualTo")
    LESS_THAN_OR_EQUAL_TO("lessThanOrEqualTo");
    private final String value;

    ComparisonOperatorEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ComparisonOperatorEnum fromValue(String v) {
        for (ComparisonOperatorEnum c: ComparisonOperatorEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
