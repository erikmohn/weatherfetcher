
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TravelTimeTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TravelTimeTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="best"/>
 *     &lt;enumeration value="estimated"/>
 *     &lt;enumeration value="instantaneous"/>
 *     &lt;enumeration value="reconstituted"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TravelTimeTypeEnum")
@XmlEnum
public enum TravelTimeTypeEnum {

    @XmlEnumValue("best")
    BEST("best"),
    @XmlEnumValue("estimated")
    ESTIMATED("estimated"),
    @XmlEnumValue("instantaneous")
    INSTANTANEOUS("instantaneous"),
    @XmlEnumValue("reconstituted")
    RECONSTITUTED("reconstituted");
    private final String value;

    TravelTimeTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TravelTimeTypeEnum fromValue(String v) {
        for (TravelTimeTypeEnum c: TravelTimeTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
