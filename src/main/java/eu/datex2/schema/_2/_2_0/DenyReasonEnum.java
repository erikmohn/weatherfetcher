
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DenyReasonEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DenyReasonEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="unknownReason"/>
 *     &lt;enumeration value="wrongCatalogue"/>
 *     &lt;enumeration value="wrongFilter"/>
 *     &lt;enumeration value="wrongOrder"/>
 *     &lt;enumeration value="wrongPartner"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DenyReasonEnum")
@XmlEnum
public enum DenyReasonEnum {

    @XmlEnumValue("unknownReason")
    UNKNOWN_REASON("unknownReason"),
    @XmlEnumValue("wrongCatalogue")
    WRONG_CATALOGUE("wrongCatalogue"),
    @XmlEnumValue("wrongFilter")
    WRONG_FILTER("wrongFilter"),
    @XmlEnumValue("wrongOrder")
    WRONG_ORDER("wrongOrder"),
    @XmlEnumValue("wrongPartner")
    WRONG_PARTNER("wrongPartner");
    private final String value;

    DenyReasonEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DenyReasonEnum fromValue(String v) {
        for (DenyReasonEnum c: DenyReasonEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}