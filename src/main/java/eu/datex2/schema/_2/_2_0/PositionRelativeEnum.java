
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PositionRelativeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PositionRelativeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="above"/>
 *     &lt;enumeration value="below"/>
 *     &lt;enumeration value="toTheLeft"/>
 *     &lt;enumeration value="toTheRight"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PositionRelativeEnum")
@XmlEnum
public enum PositionRelativeEnum {

    @XmlEnumValue("above")
    ABOVE("above"),
    @XmlEnumValue("below")
    BELOW("below"),
    @XmlEnumValue("toTheLeft")
    TO_THE_LEFT("toTheLeft"),
    @XmlEnumValue("toTheRight")
    TO_THE_RIGHT("toTheRight");
    private final String value;

    PositionRelativeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PositionRelativeEnum fromValue(String v) {
        for (PositionRelativeEnum c: PositionRelativeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
