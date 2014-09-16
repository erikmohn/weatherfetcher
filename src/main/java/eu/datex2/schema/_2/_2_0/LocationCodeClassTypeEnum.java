
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LocationCodeClassTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LocationCodeClassTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="area"/>
 *     &lt;enumeration value="line"/>
 *     &lt;enumeration value="point"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LocationCodeClassTypeEnum")
@XmlEnum
public enum LocationCodeClassTypeEnum {

    @XmlEnumValue("area")
    AREA("area"),
    @XmlEnumValue("line")
    LINE("line"),
    @XmlEnumValue("point")
    POINT("point");
    private final String value;

    LocationCodeClassTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LocationCodeClassTypeEnum fromValue(String v) {
        for (LocationCodeClassTypeEnum c: LocationCodeClassTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
