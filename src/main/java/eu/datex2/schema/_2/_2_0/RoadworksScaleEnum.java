
package eu.datex2.schema._2._2_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RoadworksScaleEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RoadworksScaleEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="major"/>
 *     &lt;enumeration value="medium"/>
 *     &lt;enumeration value="minor"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RoadworksScaleEnum")
@XmlEnum
public enum RoadworksScaleEnum {

    @XmlEnumValue("major")
    MAJOR("major"),
    @XmlEnumValue("medium")
    MEDIUM("medium"),
    @XmlEnumValue("minor")
    MINOR("minor");
    private final String value;

    RoadworksScaleEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RoadworksScaleEnum fromValue(String v) {
        for (RoadworksScaleEnum c: RoadworksScaleEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
