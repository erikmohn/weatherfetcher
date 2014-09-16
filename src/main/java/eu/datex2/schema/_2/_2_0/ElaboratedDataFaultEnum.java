
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ElaboratedDataFaultEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ElaboratedDataFaultEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="intermittentDataValues"/>
 *     &lt;enumeration value="noDataValuesAvailable"/>
 *     &lt;enumeration value="spuriousUnreliableDataValues"/>
 *     &lt;enumeration value="unspecifiedOrUnknownFault"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ElaboratedDataFaultEnum")
@XmlEnum
public enum ElaboratedDataFaultEnum {

    @XmlEnumValue("intermittentDataValues")
    INTERMITTENT_DATA_VALUES("intermittentDataValues"),
    @XmlEnumValue("noDataValuesAvailable")
    NO_DATA_VALUES_AVAILABLE("noDataValuesAvailable"),
    @XmlEnumValue("spuriousUnreliableDataValues")
    SPURIOUS_UNRELIABLE_DATA_VALUES("spuriousUnreliableDataValues"),
    @XmlEnumValue("unspecifiedOrUnknownFault")
    UNSPECIFIED_OR_UNKNOWN_FAULT("unspecifiedOrUnknownFault"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    ElaboratedDataFaultEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ElaboratedDataFaultEnum fromValue(String v) {
        for (ElaboratedDataFaultEnum c: ElaboratedDataFaultEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
