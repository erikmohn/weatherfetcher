
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ColourEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ColourEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="amber"/>
 *     &lt;enumeration value="blue"/>
 *     &lt;enumeration value="green"/>
 *     &lt;enumeration value="red"/>
 *     &lt;enumeration value="white"/>
 *     &lt;enumeration value="whiteYellow"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ColourEnum")
@XmlEnum
public enum ColourEnum {

    @XmlEnumValue("amber")
    AMBER("amber"),
    @XmlEnumValue("blue")
    BLUE("blue"),
    @XmlEnumValue("green")
    GREEN("green"),
    @XmlEnumValue("red")
    RED("red"),
    @XmlEnumValue("white")
    WHITE("white"),
    @XmlEnumValue("whiteYellow")
    WHITE_YELLOW("whiteYellow");
    private final String value;

    ColourEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ColourEnum fromValue(String v) {
        for (ColourEnum c: ColourEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
